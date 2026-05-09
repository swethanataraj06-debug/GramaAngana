package com.swetha.gramaangana

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AdminActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin)

        val btnAddEvent = findViewById<Button>(R.id.btnAddEvent)
        val btnViewBooking = findViewById<Button>(R.id.btnViewBooking)
        val btnViewMaintenance = findViewById<Button>(R.id.btnViewMaintenance)
        val btnLogout = findViewById<Button>(R.id.btnLogout)

        // Add Event
        btnAddEvent.setOnClickListener {
            Toast.makeText(this, "Add Event Clicked", Toast.LENGTH_SHORT).show()
        }

        // View Bookings
        btnViewBooking.setOnClickListener {
            startActivity(Intent(this, BookingActivity::class.java))
        }

        // View Maintenance
        btnViewMaintenance.setOnClickListener {
            startActivity(Intent(this, MaintenanceActivity::class.java))
        }

        // Logout
        btnLogout.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }
}