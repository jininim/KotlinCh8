package com.example.diceroller2

// Dice 클래스 정의 생성자 매개변수로 주사위 크기를 받음
class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }


}