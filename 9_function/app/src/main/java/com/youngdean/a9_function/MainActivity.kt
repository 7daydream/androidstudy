package com.youngdean.a9_function

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        function1()
        functionParam("Hi", 3)
        var pi = getPi()
        Log.d("function3", "${getPi()}")
    }

    //기본 함수
    fun function1() {
        // 코드블록
        Log.d("function1", "function1 실행")
    }

    //입력값이 있는 함수
    fun functionParam(param1 : String, param2: Int) {
        Log.d("function2" , "param1 : ${param1}, param2 : ${param2}")
    }

    //출력값이 있는 함수
    fun getPi() : Double {
        return 3.14159265358979323846264338327950
    }

    //함수를 사용하는 용도 > 코드를 분류하기 위해서
}