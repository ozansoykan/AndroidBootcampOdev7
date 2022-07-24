package com.ozansoykan.todoapphomework.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ozansoykan.todoapphomework.data.entity.Isler

@Database(entities = [Isler::class], version = 1)
abstract class Veritabani : RoomDatabase() {
    abstract fun getIslerDao() : KisilerDao
}