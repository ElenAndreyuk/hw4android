package ru.elenandreyuk.hw4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.EditText
import ru.elenandreyuk.hw4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val username = binding.username
//        username.setOnTouchListener { v, event ->
//            val DRAWABLE_RIGHT = 2
//
//            if (event.action == MotionEvent.ACTION_UP) {
//                if (event.rawX >= (username.right - username.compoundDrawables[DRAWABLE_RIGHT].bounds.width())) {
//                    username.setText("")
//                    return@setOnTouchListener true
//                }
//            }
//            false
//        }

//        val checkedRadioButtonId = radioGroup.checkedRadioButtonId // Returns View.NO_ID if nothing is checked.
//        radioGroup.setOnCheckedChangeListener { group, checkedId ->
//            // Responds to child RadioButton checked/unchecked
//        }
//
//// To check a radio button
//        radioButton.isChecked = true
//
//// To listen for a radio button's checked/unchecked state changes
//        radioButton.setOnCheckedChangeListener { buttonView, isChecked
//            // Responds to radio button being checked/unchecked
//        }

//        // To listen for a switch's checked/unchecked state changes
//        binding.switch_notification.setOnCheckedChangeListener { buttonView, isChecked
//            // Responds to switch being checked/unchecked
//        }

//        // Set error.
//        checkbox.errorShown = true
//
//// Optional listener:
//        checkbox.addOnErrorChangedListener { checkBox, errorShown ->
//            // Responds to when the checkbox enters/leaves error state
//        }
//
//// To set a custom accessibility label:
//        checkbox.errorAccessibilityLabel = "Error: custom error announcement."
    }
}