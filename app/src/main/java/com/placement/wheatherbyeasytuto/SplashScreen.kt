package com.placement.wheatherbyeasytuto

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.placement.wheatherbyeasytuto.ui.theme.primaryLight
import kotlinx.coroutines.delay
import androidx.compose.foundation.Image as Image1

@Composable
fun SplashScreen(
    navHostController: NavHostController ){

    LaunchedEffect(key1 = Unit) {
        delay(3000)
        navHostController.navigate(WeatherPageRoute)
    }

    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center

    ) {
        LogoComponent()
    }







}