package com.example.mymusica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun showErrorName(){
        Toast.makeText(this, "El nombre de usuario no puede estar vacio", Toast.LENGTH_SHORT).show()
    }
}