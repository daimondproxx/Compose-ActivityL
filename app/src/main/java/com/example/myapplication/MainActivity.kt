package com.example.myapplication

import android.os.Bundle
import android.widget.SearchView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Visibility
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme
import java.util.Locale


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val contactList = mutableListOf<Contact>()

        setContent {
//            FirstScreen()
//            SecondScreen()
//            ThirdScreen()
//            FourthScreen()
//              SampleScreen()
            ScaffoldExample()
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldExample() {

    val contactList = mutableListOf<Contact>(
        Contact("Jane Cooper", "001222324", R.drawable.no_war_girl),
        Contact("Devon Lane", "001222324", R.drawable.no_war_girl),
        Contact("Darrel Steward", "001222324", R.drawable.no_war_girl),
        Contact("Devon Lane", "001222324", R.drawable.no_war_girl),
        Contact("Courtney Henry", "001222324", R.drawable.no_war_girl),
        Contact("Wade Warren", "001222324", R.drawable.no_war_girl),
        Contact("Bessie Cooper", "001222324", R.drawable.no_war_girl),
        Contact("Robert Fox", "99999999", R.drawable.no_war_girl),
        Contact("Jacob Jones", "001222324", R.drawable.no_war_girl),
        Contact("Jenny Wilson", "001222324", R.drawable.no_war_girl),
        Contact("Jane Cooper", "001222324", R.drawable.no_war_girl),
        Contact("Jane Cooper", "001222324", R.drawable.no_war_girl),
        Contact("Jane Cooper", "001222324", R.drawable.no_war_girl),
        Contact("Jane Cooper", "001222324", R.drawable.no_war_girl),
        Contact("Jane Cooper", "001222324", R.drawable.no_war_girl),
        Contact("Jane Cooper", "001222324", R.drawable.no_war_girl),
        Contact("Jane Cooper", "001222324", R.drawable.no_war_girl),
        Contact("Jane Cooper", "001222324", R.drawable.no_war_girl),
        Contact("Jane Cooper", "001222324", R.drawable.no_war_girl),
        Contact("Jane Cooper", "001222324", R.drawable.no_war_girl),
        Contact("Jane Cooper", "001222324", R.drawable.no_war_girl),
        Contact("Jane Cooper", "001222324", R.drawable.no_war_girl),
        Contact("Jane Cooper", "001222324", R.drawable.no_war_girl),
        Contact("Jane Cooper", "001222324", R.drawable.no_war_girl),
        Contact("Jane Cooper", "001222324", R.drawable.no_war_girl)
    )

    var text by remember {
        mutableStateOf("")
    }

    Scaffold(
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = Color.White,
                    titleContentColor = Color.Black,
                ),
                title = {
                    Text("My contacts")
                },
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Navigation Back"
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { }) {
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = "Add Contact"
                        )
                    }

                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.Delete,
                            contentDescription = "Delete Contact"
                        )
                    }
                }
            )
        },

        ) { innerPadding ->

        Surface(modifier = Modifier.fillMaxSize()) {
            Column(verticalArrangement = Arrangement.Top,
                modifier = Modifier
                    .padding(innerPadding)
            ) {

                TextField(
                    label = { Text(text = "Search") },
                    value = text,
                    onValueChange =
                    {
                        text = it
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = null
                        )
                    },
                    modifier = Modifier
                        .padding(start = 28.dp, bottom = 16.dp)
                        .size(335.dp, 48.dp)
                        .clip(RoundedCornerShape(12.dp))

                )

                LazyColumn(modifier = Modifier
                ) {
                    if (text.isEmpty()) items(contactList) { contact ->
                        ContactItemBox(contact)
                    } else {
                        val newList = mutableListOf<Contact>()
                        for (contact in contactList) {
                            if (contact.name.contains(text)
                                ||
                                contact.number.contains(text)
                                ||
                                contact.name.lowercase(Locale.ROOT).contains(text)) {
                                newList.add(contact)
                            }
                        }
                        items(newList) { contact ->
                            ContactItemBox(contact)
                        }
                    }
                }
            }

        }

    }
}

@Composable
fun ContactItemBox(contact: Contact) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.dp, top = 10.dp, bottom = 10.dp)) {
        Image(
            painter = painterResource(id = contact.photo),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .size(40.dp)
                .clip(RoundedCornerShape(50.dp))
        )
        
        Column {
            Text(
                text = contact.name,
                textAlign = TextAlign.Center,
                color = Color(0xFF000000),
                fontWeight = FontWeight.Medium,
                fontSize = 17.sp,
                modifier = Modifier.padding(start = 8.dp)
            )

            Text(
                text = contact.number,
                textAlign = TextAlign.Center,
                color = Color(0xFF8A8A8D),
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                modifier = Modifier.padding(start = 8.dp)
            )

            Divider(thickness = 1.dp,
                color = Color(0xFFB9B9B9),
                modifier = Modifier
                    .width(296.dp)
                    .padding(top = 8.dp, start = 8.dp))
        }
    }
}


@Preview(showBackground = true, device = "spec:width=411dp,height=891dp")
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
//      FirstScreen()
//      SecondScreen()
//      ThirdScreen()
//      FourthScreen()
        ScaffoldExample()
    }
}