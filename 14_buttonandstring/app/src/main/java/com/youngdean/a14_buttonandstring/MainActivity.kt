package com.youngdean.a14_buttonandstring

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.youngdean.a14_buttonandstring.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}