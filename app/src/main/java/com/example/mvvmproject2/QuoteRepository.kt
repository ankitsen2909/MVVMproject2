package com.example.mvvmproject2

import androidx.lifecycle.LiveData



class QuoteRepository(private val dao:QuoteDao) {

    fun getQuotes(): LiveData<List<Quote>>{
        return dao.getQuotes()
    }

     fun insertQuotes(quote: Quote){
        dao.insertQuote(quote)
     }


}