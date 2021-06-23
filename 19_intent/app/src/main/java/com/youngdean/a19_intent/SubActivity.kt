package com.youngdean.a19_intent

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.youngdean.a19_intent.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySubBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        val param = intent.getStringExtra("param")
        Log.d("액티비티", "param = ${param}")

        binding.btnReturn.setOnClickListener {
            val intent = Intent()
            intent.putExtra("param2", "돌려드립니다.")
            //RESULT_OK는 정상적으로 sub 액티비티가 종료되었음을 알리는 코드
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }
}