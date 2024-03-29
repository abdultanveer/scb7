package com.example.scb7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.lifecycle.asLiveData
import com.example.scb7.data.Item
import com.example.scb7.data.ItemDao
import com.example.scb7.data.ItemRoomDatabase
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class HomeActivity : AppCompatActivity() {
    lateinit var tvHome:TextView
   lateinit var dao: ItemDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
      var  database = ItemRoomDatabase.getDatabase(this)
        dao = database.itemDao()
    }

    override fun onStart() {
        super.onStart()
        //throw NullPointerException("execption demo")

    }

    fun commitDb(view: View) {
        var item = Item(123,"itemsname",20.0,20)
        //globalscope -- structured concurrency
        //launch = coroutine
        GlobalScope.launch {
            dao.insert(item)
        }
    }

    fun retreiveDb(view: View) {
        var tvDb:TextView = findViewById(R.id.tvDb)
        retrieveItem(123).observe(this){
            itemRetreived -> tvDb.text = itemRetreived.toString()
        }

    }

    fun retrieveItem(id: Int): LiveData<Item> {
        return dao.getItem(id).asLiveData()

    }
}