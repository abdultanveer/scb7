package com.example.scb7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    lateinit var tvHome:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        tvHome = findViewById(R.id.tvHome)
       var name = intent.extras?.getString("nkey")
        tvHome.setText(name)
    }

    override fun onStart() {
        super.onStart()
        throw NullPointerException("execption demo")

    }
}