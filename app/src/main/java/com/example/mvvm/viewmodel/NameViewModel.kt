package com.example.mvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm.model.NameRepository

class NameViewModel : ViewModel(){

    private val nameRepository = NameRepository()

    fun getNames(): LiveData<List<String>> {
        return nameRepository.getNames()
    }

}