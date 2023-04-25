package com.example.mvvmproject2

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras

class MainViewModelFactory(val repository: QuoteRepository): ViewModelProvider.Factory{

    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
        return MainViewModel(repository) as T
    }
}