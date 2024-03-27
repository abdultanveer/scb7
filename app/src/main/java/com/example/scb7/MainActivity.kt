package com.example.scb7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickHandler(view: View) {
        var tv: TextView = findViewById(R.id.textview)
        var etName:EditText = findViewById(R.id.etName)
        var name = etName.text.toString()
        tv.setText(name)


    }

    fun launchHome(view: View) {
        //Intent hIntent = new Intent();
        var hIntent = Intent(this,HomeActivity::class.java)
        startActivity(hIntent)

    }
}