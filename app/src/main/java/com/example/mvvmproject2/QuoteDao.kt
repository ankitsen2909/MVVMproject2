package com.example.mvvmproject2

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query



@Dao
interface QuoteDao {

    @Query("SELECT * from `table`")
    fun getQuotes() : LiveData<List<Quote>>

    @Insert
     fun insertQuote(quote: Quote)

}