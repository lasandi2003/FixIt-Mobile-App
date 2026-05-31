package com.example.fixit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class DetailScreen1Activity : AppCompatActivity() {

    private lateinit var btnBookNow1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detailscreen1) // your existing detail layout

        // Initialize Book Now button
        btnBookNow1 = findViewById(R.id.btnBookNow2)

        // Set click listener to navigate to BookingActivity
        btnBookNow1.setOnClickListener {
            val intent = Intent(this@DetailScreen1Activity, BookinggActivity::class.java)
            startActivity(intent)
        }
       val  backImg = findViewById<ImageView>(R.id.imageView)

        // Set click listener to navigate to BookingActivity
        backImg.setOnClickListener {
            val intent = Intent(this@DetailScreen1Activity, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}

