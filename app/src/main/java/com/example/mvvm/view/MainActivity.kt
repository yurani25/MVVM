package com.example.mvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm.R
import com.example.mvvm.viewmodel.NameViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nameViewModel = ViewModelProvider(this).get(NameViewModel::class.java)

        val namesTextView = findViewById<TextView>(R.id.namesTextView)

        nameViewModel.getNames().observe(this, Observer { names ->
            namesTextView.text = names.joinToString("\n")
        })
    }
}