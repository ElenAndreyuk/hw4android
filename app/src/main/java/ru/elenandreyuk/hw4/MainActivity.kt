package ru.elenandreyuk.hw4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isNotEmpty
import androidx.core.widget.doAfterTextChanged
import ru.elenandreyuk.hw4.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initActivityState()
    }

    private fun checkConditions(): Boolean {
        val conditionNameField = binding.username.editText.toString().length in 1..40
        val conditionPhoneField = binding.userPhone.isNotEmpty()
        val conditionGenderIsChecked = binding.gender.checkedRadioButtonId!=-1

        val conditionNotificationSwitch = (binding.switchNotification.isChecked &&
                (binding.authorizationNotification.isChecked ||
                binding.newsNotification.isChecked))
        return conditionGenderIsChecked && conditionNameField
                && conditionPhoneField && conditionNotificationSwitch
    }

    private fun changeSaveButtonState() {
        if (checkConditions()) {
            binding.buttonSave.isEnabled = true
        } else {
            binding.buttonSave.isEnabled = false
        }
    }

    private fun initActivityState() {
        val numberOfPoints = Random.nextInt(101)
        binding.linearProgress.secondaryProgress = numberOfPoints
        binding.countOfPoints.text = String.format(getString(R.string.points_of_number, numberOfPoints))
        binding.newsNotification.setOnCheckedChangeListener { _, _ -> changeSaveButtonState()}
        binding.authorizationNotification.setOnCheckedChangeListener { _, _ -> changeSaveButtonState()}
        binding.textInputName.doAfterTextChanged { changeSaveButtonState() }
        binding.textInputPhone.doAfterTextChanged {changeSaveButtonState()
        }


        binding.switchNotification.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                binding.authorizationNotification.isEnabled = true
                binding.newsNotification.isEnabled = true
                changeSaveButtonState()
            } else {
                binding.authorizationNotification.isEnabled = !binding.authorizationNotification.isEnabled
                binding.newsNotification.isEnabled = !binding.newsNotification.isEnabled
                binding.authorizationNotification.isChecked = false
                binding.newsNotification.isChecked = false
                changeSaveButtonState()
            }
        }


        binding.gender.setOnCheckedChangeListener { _, _ ->
            changeSaveButtonState()
        }

        binding.buttonSave.setOnClickListener {
            Toast.makeText(this, R.string.toast_text, Toast.LENGTH_SHORT).show()
        }
    }

}