package com.example.scb7

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var TAG = MainActivity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG,"created -mem allocated")
    }


    override fun onStart() {
        super.onStart()
        Log.v(TAG,"started - visible")

    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG,"resumed - waking up -- restore state")
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG,"paused- sleep-save state of ur  app")

    }

    override fun onStop() {
        super.onStop()
        Log.w(TAG,"stopped --hibernate")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"destroyed --purged --release resources")

    }


    fun clickHandler(view: View) {
        var tv: TextView = findViewById(R.id.textview)
        var etName:EditText = findViewById(R.id.etName)
        var name = etName.text.toString()
        tv.setText(name)


    }

    fun launchHome(view: View) {
        //Intent hIntent = new Intent();
        sum(10,20)
        var hIntent = Intent(this,HomeActivity::class.java)
        hIntent.putExtra("nkey","abdul ansari")
        startActivity(hIntent)

    }

    private fun sum(i: Int, i1: Int):Int {
        var d = 20
        var e = d * i

        return i + i1

    }

    fun launchDialer(view: View) {
        var dIntent = Intent(Intent.ACTION_DIAL,Uri.parse("tel:9876543212"))
        startActivity(dIntent)
    }

    fun createAlarm(message: String, hour: Int, minutes: Int) {
        val intent = Intent(AlarmClock.ACTION_SET_ALARM).apply {
            putExtra(AlarmClock.EXTRA_MESSAGE, message)
            putExtra(AlarmClock.EXTRA_HOUR, hour)
            putExtra(AlarmClock.EXTRA_MINUTES, minutes)
        }
       // if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
       // }
    }

    fun setAlarm(view: View) {
        createAlarm("scb7",12,36)
    }
}