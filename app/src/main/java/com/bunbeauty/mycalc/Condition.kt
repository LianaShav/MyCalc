package com.bunbeauty.mycalc

class Condition {
    //Если isRed это true
    //В переменную color устанавливаем значение Red
    //Если isRed это false
    //В переменную color устанавливаем значение notRed
    fun example() {
        val isRed = false
        var color = ""

        if (isRed) {
            color = "red"
        } else {
            color = "notRed"
        }

        val jim = "jim"

        if (jim == "jim") {
            true
        } else {
            false
        }

        if (jim != "jim") {
            true
        } else {
            false
        }

        val five = 5

        if (five < 5) { //<=
            true
        } else {
            false
        }
    }
}