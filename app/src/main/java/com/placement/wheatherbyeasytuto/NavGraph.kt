package com.placement.wheatherbyeasytuto

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Nav() {
    val navHostController = rememberNavController()
    NavHost(navController = navHostController, startDestination = "start"){
        composable(route = "start"){
            SplashScreen(navHostController = navHostController)
        }


        composable(route = "WeatherPage") {
            WeatherPage()
        }




    }


}
val WeatherPageRoute = "WeatherPage"








//        composable(route = "WeatherPage"){
//        //  WeatherPage(navHostController = navHostController) // unable to pass this
//        }




//val WeatherPage = "WeatherPage" ;
