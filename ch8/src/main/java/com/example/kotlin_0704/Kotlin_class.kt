package com.example.kotlin_0704

fun main(){
    //클래스 선언
    class User{
        var name = "jin"
        constructor(name:String){
            this.name = name // constructor 생성자 선언 함수
        }
        fun someFun(){
            print("name $name")
        }
        inner class SomeClass{}
    }
    val user = User("asdsadd")
    user.someFun()

    //상속
     open class Super{ // 상속 할 수 있게 open 키워드 사용 상위클래스

     }
    class Sub: Super(){ // Super 상속받아 Sub 클래스 선언

    }
    //데이터 클래스 선언 data 클래시 이용시 객체의 데이터를 비교 할 때 훨씬 편리
    data class DataClass(val name:String)
    //오브젝트 클래스 (익명클래스) 타입을 지정해서 사용 !
    val obj = object {
        var data = 10
    }
    obj.data = 20 // 오류
    //컴패니언 클래스 java의 static
   MyClass.data // 사용가능
}
class MyClass {
    companion object{
        var data = 10
    }
}