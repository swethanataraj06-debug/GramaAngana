package com.swetha.gramaangana

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class BookingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking)

        val name = findViewById<EditText>(R.id.etName)
        val phone = findViewById<EditText>(R.id.etPhone)
        val purpose = findViewById<EditText>(R.id.etPurpose)
        val date = findViewById<EditText>(R.id.etDate)
        val submit = findViewById<Button>(R.id.btnSubmit)

        // 📅 Date Picker
        date.setOnClickListener {
            val calendar = Calendar.getInstance()

            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val day = calendar.get(Calendar.DAY_OF_MONTH)

            val datePicker = DatePickerDialog(
                this,
                { _, selectedYear, selectedMonth, selectedDay ->
                    date.setText("$selectedDay/${selectedMonth + 1}/$selectedYear")
                },
                year, month, day
            )

            datePicker.show()
        }

        // ✅ Submit Button
        submit.setOnClickListener {

            val userName = name.text.toString()
            val userPhone = phone.text.toString()
            val userPurpose = purpose.text.toString()
            val userDate = date.text.toString()

            if (userName.isEmpty() || userPhone.isEmpty() ||
                userPurpose.isEmpty() || userDate.isEmpty()
            ) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Booking Submitted Successfully", Toast.LENGTH_LONG).show()

                // 🔄 Clear fields after submit
                name.text.clear()
                phone.text.clear()
                purpose.text.clear()
                date.text.clear()
            }
        }
    }
}