package com.example.mvvmproject2

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [Quote::class],version=1)
abstract class QuoteDatabase : RoomDatabase() {

    abstract fun quoteDao(): QuoteDao

    companion object{
        var Instance:QuoteDatabase?=null
        fun get_database(context : Context): QuoteDatabase {
            if (Instance==null){
                synchronized(this){
                Instance= Room.databaseBuilder(
                    context,
                    QuoteDatabase::class.java,
                    "quote_database"
                )
                    .createFromAsset("quotes.db")
                    .build()
                }
            }
            return Instance!!
        }

    }

}

