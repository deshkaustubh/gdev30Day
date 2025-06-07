package com.example.a30day.data

import com.example.a30day.R

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





val studyPlan = listOf(
    Week(
        weekNumber = 1,
        days = listOf(
            Day(1, "Introduction to Kotlin", "Learn the basics of Kotlin.", R.drawable.image_1, listOf("https://kotlinlang.org")),
            Day(2, "Variables & Data Types", "Understand Kotlin variables.", R.drawable.image_2, listOf("https://developer.android.com/kotlin")),
            Day(3, "Functions & Lambdas", "Explore Kotlin functions.", R.drawable.image_3, listOf("https://kotlinlang.org/docs/functions.html")),
            Day(4, "Control Flow", "Learn about loops and conditionals.", R.drawable.image_4, listOf("https://kotlinlang.org/docs/control-flow.html")),
            Day(5, "Collections & Arrays", "Understand lists, sets, and maps.", R.drawable.image_5, listOf("https://kotlinlang.org/docs/collections-overview.html")),
            Day(6, "Null Safety", "Avoid null pointer exceptions.", R.drawable.image_6, listOf("https://kotlinlang.org/docs/null-safety.html")),
            Day(7, "Object-Oriented Programming", "Learn classes, objects, and inheritance.", R.drawable.image_7, listOf("https://kotlinlang.org/docs/classes.html"))
        )
    ),
    Week(
        weekNumber = 2,
        days = listOf(
            Day(8, "Higher-Order Functions", "Functions that take functions as parameters.", R.drawable.image_8, listOf("https://kotlinlang.org/docs/lambdas.html")),
            Day(9, "Extension Functions", "Add functionality to existing classes.", R.drawable.image_9, listOf("https://kotlinlang.org/docs/extensions.html")),
            Day(10, "Coroutines & Async Programming", "Handle concurrency in Kotlin.", R.drawable.image_10, listOf("https://developer.android.com/kotlin/coroutines")),
            Day(11, "Data Classes", "Simplify data storage.", R.drawable.image_11, listOf("https://kotlinlang.org/docs/data-classes.html")),
            Day(12, "Sealed Classes", "Restrict class hierarchy.", R.drawable.image_12, listOf("https://kotlinlang.org/docs/sealed-classes.html")),
            Day(13, "Generics", "Create reusable components.", R.drawable.image_13, listOf("https://kotlinlang.org/docs/generics.html")),
            Day(14, "Type Aliases & Inline Classes", "Optimize type usage.", R.drawable.image_14, listOf("https://kotlinlang.org/docs/type-aliases.html"))
        )
    ),
    Week(
        weekNumber = 3,
        days = listOf(
            Day(15, "Jetpack Compose Basics", "Build UI with Compose.", R.drawable.image_15, listOf("https://developer.android.com/jetpack/compose")),
            Day(16, "State Management", "Handle UI state effectively.", R.drawable.image_16, listOf("https://developer.android.com/jetpack/compose/state")),
            Day(17, "Navigation in Compose", "Manage screen transitions.", R.drawable.image_17, listOf("https://developer.android.com/jetpack/compose/navigation")),
            Day(18, "Theming & Styling", "Customize UI appearance.", R.drawable.image_18, listOf("https://developer.android.com/jetpack/compose/themes")),
            Day(19, "Animations in Compose", "Create smooth UI animations.", R.drawable.image_19, listOf("https://developer.android.com/jetpack/compose/animation")),
            Day(20, "Lists & LazyColumn", "Efficiently display lists.", R.drawable.image_20, listOf("https://developer.android.com/jetpack/compose/lists")),
            Day(21, "Handling User Input", "Manage text fields and gestures.", R.drawable.image_21, listOf("https://developer.android.com/jetpack/compose/input"))
        )
    ),
    Week(
        weekNumber = 4,
        days = listOf(
            Day(22, "Networking with Retrofit", "Fetch data from APIs.", R.drawable.image_22, listOf("https://square.github.io/retrofit/")),
            Day(23, "Room Database", "Store data locally.", R.drawable.image_23, listOf("https://developer.android.com/jetpack/androidx/releases/room")),
            Day(24, "Dependency Injection with Hilt", "Manage dependencies efficiently.", R.drawable.image_24, listOf("https://developer.android.com/training/dependency-injection/hilt-android")),
            Day(25, "Unit Testing in Kotlin", "Write reliable tests.", R.drawable.image_25, listOf("https://developer.android.com/training/testing/unit-testing")),
            Day(26, "Performance Optimization", "Improve app efficiency.", R.drawable.image_26, listOf("https://developer.android.com/topic/performance")),
            Day(27, "Publishing an App", "Deploy your app to Google Play.", R.drawable.image_27, listOf("https://developer.android.com/distribute")),
            Day(28, "Final Project & Review", "Apply everything learned.", R.drawable.image_1, listOf("https://developer.android.com"))
        )
    )
)
