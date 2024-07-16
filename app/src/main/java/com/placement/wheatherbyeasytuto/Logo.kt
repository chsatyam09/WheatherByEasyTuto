package com.placement.wheatherbyeasytuto

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.placement.wheatherbyeasytuto.ui.theme.bgcolor
import com.placement.wheatherbyeasytuto.ui.theme.primaryColor
import com.placement.wheatherbyeasytuto.ui.theme.primaryLight


@Preview
@Composable
private fun LogoComponentssss() {
    LogoComponent()
}


@Composable
fun LogoComponent(
    modifier: Modifier = Modifier,
    size: Dp = 55.dp
) {


    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {

            Column() {

//                    Text(
//                        text = " [ Weather Application ] ",
//                        color = Color.Black,
//                        fontSize = 29.sp,
//                        fontFamily = FontFamily.Serif,
//                        modifier = Modifier
////                            .padding(top = 20.dp) // Add top padding
//                            .align(Alignment.CenterHorizontally) // Center text horizontally
//
//                    )

                Image(
                    painter = painterResource(id = R.drawable.f1),
                    contentDescription = "App logo",
                    modifier = modifier
                        .fillMaxSize()
                        .width(100.dp)
                        .height(100.dp)
                        .background(bgcolor)
                )




            }
        }
    }
}


