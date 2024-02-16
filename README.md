Создайте экран профиля пользователя, к элементам которого примененыстили и который имеет следующий вид:
Экран состоит из следующих компонентов:
1. Фото пользователя. Квадратное изображение размером 120 ×120dp. Добавьте подходящее изображение.
Для оптимального отображениякартинки попробуйте воспользоваться разными scale type.
2. Имя. Поле для ввода текста. Текстовая клавиатура, ограничениенаввод— не более 40 символов. Доступна опция удаления текста.
3. Телефон. Поле для ввода текста. Тип ввода —номер телефона. Применён стиль FilledBox, цвет фона — фиолетовый (#BB86FC).
4. Заголовок «Пол». Стиль: размер текста — 16 sp, цвет текста —чёрный(#000000).
5. RadioGroup с заголовком для выбора пола.
6. Switch для включения/отключения уведомлений.
7. Два checkbox для выбора уведомлений, которые пользователь хочетполучать. Стиль: цвет — бирюзовый (#03DAC5).
8. Заголовок «Баллы». Стиль: размер текста —16 sp, цвет текста—чёрный (#000000).
9. Линейный прогресс отображает количество баллов пользователяот0до100.
10. Текстовая информация о количестве баллов. Стиль: размер текста—16 sp, цвет текста — серый (#444444).
11. Кнопка сохранения. Требования к стилям
● Стили текстов применяются через textAppearance.
● Похожие стили наследуются друг от друга (заголовки и количествобаллов).
● Стили checkbox применяются в теме (атрибут в теме checkboxStyle—поаналогии с materialButtonStyle из видео, базовый стиль
—для CheckboxWidget.Material3.CompoundButton.CheckBox).
Настройки темы
Используя свои цвета, переопределите атрибуты темы colorPrimary, colorSecondary и другие.
Изучите, каким образом будет меняться внешнийвидэлементов, к которым вы не применяли собственные стили. Логика работы Switch — переключателя уведомлений
Если Switch выключен, список получаемых уведомлений блокируется. Иначепользователь может выбирать из множественного списка

Логика работы линейного прогресса
Установите значение прогресса и текстового поля, описывающее прогрессслучайным образом с помощью
Random.nextInt(101)
который вернёт число от 0 до 100 включительно. Логика работы кнопки «Сохранить»
Кнопка активна, если выполняются все следующие условия:
1. значение в поле «Имя» введено корректно, то есть поле не пустоеиколичество символов не превышает 40;
2. значение в поле «Телефон» введено корректно, то есть поле непустое;
3. выбран пол;
4. если активен переключатель, должен быть выбран хотя быодинвидуведомлений. При нажатии на активную кнопку «Сохранить»
5. показывается уведомлениеотом, что информация сохранена.

6. Для показа уведомления о сохранении можно использовать Snackbar илиToast. Если нарушено хотя бы одно из условий a–d, кнопка «Сохранить» неактивна.
7. Порядок действий
1. Создайте пустой Android-проект. Убедитесь, что подключена библиотекаMaterial Design.
2. Подготовьте стили и темы, необходимые для проекта, добавьтересурсы. Найдите подходящее изображение для профиля.
3. Сверстайте layout по предложенному макету, примените все необходимые свойства для компонентов, чтобы их внешний
видиповедение соответствовали заявленным требованиям.
4. Последний шаг — это код. Опишите логику программы в главномActivity. Подпишитесь на уведомления об изменениях компонентов и на
основании получаемых данных принимайте решения. Советы и рекомендации
● Чётко следуйте плану. Начать лучше с ресурсов проекта и вёрстки.
● За блокировку view отвечает свойство isEnabled.
● Выносите значения строк, размерностей, цветов в ресурсы.
● При проверке условий используйте логическое И (&&), когда требуетсявыполнение всех частей. A && B истинно тогда и только тогда,
когдаиAи B истинны. Когда достаточно выполнения хотя бы одного из условий, используйтелогическое ИЛИ (||). A || B истинно,
когда истинно только А, толькоB, иАи B.
Что оценивается
● UI содержит все необходимые компоненты, применены необходимыестили, тема настроена.
● Логика программы не нарушена. ● Нет критичных багов и вылетов.
● Код чистый, у переменных и компонентов понятные названия, соблюдаются принципы ООП-.