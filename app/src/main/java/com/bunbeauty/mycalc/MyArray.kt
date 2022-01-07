package com.bunbeauty.mycalc

class MyArray {

    val temperature = 10
    val temperature1 = 9
    val temperature2 = 8

    val array = arrayListOf<Int>()//массив

    //1) Если число положительное  эта функция должна вернуть true
    //2) Если число положительное функция должна добавить его в массив
    //3) Если число отрицательное функция должна вернуть false
    fun addPositiveElement(value: Int): Boolean {
        if (value > 0) {
            array.add(value)
            return true
        } else {
            return false
        }
    }
    //1) Если число отрицательное  эта функция должна вернуть true
    //2) Если число отрицательное функция должна добавить его в массив
    //3) Если число положительное функция должна вернуть false

    fun addNegativeElement(value: Int): Boolean {
        if (value < 0) {
            array.add(value)
            return true
            }else{
                return false
        }
    }


    fun removeElement(value: Int): Boolean {
        return false
    }

    fun operators() {
        //[10, 9, 8]
        array.clear() //[] удалит все
        array.remove(10) //[9, 8]удалит 10
        array.add(7)//[9,8,7]добавит 7
        array.size //3размер массива
        array.isEmpty() //false-пустой или нет
        array.contains(9) //true-содержится или нет
        val nine = array[1]//получаешь эл по индексу
    }

}