package com.example.scb7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerActivity : AppCompatActivity() {

    var countries = arrayOf("India","USA","UK","Russia","China",
        "India","USA","UK","Russia","China",
        "India","USA","UK","Russia","China",
        "India","USA","UK","Russia","China",
        "India","USA","UK","Russia","China",
        "India","USA","UK","Russia","China",
        "India","USA","UK","Russia","China",
        "India","USA","UK","Russia","China",
        "India","USA","UK","Russia","China",
        "India","USA","UK","Russia","China",)
    lateinit var cRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        cRecyclerView = findViewById(R.id.recyclerView)
        var cAdapter = CAdapter(countries)
        cRecyclerView.layoutManager = LinearLayoutManager(this)
        cRecyclerView.adapter = cAdapter
    }
}