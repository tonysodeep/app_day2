package com.example.app_day2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        iv_6.setOnClickListener{
            var intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
    }
}