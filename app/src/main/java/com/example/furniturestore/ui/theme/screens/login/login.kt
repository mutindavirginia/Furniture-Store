package com.example.furniturestore.ui.theme.screens.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.furniturestore.Navigation.ROUTE_HOME
import com.example.furniturestore.data.AuthViewModel


@Composable
fun LoginScreen(navController:NavHostController) {

    var email by remember { mutableStateOf(TextFieldValue("")) }
    var pass by remember { mutableStateOf(TextFieldValue("")) }
    var context= LocalContext.current
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally) {

//        Text(text = "Login here",
//            color = Color.White,
//            fontFamily = FontFamily.SansSerif,
//            fontSize = 30.sp)
//        Spacer(modifier = Modifier.height(20.dp))
        Card(
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(Color.LightGray),
            modifier = Modifier
                .padding(20.dp)

            ) {
            Text(text = "Login here",
                color = Color.White,
                fontFamily = FontFamily.SansSerif,
                fontSize = 30.sp,
                textAlign = TextAlign.Center)
            Spacer(modifier = Modifier.height(20.dp))
            OutlinedTextField(value =email , onValueChange = {email=it},
                label = { Text(text = "Enter Email") },
                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),

                )
            Spacer(modifier = Modifier.height(20.dp))
            OutlinedTextField(value =pass , onValueChange = {pass=it},
                label = { Text(text = "Enter Password") },
                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Button(onClick = {
                val mylogin=AuthViewModel(navController, context)
                mylogin.login(email.text.trim(),pass.text.trim())
                navController.navigate(ROUTE_HOME)
          }, modifier = Modifier.padding(20.dp)
                .fillMaxWidth()
            ) {
                Text(text = "Log In")
            }
        }

    }


}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LoginPage() {
    LoginScreen(rememberNavController())
}
