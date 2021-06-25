package com.youngdean.recyclerviewprac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.youngdean.recyclerviewprac.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        //스피너에서 사용할 가상의 데이터셋
        val data = listOf("-선택하세요-", "월", "화", "수", "목","금","토","일")

        // 스피너같은 컨테이너에 데이터를 세팅해주는데 어댑터를 통해 데이터의 모양을 바꿔줄 수 있음
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data)

        binding.spinner.adapter = adapter

        // 스피너 선택값을 textView에 보여주고 싶을 때
        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val selectedValue = data[position]
                binding.textView.text = selectedValue
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }
    }
}