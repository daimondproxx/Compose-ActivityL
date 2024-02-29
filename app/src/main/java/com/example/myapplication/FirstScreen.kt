package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FirstScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 25.dp, end = 25.dp)
    ) {

        Box(
            modifier = Modifier.padding(top = 86.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.motorcycle2_image),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .size(352.dp, 330.dp)
                    .clip(RoundedCornerShape(35.dp))

            )
        }

        Row(
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

        Row(
            modifier = Modifier.padding(top = 10.dp)
        ) {
            Text(
                text = "Bisnis jual beli menjangkau ke seluruh wilayah\n" +
                        "di Indonesia",
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Center
            )
        }

    }
}