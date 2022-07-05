package com.example.kotlin_0704

fun main(){
    //if-else 표현식
    var data = 10
    val result = if(data > 10){
        println("data> 10")
        true
    } else { //else 생략 불가능.
        println("data < 10")
        false
    }
    //조건문 when -> 조건에 정수가 아닌 다른 타입의 데이터도 사용 가능. 조건없이도 사용 가능
    when(data) {
        10 -> print("data is 10")
        20 -> print("data is 20")
        else ->{
            print("data is not valid data")
        }
    }

    //반복문 for while
    var sum = 0
    for (i in 1..10){// 1부터 10까지 1씩 증가 (1 until 10) - > 마지막 숫자 미포함
        sum += i
    }
    var data1 = arrayOf<Int>(1,2,3)
    for ( i in data1.indices){

    }
    // 인덱스와 데이터를 가져오는 withindex()함수 사용
    for ((index,value) in data1.withIndex()){

    }


}