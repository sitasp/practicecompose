package com.example.practice_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box (
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    modifier = Modifier.height(50.dp).width(140.dp),
                    shape = RoundedCornerShape(topStart = 10.dp, bottomEnd = 10.dp),
                    onClick = {
                        println("Clicked button's icon id is: " + R.drawable.ic_launcher_foreground)
                    },
                    enabled = true,
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 10.dp
                    ),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF0073EE),
                        contentColor = Color.White,
                        disabledContainerColor = Color(0xFFB9F3F3),
                        disabledContentColor = Color.White
                    ),
                ) {
                    Icon(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "Icon")
                    Text("Click me!")
                }
            }
        }
    }
}
