package com.swetha.gramaangana

object BookingStorage {

    private val bookingList = mutableListOf<String>()

    fun addBooking(name: String, phone: String) {
        val booking = "Name: $name\nPhone: $phone"
        bookingList.add(booking)
    }

    fun getBookings(): List<String> {
        return bookingList
    }
}