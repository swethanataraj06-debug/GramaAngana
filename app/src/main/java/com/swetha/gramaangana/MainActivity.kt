package com.swetha.gramaangana

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalendar = findViewById<Button>(R.id.btnCalendar)
        val btnBooking = findViewById<Button>(R.id.btnBooking)
        val btnMaintenance = findViewById<Button>(R.id.btnMaintenance)
        val btnEvents = findViewById<Button>(R.id.btnEvents)

// 1️⃣ Calendar
        btnCalendar.setOnClickListener {
            startActivity(Intent(this, CalendarActivity::class.java))
        }

// 2️⃣ Booking
        btnBooking.setOnClickListener {
            startActivity(Intent(this, BookingActivity::class.java))
        }

// 3️⃣ Maintenance
        btnMaintenance.setOnClickListener {
            startActivity(Intent(this, MaintenanceActivity::class.java))
        }

// 4️⃣ Events
        btnEvents.setOnClickListener {
            startActivity(Intent(this, EventsActivity::class.java))
        }
    }
}