package com.example.furniturestore.ui.theme.screens.images

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.furniturestore.Navigation.ROUTE_CONTACT
import com.example.furniturestore.R

@Composable
fun Image3(navController: NavHostController) {
    Column {
        Card(
            modifier = Modifier
                .height(100.dp)
                .width(160.dp)

        ) {

            Box(modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.favorite_img_3),
                    contentDescription = "favorite",
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.FillBounds
                )
            }
        }
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = "a white lamp.it is reliable",
            fontSize = 10.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Serif,
        )
        Row {
            Button(
                onClick = {
                    navController.navigate(ROUTE_CONTACT)
                }, modifier = Modifier
                    .padding(20.dp)
            ) {
                Text(text = "Buy")

            }
        }

    }
}


@Preview
@Composable
fun PhotoPreview(){
    Image3(rememberNavController())
}