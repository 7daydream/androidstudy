package com.youngdean.a11_nullsafety

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myName : String = "메시"
        var number : Int? = null // nullabel : null을 넣을 수 있는 상태라고 알려주는것
        var newVariable : Activity? = null

        Log.d("null", "문자열의 길이는 = ${myName.length}")

        var number2 : Int = 30

        // number.plus(30)이건 안되지만 아래는 됨 Null Pointer Exception
        var result = number2.plus(50)

        //대신 아래처럼 하면 가능
        var result2 = number?.plus(50) ?: 51// Safe Call

        var result3 = result2.plus(50) // number가 nullable이기 때문에 result를 이용한 연산에 문제가 발생할 수 있음. 이 경우 ?:(Elvis Expression)  표시법을 이용해서 디폴트값을 지정하고 안정성을 높임임
    }
}