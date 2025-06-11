package com.example.a30day.model


data class Week(
    val weekNumber: Int,
    val days: List<Day>
)

data class Day(
    val dayNumber: Int,
    val title: String,
    val description: String,
    val imageRes: Int, // Reference to drawable image
    val resources: List<String>
)