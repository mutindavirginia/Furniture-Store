package com.example.furniturestore.ui.theme.screens.home


import android.content.Intent
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.furniturestore.Navigation.ROUTE_ABOUT
import com.example.furniturestore.Navigation.ROUTE_ADD_PRODUCT
import com.example.furniturestore.Navigation.ROUTE_HOME
import com.example.furniturestore.Navigation.ROUTE_IMAGE_1
import com.example.furniturestore.Navigation.ROUTE_IMAGE_2
import com.example.furniturestore.Navigation.ROUTE_IMAGE_5
import com.example.furniturestore.Navigation.ROUTE_IMAGE_6
import com.example.furniturestore.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController,) {

    Column(
//            modifier = Modifier
//                .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var context = LocalContext.current.applicationContext
        TopAppBar(title = { Text(text = "Furniture") },
            navigationIcon = {
                IconButton(onClick = { navController.navigate(ROUTE_HOME) }) {
                    Icon(
                        imageVector = Icons.Filled.Home,
                        contentDescription = "",
                        tint = Color.Black
                    )
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.Green,
                titleContentColor = Color.Black,
                navigationIconContentColor = Color.Black,
            ),
            actions = {
                IconButton(onClick = { navController.navigate(ROUTE_ADD_PRODUCT) }) {
                    Icon(
                        imageVector = Icons.Filled.ShoppingCart,
                        contentDescription = "",
                        tint = Color.Black
                    )
                }
                IconButton(onClick = { navController.navigate(ROUTE_ABOUT) }) {
                    Icon(
                        imageVector = Icons.Filled.Person,
                        contentDescription = "",
                        tint = Color.Black
                    )
                }

            }
        )
        Spacer(modifier = Modifier.height(20.dp))
        Box(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier.verticalScroll(rememberScrollState())
            ) {
                val mContext = LocalContext.current
                Row(
                    modifier = Modifier.padding(start = 20.dp)
                ) {
                    //Column1

                    Column {
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(160.dp)

                        ) {

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.favorite_img_1),
                                    contentDescription = "car10",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )
                                Icon(
                                    imageVector = Icons.Default.FavoriteBorder,
                                    contentDescription = "favorite",
                                    tint = Color.White,
                                    modifier = Modifier
                                        .align(Alignment.TopEnd)
                                        .padding(15.dp)
                                )

                            }

                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "lamp",
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Serif,
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Row {

                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "star",
                                tint = Color.Green
                            )
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "star",
                                tint = Color.Green
                            )
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "star",
                                tint = Color.Green

                            )
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "star",
                                tint = Color.Green
                            )
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "star",
                                tint = Color.Green
                            )
                        }
                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "443 reviews",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif
                        )

                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "From Ksh.89000",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Green
                        )
                        Spacer(modifier = Modifier.height(5.dp))

                        Row {
                            OutlinedButton(onClick = {
                                navController.navigate(ROUTE_IMAGE_1)
                                val shareIntent = Intent(Intent.ACTION_SEND)
                                shareIntent.type = "text/plain"
                                shareIntent.putExtra(
                                    Intent.EXTRA_TEXT,
                                    "Check out this is a cool content"
                                )
                                mContext.startActivity(Intent.createChooser(shareIntent, "Share"))

                            }) {
                                Text(text = "Buy")

                            }
                            OutlinedButton(onClick = {
                                val shareIntent = Intent(Intent.ACTION_SEND)
                                shareIntent.type = "text/plain"
                                shareIntent.putExtra(
                                    Intent.EXTRA_EMAIL,
                                    arrayOf("mutindavirginia6@gmail.com")
                                )
                                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "APPLICATION FOR A JOB")
                                shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is Virginia")
                                mContext.startActivity(shareIntent)
                            }) {
                                Text(text = "Email")
                            }
                        }
                    }
                    //End of Column1
                    Spacer(modifier = Modifier.width(10.dp))

                    //Column1

                    Column {
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(160.dp)

                        ) {

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.favorite_img_2),
                                    contentDescription = "favorite",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )
                                Icon(
                                    imageVector = Icons.Default.FavoriteBorder,
                                    contentDescription = "favorite",
                                    tint = Color.White,
                                    modifier = Modifier
                                        .align(Alignment.TopEnd)
                                        .padding(15.dp)
                                )

                            }

                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Chair",
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Serif,
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Row {

                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "star",
                                tint = Color.Green
                            )
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "star",
                                tint = Color.Green
                            )
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "star",
                                tint = Color.Green
                            )
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "star",
                                tint = Color.Green
                            )
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "star",
                                tint = Color.Green
                            )
                        }
                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "445 reviews",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif
                        )

                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "From Ksh.18000",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Green
                        )
                        Spacer(modifier = Modifier.height(5.dp))

                        Row {
                            OutlinedButton(onClick = {
                                navController.navigate(ROUTE_IMAGE_2)
                                val shareIntent = Intent(Intent.ACTION_SEND)
                                shareIntent.type = "text/plain"
                                shareIntent.putExtra(
                                    Intent.EXTRA_TEXT,
                                    "Check out this is a cool content"
                                )
                                mContext.startActivity(Intent.createChooser(shareIntent, "Share"))

                            }) {
                                Text(text = "Buy")

                            }
                            OutlinedButton(onClick = {
                                val shareIntent = Intent(Intent.ACTION_SEND)
                                shareIntent.type = "text/plain"
                                shareIntent.putExtra(
                                    Intent.EXTRA_EMAIL,
                                    arrayOf("mutindavirginia6@gmail.com")
                                )
                                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "APPLICATION FOR A JOB")
                                shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is Virginia")
                                mContext.startActivity(shareIntent)
                            }) {
                                Text(text = "Email")
                            }
                        }
                    }
                    //End of Column1
                }

                Row(
                    modifier = Modifier.padding(start = 20.dp)
                ) {
                    //Column1

                    Column {
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(160.dp)

                        ) {

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.favorite_img_3),
                                    contentDescription = "car10",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )
                                Icon(
                                    imageVector = Icons.Default.FavoriteBorder,
                                    contentDescription = "favorite",
                                    tint = Color.White,
                                    modifier = Modifier
                                        .align(Alignment.TopEnd)
                                        .padding(15.dp)
                                )

                            }

                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Desk",
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Serif,
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Row {

                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "star",
                                tint = Color.Green
                            )
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "star",
                                tint = Color.Green
                            )
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "star",
                                tint = Color.Green

                            )
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "star",
                                tint = Color.Green
                            )
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "star",
                                tint = Color.Green
                            )
                        }
                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "443 reviews",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif
                        )

                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "From Ksh.89000",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Green
                        )
                        Spacer(modifier = Modifier.height(5.dp))

                        Row {
                            OutlinedButton(onClick = {
                                navController.navigate(ROUTE_IMAGE_1)
                                val shareIntent = Intent(Intent.ACTION_SEND)
                                shareIntent.type = "text/plain"
                                shareIntent.putExtra(
                                    Intent.EXTRA_TEXT,
                                    "Check out this is a cool content"
                                )
                                mContext.startActivity(Intent.createChooser(shareIntent, "Share"))

                            }) {
                                Text(text = "Buy")

                            }
                            OutlinedButton(onClick = {
                                val shareIntent = Intent(Intent.ACTION_SEND)
                                shareIntent.type = "text/plain"
                                shareIntent.putExtra(
                                    Intent.EXTRA_EMAIL,
                                    arrayOf("mutindavirginia6@gmail.com")
                                )
                                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "APPLICATION FOR A JOB")
                                shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is Virginia")
                                mContext.startActivity(shareIntent)
                            }) {
                                Text(text = "Email")
                            }
                        }
                    }
                    //End of Column1
                    Spacer(modifier = Modifier.width(10.dp))

                    //Column1

                    Column {
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(160.dp)

                        ) {

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.favorite_img_4),
                                    contentDescription = "favorite",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )
                                Icon(
                                    imageVector = Icons.Default.FavoriteBorder,
                                    contentDescription = "favorite",
                                    tint = Color.White,
                                    modifier = Modifier
                                        .align(Alignment.TopEnd)
                                        .padding(15.dp)
                                )

                            }

                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "vase",
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Serif,
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Row {

                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "star",
                                tint = Color.Green
                            )
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "star",
                                tint = Color.Green
                            )
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "star",
                                tint = Color.Green
                            )
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "star",
                                tint = Color.Green
                            )
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "star",
                                tint = Color.Green
                            )
                        }
                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "445 reviews",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif
                        )

                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "From Ksh.18000",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Green
                        )
                        Spacer(modifier = Modifier.height(5.dp))

                        Row {
                            OutlinedButton(onClick = {
                                navController.navigate(ROUTE_IMAGE_2)
                                val shareIntent = Intent(Intent.ACTION_SEND)
                                shareIntent.type = "text/plain"
                                shareIntent.putExtra(
                                    Intent.EXTRA_TEXT,
                                    "Check out this is a cool content"
                                )
                                mContext.startActivity(Intent.createChooser(shareIntent, "Share"))

                            }) {
                                Text(text = "Buy")

                            }
                            OutlinedButton(onClick = {
                                val shareIntent = Intent(Intent.ACTION_SEND)
                                shareIntent.type = "text/plain"
                                shareIntent.putExtra(
                                    Intent.EXTRA_EMAIL,
                                    arrayOf("mutindavirginia6@gmail.com")
                                )
                                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "APPLICATION FOR A JOB")
                                shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is Virginia")
                                mContext.startActivity(shareIntent)
                            }) {
                                Text(text = "Email")
                            }
                        }
                    }
                    //End of Column1
                }
                Row(
                    modifier = Modifier.padding(start = 20.dp)
                ) {
                    //Column1

                    Column {
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(160.dp)

                        ) {

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.favorite_img_5),
                                    contentDescription = "car10",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )
                                Icon(
                                    imageVector = Icons.Default.FavoriteBorder,
                                    contentDescription = "favorite",
                                    tint = Color.White,
                                    modifier = Modifier
                                        .align(Alignment.TopEnd)
                                        .padding(15.dp)
                                )

                            }

                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "white vase",
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Serif,
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Row {

                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "star",
                                tint = Color.Green
                            )
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "star",
                                tint = Color.Green
                            )
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "star",
                                tint = Color.Green

                            )
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "star",
                                tint = Color.Green
                            )
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "star",
                                tint = Color.Green
                            )
                        }
                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "443 reviews",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif
                        )

                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "From Ksh.89000",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Green
                        )
                        Spacer(modifier = Modifier.height(5.dp))

                        Row {
                            OutlinedButton(onClick = {
                                navController.navigate(ROUTE_IMAGE_5)
                                val shareIntent = Intent(Intent.ACTION_SEND)
                                shareIntent.type = "text/plain"
                                shareIntent.putExtra(
                                    Intent.EXTRA_TEXT,
                                    "Check out this is a cool content"
                                )
                                mContext.startActivity(Intent.createChooser(shareIntent, "Share"))

                            }) {
                                Text(text = "Buy")

                            }
                            OutlinedButton(onClick = {
                                val shareIntent = Intent(Intent.ACTION_SEND)
                                shareIntent.type = "text/plain"
                                shareIntent.putExtra(
                                    Intent.EXTRA_EMAIL,
                                    arrayOf("mutindavirginia6@gmail.com")
                                )
                                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "APPLICATION FOR A JOB")
                                shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is Virginia")
                                mContext.startActivity(shareIntent)
                            }) {
                                Text(text = "Email")
                            }
                        }
                    }
                    //End of Column1
                    Spacer(modifier = Modifier.width(10.dp))

                    //Column1

                    Column {
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(160.dp)

                        ) {

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.favorite_img_6),
                                    contentDescription = "favorite",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )
                                Icon(
                                    imageVector = Icons.Default.FavoriteBorder,
                                    contentDescription = "favorite",
                                    tint = Color.White,
                                    modifier = Modifier
                                        .align(Alignment.TopEnd)
                                        .padding(15.dp)
                                )

                            }

                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "shelf",
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Serif,
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Row {

                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "star",
                                tint = Color.Green
                            )
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "star",
                                tint = Color.Green
                            )
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "star",
                                tint = Color.Green
                            )
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "star",
                                tint = Color.Green
                            )
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "star",
                                tint = Color.Green
                            )
                        }
                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "445 reviews",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif
                        )

                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "From Ksh.18000",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Green
                        )
                        Spacer(modifier = Modifier.height(5.dp))

                        Row {
                            OutlinedButton(onClick = {
                                navController.navigate(ROUTE_IMAGE_6)
                                val shareIntent = Intent(Intent.ACTION_SEND)
                                shareIntent.type = "text/plain"
                                shareIntent.putExtra(
                                    Intent.EXTRA_TEXT,
                                    "Check out this is a cool content"
                                )
                                mContext.startActivity(Intent.createChooser(shareIntent, "Share"))

                            }) {
                                Text(text = "Buy")

                            }
                            OutlinedButton(onClick = {
                                val shareIntent = Intent(Intent.ACTION_SEND)
                                shareIntent.type = "text/plain"
                                shareIntent.putExtra(
                                    Intent.EXTRA_EMAIL,
                                    arrayOf("mutindavirginia6@gmail.com")
                                )
                                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "APPLICATION FOR A JOB")
                                shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is Virginia")
                                mContext.startActivity(shareIntent)
                            }) {
                                Text(text = "Email")
                            }
                        }
                    }
                    //End of Column1
                }

            }
                }
            }
        }









@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())

}
