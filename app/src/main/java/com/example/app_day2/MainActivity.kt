package com.example.app_day2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bt_save.setOnClickListener {
            var intent  = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }

    override fun onRestart() {
        super.onRestart()
        d("AAA","welcome back")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.w("AAA","on destoyed")
    }

}