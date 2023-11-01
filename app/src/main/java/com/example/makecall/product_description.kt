package com.example.makecall

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class product_description : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_description)

        val previous= findViewById<ImageView>(R.id.imageView6)

        previous.setOnClickListener {
            intent= Intent(applicationContext, products::class.java)
            startActivity(intent)
        }
        title = "KotlinApp"
        }
    fun call(view:View) {
        val dialIntent= Intent(Intent.ACTION_DIAL)
        dialIntent.data = Uri.parse("tel:" + "8801737827759")
        startActivity(dialIntent)
    }
}