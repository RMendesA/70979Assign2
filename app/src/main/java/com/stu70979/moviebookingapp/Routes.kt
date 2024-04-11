package com.stu70979.moviebookingapp


sealed class Routes(val route: String) {
    object FirstScreen : Routes("Home")
    object SecondScreen : Routes("Booking Pg")
}