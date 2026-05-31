package com.example.fixit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DetailScreen2Activity : AppCompatActivity() {

    private lateinit var btnBookNow2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detailscreen2) // your existing detail layout

        // Initialize Book Now button
        btnBookNow2 = findViewById(R.id.btnBookNow2)

        // Set click listener to navigate to BookingActivity
        btnBookNow2.setOnClickListener {
            val intent = Intent(this@DetailScreen2Activity, BookinggActivity::class.java)
            startActivity(intent)
        }
    }
}

