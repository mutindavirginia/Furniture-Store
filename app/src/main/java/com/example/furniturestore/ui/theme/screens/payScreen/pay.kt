package com.example.furniturestore.ui.theme.screens.payScreen

import android.content.Intent
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.core.net.toUri


@Composable
fun PayScreen(){
    val mContext = LocalContext.current
    Button(onClick = {
        val simToolKitLaunchIntent = mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
        simToolKitLaunchIntent?.let { mContext.startActivity(it) }
    },shape = RoundedCornerShape(3.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.dp, end = 10.dp),
        colors = ButtonDefaults.buttonColors(Color.Green)) {
        Text(text = "Pay now",) }

    Button(onClick = {
        val callIntent= Intent(Intent.ACTION_DIAL)
        callIntent.data="tel:0796478118".toUri()
        mContext.startActivity(callIntent)
    },shape = RoundedCornerShape(3.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.dp, end = 10.dp),
        colors = ButtonDefaults.buttonColors(Color.Green)) {
        Text(text = "CALL US",) }
    Spacer(modifier = Modifier.height(20.dp))

    Button(onClick = {
        val smsIntent=Intent(Intent.ACTION_SENDTO)
        smsIntent.data="smsto:0796478118".toUri()
        smsIntent.putExtra("sms_body","")
        mContext.startActivity(smsIntent)
    },shape = RoundedCornerShape(3.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.dp, end = 10.dp),
        colors = ButtonDefaults.buttonColors(Color.Green)) {
        Text(text = "TEXT US",) }

}
