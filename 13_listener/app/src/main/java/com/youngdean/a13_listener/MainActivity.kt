package com.youngdean.a13_listener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.youngdean.a13_listener.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        //setContentView(R.layout.activity_main)
        setContentView(view)

        val listener = object : View.OnClickListener{
            override fun onClick(v: View?) {
                Log.d("리스너","클릭되었습니다.")
            }
        }

        binding.button3.setOnClickListener(listener)
    }
}