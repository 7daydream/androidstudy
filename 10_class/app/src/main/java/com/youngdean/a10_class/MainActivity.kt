package com.youngdean.a10_class

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //클래스를 사용하는 방법

        //1. 초기화
        var cls : class1 = class1() //class1을 초기화, 클래스의 상태가 메모리에 올라가며 인스턴스 상태가 됨.

        cls.variable
        cls.function1()

        //2. companion object로 만들기
        Log.d("태그", "메시지")

        // 상속에 대한 실습
        var child = Child()
        child.showMoney()

        var parent = Parent()
        parent.showhouse()
        var child2 = Child()
        child2.showhouse()

        // 오버라이딩과 비교되는 오버로드 실습, 메소드 이름이 같아도 파라미터에 따라 다른 메소드로 사용할 수 있음
        var son = Son()
        var result1 = son.getNumber()
        var result2 = son.getNumber("123")
        Log.d("오버로딩", "${result1}, ${result2}")
    }
}

/*
class Log {
    companion object { //companion object 블럭으로 감싸면 Log.d 평소 사용하듯이 초기화하기 않고 바로 사용이 가능능
       var variable = "난 누구"
        fun d(tag: String, msg: String) {
            print("[$tag] : $msg")
        }
    }
}*/

// 클래스란 변수(property)와 함수(method)의 모음
class class1 {

    init {
        // 클래스를 초기화하는 코드블럭 = 클래스를 메모리에 로드
    }

    var variable: String = " " // 클래스에서 정의된 변수 - 프로퍼티

    fun function1() {   // 클래서에서 정의된 함수 - 메소드
        var variable_local = " "
    }
}

// 상속을 사용하는 이유
// 1. 기존 작성된 코드를 재활용하기 위해서
// 2. 코드를 재활용하는데 체계적으로 구조로 사용하기 위해서

// 상속을 하는 클래스는 나는 상속을 해줄 수 있는 클래스라는 뜻으로 open을 사용해야함.
open class Parent {
    //아빠의 재산을 상속받는다고 생각하면
    var money = 5000000000
    open var house = "강남 200평 아파트" // 자식 클래스에서 오버라이드 하는 경우 open 예약어를 사용하여 override 할 수 있음을 알려줘야 함.

    //메솓도 마찬가지지
   open fun showhouse() {
        Log.d("클래스", "myhouse = ${house}")
    }
}

// 상속받은 대상의 값을 사용하기 위해서는 초기화를 해야함
class Child : Parent() {
    // 상속 받으면 부모 클래스의 프로퍼티와 메소드를 내 것처럼 사용이 가능

    override var house = "강남 10평 오피스텔" // 부모도 집이 있고 자식도 집이 있는 경우 override 사용!

    fun showMoney() {
        Log.d("클래스", "money = ${money}")
    }
    // 메소드도 마찬가지
    override fun showhouse() {
        Log.d("클래스", "myhouse = ${house}")
    }
}

class Son {
    fun getNumber() : Int {
        return 1
    }

    fun getNumber(param: String) : Int {
        return 3
    }
}