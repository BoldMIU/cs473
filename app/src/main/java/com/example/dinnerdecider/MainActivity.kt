package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var list = ArrayList<String>(arrayListOf("Hamburger", "Pizza", "Mexican", "American", "Chinese"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun decide(view: android.view.View) {
        var textView = findViewById<TextView>(R.id.foodexplore)

        textView.text = list.random()

    }

    fun add(view: android.view.View) {
        var editText = findViewById<EditText>(R.id.insert)
        var food = editText.text.toString()
        if(editText.text.isEmpty()) {
            Toast.makeText(applicationContext, "Please put food name", Toast.LENGTH_SHORT).show()
        }

        else {
            list.add(food)
            Toast.makeText(applicationContext, "Added!", Toast.LENGTH_SHORT).show()
            editText.text.clear()
            }

    }


}