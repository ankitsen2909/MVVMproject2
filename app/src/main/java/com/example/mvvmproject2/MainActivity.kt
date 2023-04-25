package com.example.mvvmproject2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.mvvmproject2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    lateinit var mvm : MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)

        val dao=QuoteDatabase.get_database(applicationContext).quoteDao()
        val repos=QuoteRepository(dao)

        mvm=ViewModelProvider(this,MainViewModelFactory(repos)).get(MainViewModel::class.java)


        mvm.getQuotes().observe(this, Observer {
            binding.quotes=it.toString()
        })
//
//        binding.fetch.setOnClickListener {
//            val quote = Quote(0, "This is testing", "Testing")
//            mvm.insertQuotes(quote)
//
//        }



    }
}