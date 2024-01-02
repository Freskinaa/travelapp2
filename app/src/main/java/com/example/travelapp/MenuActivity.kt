package com.example.travelapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val textViewHome: TextView = findViewById(R.id.textView)
        val imageViewHome: ImageView = findViewById(R.id.imageView1)
        val imageViewArrow: ImageView = findViewById(R.id.imageView5)

        textViewHome.setOnClickListener {
            navigateToSecondActivity()
        }
        imageViewHome.setOnClickListener {
            navigateToSecondActivity()
        }
        imageViewArrow.setOnClickListener {
            navigateToSecondActivity()
        }

    }
    private fun navigateToSecondActivity() {
        val intent = Intent(this@MenuActivity, SecondActivity::class.java)
        startActivity(intent)
    }
}
