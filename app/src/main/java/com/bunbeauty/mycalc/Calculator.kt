package com.bunbeauty.mycalc

class Calculator : ICalculator {

    //Это функция с именем Sum с параметрами( 1 парметр value с типом Int,вторым параметром
    // secondValue с типом Int и возвращаемым типом функции Int)
    private fun sum(value: Int, secondValue: Int): Int {
        return value + secondValue
    }

    private fun minus(value: Int, secondValue: Int): Int {
        return value - secondValue
    }

    private fun multiply(value: Int, secondValue: Int): Int {
        return value * secondValue
    }

    private fun divide(value: Int, userValue: Int): Int {
        if (userValue == 0) {
            return 0
        }
        return value / userValue
    }

    override fun calculate(sign: Sign, firstValue: Int, secondValue: Int): String {
        return when (sign) {
            Sign.PLUS -> {
                sum(firstValue, secondValue).toString()//вызов метода 2
            }
            Sign.MINUS -> {
                minus(firstValue, secondValue).toString()//вызов метода 2
            }
            Sign.MULTIPLY -> {
                multiply(firstValue, secondValue).toString()//вызов метода 2
            }
            Sign.DIVIDE -> {
                divide(firstValue, secondValue).toString()//вызов метода 2
            }
        }
    }
}