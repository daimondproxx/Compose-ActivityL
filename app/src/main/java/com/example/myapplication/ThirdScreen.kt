package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Visibility
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ThirdScreen() {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 25.dp, end = 25.dp, bottom = 25.dp)
            .verticalScroll(rememberScrollState())
    ) {

        Box(modifier = Modifier.padding(top = 20.dp)) {
            Image(
                painter = painterResource(id = R.drawable.deal_imgae),
                contentDescription = null,
                modifier = Modifier
                    .size(352.dp, 330.dp)
                    .clip(RoundedCornerShape(40.dp))
            )
        }

        Box(modifier = Modifier.padding(bottom = 15.dp)) {
            OutlinedTextField(
                value = "",
                onValueChange = {

                },
                placeholder = { Text(text = "Email", color = Color(0xFFC0C0C0)) },
                singleLine = true,
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier
                    .size(354.dp, 60.dp)
                    .border(3.dp, Color(0xFFC0C0C0), RoundedCornerShape(12.dp))

            )
        }

        Box(modifier = Modifier.padding(bottom = 5.dp)) {
            OutlinedTextField(
                value = "",
                onValueChange = {},
                trailingIcon = {
                    IconButton(onClick = { }) {
                        Icon(
                            imageVector = Icons.Outlined.Visibility,
                            contentDescription = null,
                            tint = Color.Black
                        )
                    }
                },
                placeholder = { Text(text = "Password", color = Color(0xFFC0C0C0)) },
                singleLine = true,
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier
                    .size(354.dp, 60.dp)
                    .border(3.dp, Color(0xFFC0C0C0), RoundedCornerShape(12.dp))
            )
        }

        Row(
            horizontalArrangement = Arrangement.End,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Lupa password?")
        }

        Box(modifier = Modifier.padding(top = 22.dp)) {
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

        Box(
            modifier = Modifier
                .padding(top = 30.dp)
                .fillMaxWidth()
        ) {
            Divider(
                thickness = 4.dp,
                modifier = Modifier
                    .width(86.dp)
                    .align(Alignment.CenterStart)
            )
            Text(
                text = "Other options",
                color = Color(0xFFC0C0C0),
                fontWeight = FontWeight.W400,
                modifier = Modifier.align(Alignment.Center)
            )
            Divider(
                thickness = 4.dp,
                modifier = Modifier
                    .width(86.dp)
                    .align(Alignment.CenterEnd)
            )
        }

        Box(
            modifier = Modifier
                .padding(top = 30.dp)
        ) {

            TextButton(
                contentPadding = PaddingValues(),
                onClick = { },
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier
                    .size(354.dp, 52.dp)
                    .border(3.dp, Color(0xFFE74C3C), RoundedCornerShape(12.dp))

            ) {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.google),
                        contentDescription = null,
                        tint = Color.Unspecified,
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .padding(start = 20.dp)

                    )

                    Text(
                        text = "Google",
                        textAlign = TextAlign.Center,
                        color = Color(0xFFE74C3C),
                    )
                }
            }
        }
        Box(
            modifier = Modifier
                .padding(top = 15.dp)
        ) {

            TextButton(
                contentPadding = PaddingValues(),
                onClick = { },
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier
                    .size(354.dp, 52.dp)
                    .border(3.dp, Color(0xFF3498DB), RoundedCornerShape(12.dp))
            ) {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.facebook_svgrepo_com),
                        contentDescription = null,
                        tint = Color(0xFF3498DB),
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .padding(start = 20.dp)

                    )

                    Text(
                        text = "Facebook",
                        textAlign = TextAlign.Center,
                        color = Color(0xFF3498DB),
                    )
                }
            }
        }
    }
}