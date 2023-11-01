package com.example.makecall

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class startpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_startpage)

        val button= findViewById<Button>(R.id.button)

        button.setOnClickListener {
            intent= Intent(applicationContext, products::class.java)
            startActivity(intent)
        }
    }
}