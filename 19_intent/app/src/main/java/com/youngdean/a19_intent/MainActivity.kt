package com.youngdean.a19_intent

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.youngdean.a19_intent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val REQ_SUB = 99

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        binding.button.setOnClickListener {
            val intent = Intent(this, SubActivity::class.java)
            //다음 액티비티에 추가 정보를 전달하고 싶은 경우, param이란 이름으로 실제 값을 넣어서 전달함.
            intent.putExtra("param","실제 값")
            //그냥 startActivity(intent)만 사용해도 sub 액티비티로는 잘 넘길 수 있음
            //startActivity(intent)
            //하지만 startActivityForResult()를 이용하면 sub액티비티에서 finish()가 호출되어 액티비티가 종료했을 때 값을 받아와야 하는 경우 사용이 가능
            startActivityForResult(intent, REQ_SUB) // 플래그 값을 통해 onActivityResult() 호출 시 requestCode로 받아와서 처리가 가능, 보통은 상수로 정의하여 사용

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(resultCode == Activity.RESULT_OK) {
            val returnValue = data?.getStringExtra("param2") ?: "None"
            Log.d("액티비티", "돌려받은값 = ${returnValue}")
        }
    }
}