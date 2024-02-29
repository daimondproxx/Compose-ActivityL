package com.example.myapplication

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SecondScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 25.dp, end = 25.dp)
            .verticalScroll(rememberScrollState())
    ) {

        Box(
            modifier = Modifier.padding(top = 86.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.motorcycle1_image),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .size(352.dp, 330.dp)
                    .clip(RoundedCornerShape(35.dp))

            )
        }

        Box(
            modifier = Modifier.padding(top = 30.dp)
        ) {
            Text(
                text = "Mudah dalam bertransaksi,\n" +
                        "dengan  Jumot",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
        }

        Box(
            modifier = Modifier.padding(top = 10.dp, bottom = 78.dp)
        ) {
            Text(
                text = "Beli kendaraan sesuai minatmu dan dengan\n" +
                        "harga negosiasi terbaik",
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Center
            )
        }

        Box(modifier = Modifier.padding(bottom = 20.dp)) {
            Button(
                onClick = {

                },
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFF3498DB)),
                modifier = Modifier
                    .size(354.dp, 52.dp)
            ) {
                Text(
                    text = "Masuk",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.W700
                )
            }
        }

        Box(modifier = Modifier.padding(bottom = 40.dp)) {
            TextButton(
                onClick = {

                },
                border = BorderStroke(2.dp, Color(0xFF3498DB)),
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier
                    .size(354.dp, 52.dp)
            ) {
                Text(
                    text = "Mendatfar",
                    color = Color(0xFF3498DB),
                    fontSize = 15.sp,
                    fontWeight = FontWeight.W700
                )
            }
        }

    }
}