package com.example.scb7

import android.app.Application
import com.example.scb7.data.ItemRoomDatabase

class InventoryApplication:Application() {
    val database: ItemRoomDatabase by lazy { ItemRoomDatabase.getDatabase(this) }

}