package com.example.kotlin_0704

fun main(){
    //Any 최상위 클래스 모든타입의 데이터 할당
    val data1 : Any = 50
    val data2 : Any = "hi"
    //Unit 반환문이 없는 함수 특수한 상황 표현 Unit 객체만 대입 == void 랑 비슷
    val data3 : Unit = Unit
    fun some() : Unit // <- 생략가능.
    {
        println(10+20)
    }
    fun some1(data1: Int, data2:Int) : Int{
        return data1 * data2
    }
    println(some1(data2 = 20 ,data1=10)) // 매개변수명을 지정하여 호출. 명명된 매개변수

    //함수 선언 fun 함수명(매개변수명:타입): 반환 타입{..} 반환 타입 생략시 Unit 적용
    fun sum(no : Int): Int {
        var sum = 0
        for ( i in 1..no){
            sum +=1
        }
        return sum
    }
    val name : String = "jin"
    println("name: $name,sum:${sum(10)}, plus : ${10+20}") //$ 기호 사용 문자열 템플릿

    //컬렉션 타입 Array -배열 표현
    val data4 : Array<Int> = Array(3,{ 0 }) // 배열 선언 예시
    //배열 접근 []대괄호 set() , get () 함수 사용
    //기초 타입 배열 선언
    val data5 : IntArray = IntArray(3,{0})
    //배열 선언과 동시에 값 할당
    val data6 = arrayOf<Int>(10,50,60)
    //리스트 사용 예 불변
    var list = listOf<Int>(1,2,3)
    //가변리스트 사용 mutableList
    var mutableList = mutableListOf<Int>(10,20,30)
    mutableList.add(3,40) // add함수 사용가능
    mutableList.set(0,50) // set 함수 사용 가능

    //map 사용
    var map = mapOf<Int,Int>(Pair(1,2))
}