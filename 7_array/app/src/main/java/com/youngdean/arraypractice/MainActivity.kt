package com.youngdean.arraypractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var variable = 157

        // 배열
        var intArr : IntArray = IntArray(10)
        intArr[0] = 10

        var monthArr = CharArray(7)
        monthArr[0] = '월'
        monthArr[1] = '화'
        monthArr[2] = '수'
        monthArr[3] = '목'
        monthArr[4] = '금'
        monthArr[5] = '토'
        monthArr[6] = '일'

        // 컬렉션 : 배열과는 다르게 size를 측정하지 않고 동적임
        // 리스트(읽기만 가능), 뮤터블 리스트(수정 가능)
        var arrList = listOf("하하", "호호", "히히") //이후 수정 불가

        var list = mutableListOf<Int>() //타입을 명시해주어야 함 -> Generic
        // 값 넣기
        list.add(5) // 자동으로 index 0 번 생성
        list.add(10) // index 1번 생성

        // list[1] 로도 사용이 가능
        Log.d("컬렉션", "1번 인덱스(두 번째)의 값 = ${list.get(1)}")

        // 맵 : (key, value)형태로 지정
        var mutableMap = mutableMapOf<String, String>()
        mutableMap.put("키1", "값1")
        mutableMap.put("키2", "값2")

        // mutableMap["키1"] 로도 사용이 가능
        Log.d("컬렉션", "맵 변수 1의 값은 ${mutableMap.get("키1")}")
    }
}