package com.example.a30day.data

import com.example.a30day.R
import com.example.a30day.model.Day
import com.example.a30day.model.Week


val studyPlan = listOf(
    Week(
        weekNumber = 1,
        days = listOf(
            Day(1, "Day 1: Introduction to Kotlin", "Learn the basics of Kotlin.", R.drawable.image_1, listOf("https://kotlinlang.org")),
            Day(2, "Day 2: Variables & Data Types", "Understand Kotlin variables.", R.drawable.image_2, listOf("https://developer.android.com/kotlin")),
            Day(3, "Day 3: Control Flow", "If, when, loops, and ranges.", R.drawable.image_3, listOf("https://kotlinlang.org/docs/control-flow.html")),
            Day(4, "Day 4: Functions", "Learn how to write functions in Kotlin.", R.drawable.image_4, listOf("https://kotlinlang.org/docs/functions.html")),
            Day(5, "Day 5: Null Safety", "Understand Kotlin’s null safety features.", R.drawable.image_5, listOf("https://kotlinlang.org/docs/null-safety.html")),
            Day(6, "Day 6: Collections", "Explore lists, sets, and maps.", R.drawable.image_6, listOf("https://kotlinlang.org/docs/collections-overview.html")),
            Day(7, "Day 7: Lambdas", "Use lambda expressions in Kotlin.", R.drawable.image_7, listOf("https://kotlinlang.org/docs/lambdas.html"))
        )
    ),
    Week(
        weekNumber = 2,
        days = listOf(
            Day(8, "Day 8: Classes & Objects", "Learn object-oriented programming in Kotlin.", R.drawable.image_8, listOf("https://kotlinlang.org/docs/classes.html")),
            Day(9, "Day 9: Inheritance", "Understand how inheritance works.", R.drawable.image_9, listOf("https://kotlinlang.org/docs/inheritance.html")),
            Day(10, "Day 10: Interfaces", "Implement interfaces in Kotlin.", R.drawable.image_10, listOf("https://kotlinlang.org/docs/interfaces.html")),
            Day(11, "Day 11: Data Classes", "Use data classes for structured data.", R.drawable.image_11, listOf("https://kotlinlang.org/docs/data-classes.html")),
            Day(12, "Day 12: Object Expressions", "Singletons and companion objects.", R.drawable.image_12, listOf("https://kotlinlang.org/docs/object-declarations.html")),
            Day(13, "Day 13: Extensions", "Extend existing classes with new functionality.", R.drawable.image_13, listOf("https://kotlinlang.org/docs/extensions.html")),
            Day(14, "Day 14: Generics", "Make your code flexible with generics.", R.drawable.image_14, listOf("https://kotlinlang.org/docs/generics.html"))
        )
    ),
    Week(
        weekNumber = 3,
        days = listOf(
            Day(15, "Day 15: Enums & Sealed Classes", "Model restricted class hierarchies.", R.drawable.image_15, listOf("https://kotlinlang.org/docs/sealed-classes.html")),
            Day(16, "Day 16: Type Aliases", "Use aliases for complex types.", R.drawable.image_16, listOf("https://kotlinlang.org/docs/type-aliases.html")),
            Day(17, "Day 17: Coroutines Basics", "Understand asynchronous programming.", R.drawable.image_17, listOf("https://kotlinlang.org/docs/coroutines-overview.html")),
            Day(18, "Day 18: Suspending Functions", "Learn how suspending works.", R.drawable.image_18, listOf("https://kotlinlang.org/docs/composing-suspending-functions.html")),
            Day(19, "Day 19: Coroutine Builders", "Launch, async, and runBlocking.", R.drawable.image_19, listOf("https://kotlinlang.org/docs/coroutine-basics.html")),
            Day(20, "Day 20: Exception Handling in Coroutines", "Handle errors in asynchronous code.", R.drawable.image_20, listOf("https://kotlinlang.org/docs/exception-handling.html")),
            Day(21, "Day 21: Flows", "Cold streams of data in Kotlin.", R.drawable.image_21, listOf("https://kotlinlang.org/docs/flow.html"))
        )
    ),
    Week(
        weekNumber = 4,
        days = listOf(
            Day(22, "Day 22: DSL Construction", "Create your own Kotlin DSLs.", R.drawable.image_22, listOf("https://kotlinlang.org/docs/type-safe-builders.html")),
            Day(23, "Day 23: Kotlin Multiplatform", "Share code between platforms.", R.drawable.image_23, listOf("https://kotlinlang.org/lp/multiplatform/")),
            Day(24, "Day 24: Kotlin Native", "Run Kotlin on non-JVM platforms.", R.drawable.image_24, listOf("https://kotlinlang.org/docs/native-overview.html")),
            Day(25, "Day 25: Kotlin/JS", "Use Kotlin to write frontend apps.", R.drawable.image_25, listOf("https://kotlinlang.org/docs/js-overview.html")),
            Day(26, "Day 26: Compose for Android", "UI with Jetpack Compose.", R.drawable.image_26, listOf("https://developer.android.com/jetpack/compose")),
            Day(27, "Day 27: Compose Layouts", "Understand Column, Row, Box, etc.", R.drawable.image_27, listOf("https://developer.android.com/jetpack/compose/layouts")),
            Day(28, "Day 28: State & ViewModel", "Manage state in Compose apps.", R.drawable.image_1, listOf("https://developer.android.com/jetpack/compose/state"))
        )
    ),
    Week(
        weekNumber = 5,
        days = listOf(
            Day(29, "Day 29: Navigation in Compose", "Move between screens in Compose.", R.drawable.image_2, listOf("https://developer.android.com/jetpack/compose/navigation")),
            Day(30, "Day 30: Final Project & Wrap Up", "Apply what you’ve learned.", R.drawable.image_3, listOf("https://kotlinlang.org"))
        )
    )
)
