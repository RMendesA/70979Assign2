package com.stu70979.moviebookingapp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.stu70979.moviebookingapp.MoviesList.movie

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.FirstScreen.route,
    ) {
        composable(route = Routes.FirstScreen.route)
        {
            HomePg(navController = navController)
        }
        composable(Routes.SecondScreen.route + "/{id}")
        { backStackEntry ->
            val arg = backStackEntry.arguments?.getString("id")
            var id = 1
            if(arg != null)
                id = arg.toInt();
            val movie = MoviesList.movie.find { it.id == id}
            if(movie != null)
                BookingPg(movie,navController = navController)
        }
    }
}
