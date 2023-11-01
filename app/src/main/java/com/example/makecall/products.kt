package com.example.makecall

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class products : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)
        val shart1= findViewById<ImageView>(R.id.imageView3)
        val shart2= findViewById<ImageView>(R.id.imageView4)
        val shart3= findViewById<ImageView>(R.id.imageView5)

        shart1.setOnClickListener {
            intent= Intent(applicationContext, product_description::class.java)
            startActivity(intent)
        }
        shart2.setOnClickListener {
            intent= Intent(applicationContext, product_description::class.java)
            startActivity(intent)
        }
        shart3.setOnClickListener {
            intent= Intent(applicationContext, product_description::class.java)
            startActivity(intent)
        }
    }
}