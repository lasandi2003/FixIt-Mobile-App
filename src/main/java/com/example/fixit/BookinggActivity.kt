package com.example.fixit

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class BookinggActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bookingscreen)

        // Initialize the ImageView button
        val bookingProfileBtn = findViewById<ImageView>(R.id.bookingprofilebtn)

        // Set click listener to navigate to ProfileScreenActivity
        bookingProfileBtn.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}