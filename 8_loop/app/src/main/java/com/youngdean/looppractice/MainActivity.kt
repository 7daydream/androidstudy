package com.youngdean.looppractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var indexArray = intArrayOf(0,1,2,3,4,5,6,7,8)

        for (index in 10 downTo 1 step 2) {
            Log.d("반복문", "index=${index}")
        }

        for (value in indexArray) {
            Log.d("반복문1", "value=${value}")
        }

        //while
        var out = 0
        while(out < 3) {
            Log.d("반복문2", "out = ${out}")
            out = out + 1
        }

        //break,continue
        //break는 반복문 탈출
        //continue는 코드블럭의 처음으로 이동
        for(index in 0..10) {
            if(index > 6) break
            Log.d("반복문3", "현재 숫자 = ${index}")
        }
    }
}