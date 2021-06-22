package com.youngdean.a17_edittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.core.widget.addTextChangedListener
import com.youngdean.a17_edittext.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit private var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        val listener = object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // not yet
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // not yet
            }

            override fun afterTextChanged(s: Editable?) {
                //edittext에 8자 이상 입력되면 로그를 찍도록
                val current_text = s.toString()
                if(current_text.length >= 8) {
                    Log.d("에딧텍스트","${current_text}")
                }
            }

        }

        binding.radioGroup.setOnCheckedChangeListener { _, checkedId ->
            when(checkedId) {
                R.id.radioApple -> Log.d("라디오", "사과가 선택되었습니다.")
                R.id.radioBanana -> Log.d("라디오", "바나나가 선택되었습니다.")
                R.id.radioOrange -> Log.d("라디오", "오랜지가 선택되었습니다.")
            }
        }

        binding.editText.addTextChangedListener(listener)
    }
}