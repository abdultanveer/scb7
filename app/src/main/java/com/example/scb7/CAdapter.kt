package com.example.scb7

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CAdapter(var countries: Array<String>) : RecyclerView.Adapter<CViewHolder>() {
    var TAG = CAdapter::class.java.simpleName
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CViewHolder {
        Log.i(TAG,"alok bought a row plank")
        //inflate row_item.xml -- create its corresponding mem vars
        var row_plank:View = LayoutInflater.from(parent.context).inflate(R.layout.row_item,parent,false)
        return  CViewHolder(row_plank)
    }

    override fun getItemCount(): Int {
        Log.i(TAG,"vamsi is counting no of items in dataset")
        return countries.size
    }

    override fun onBindViewHolder(holder: CViewHolder, position: Int) {
        var country = countries[position]
        holder.tvRowItem.text = country
        Log.i(TAG,"hari is writing on the row --"+country)

    }
}

//reserve box for row planks
class CViewHolder(rowView: View):RecyclerView.ViewHolder(rowView) {
    var tvRowItem = rowView.findViewById<TextView>(R.id.tvRow)


}
