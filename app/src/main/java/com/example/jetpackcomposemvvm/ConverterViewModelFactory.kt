package com.example.jetpackcomposemvvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.jetpackcomposemvvm.data.ConverterRepository

class ConverterViewModelFactory(private val repository: ConverterRepository) : ViewModelProvider.NewInstanceFactory(){
    override fun <T : ViewModel> create(modelClass: Class<T>): T = ConverterViewModel(repository) as T
}