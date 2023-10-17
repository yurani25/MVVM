package com.example.mvvm.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class NameRepository {
    private val names = MutableLiveData<List<String>>()

    fun getNames(): LiveData<List<String>> {

        names.value = listOf("Alice", "Bob", "Charlie", "David")
        return names
    }

}