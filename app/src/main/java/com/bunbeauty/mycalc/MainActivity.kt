package com.bunbeauty.mycalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    /**
     * 1. Создать функцию sum, параметры функции 2 int, возращает сумму этих чисел
     * 2. Создать переменную кнопки с именем calculateButton, добавить ей setOnClickListener {  } (в интеренет можешь посмотреть)
     * 3. Создать переменную текст вью с именем resultTextView, положить туда результат суммы
     * из  firstValueEditText и secondValueEditText используя функцию sum
     * Пример как работать с поиском и инициализацией вью у тебя в методе OnCreate()
     */

    /**
     * 1.Создадим объект калькулятор
     * 2.Вызовем у него методы вычислений
     * 3.Сохраним знак в кеш поля класса
     * 4.Работа с when
     * 5.Добавили enum, sign
     * 6.Рефакторинг
     * 7.Добавили interface ICalculator
     * 8.Залить проект на гитхаб
     */

    var calculateButton: MaterialButton? = null

    var resultTextView: TextView? = null

    var secondValueEditText: EditText? = null

    var firstValueEditText: EditText? = null

    var minusTextView: TextView? = null

    var plusTextView: TextView? = null

    var multiplyTextView: TextView? = null

    var divideTextView: TextView? = null

    var sign: Sign = Sign.PLUS//step 3


    //lateinit var firstValue: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firstValueEditText = findViewById(R.id.activity_main_et_first_value) // поиск вью

        secondValueEditText = findViewById(R.id.activity_main_et_second_value) // поиск вью

        resultTextView = findViewById(R.id.activity_main_tv_result)

        val calculator = Calculator()//создание объекта 1

        calculateButton = findViewById(R.id.activity_main_btn_calculate)
        calculateButton?.setOnClickListener {
            resultTextView?.text =
                calculator.calculate(
                    sign,
                    firstValueEditText?.text.toString().toInt(),
                    secondValueEditText?.text.toString().toInt()
                )
        }
        minusTextView = findViewById(R.id.activity_main_tv_minus)
        minusTextView?.setOnClickListener {
            sign = Sign.MINUS
            clearOperators()
            minusTextView?.setBackgroundResource(R.color.yellow)
        }
        plusTextView = findViewById(R.id.activity_main_tv_plus)
        plusTextView?.setOnClickListener {
            sign = Sign.PLUS
            clearOperators()
            plusTextView?.setBackgroundResource(R.color.yellow)
        }
        multiplyTextView = findViewById(R.id.activity_main_tv_multiply)
        multiplyTextView?.setOnClickListener {
            sign = Sign.MULTIPLY
            clearOperators()
            multiplyTextView?.setBackgroundResource(R.color.yellow)
        }
        divideTextView = findViewById(R.id.activity_main_tv_divide)
        divideTextView?.setOnClickListener {
            sign = Sign.DIVIDE
            clearOperators()
            divideTextView?.setBackgroundResource(R.color.yellow)
        }
    }

    fun clearOperators() {
        minusTextView?.setBackgroundResource(R.color.white)
        plusTextView?.setBackgroundResource(R.color.white)
        multiplyTextView?.setBackgroundResource(R.color.white)
        divideTextView?.setBackgroundResource(R.color.white)
    }


    override fun onStart() {
        super.onStart()
        val t = 0
    }

    override fun onResume() {
        super.onResume()
        val t = 0

    }

    override fun onPause() {
        super.onPause()
        val t = 0
    }

    override fun onStop() {
        super.onStop()
        val t = 0
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}