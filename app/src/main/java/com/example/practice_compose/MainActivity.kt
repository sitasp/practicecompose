package com.example.practice_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.practice_compose.ui.theme.PracticecomposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting("Satish")
            Button(onClick = { println("button clicked") }, content = {
                Text(text = "Click Me")
            })
//            Icon(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "icon", tint = Color.Black)
//            Image(
//                painter = painterResource(id = R.drawable.ic_launcher_foreground),
//                contentDescription = "icon"
//            )
//            TextField(value = "", onValueChange = {}, label = { Text(text = "Enter your name") }, placeholder = { Text(text = "Name") }, colors = TextFieldDefaults.colors(
//                focusedIndicatorColor = Color.Red,
//                unfocusedIndicatorColor = Color.Blue,
//                focusedContainerColor = Color.Yellow,
//                unfocusedContainerColor = Color.Green
//            ))
//            FloatingActionButton(onClick = {}) {
//                Icon(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "icon")
//            }
//            ExtendedFloatingActionButton(
//                text = { Text(text = "Extended FAB") },
//                icon = { Icon(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "icon") },
//                onClick = { println("Extended FAB clicked") },
//                containerColor = Color.White,
//            )
        }
    }
}


@Composable
fun Greeting(name: String) {
    Text("Welcome $name", color = Color.Red, fontSize = 22.sp, fontWeight = FontWeight.Bold)
}