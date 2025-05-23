package com.example.practice_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                val annotatedString = buildAnnotatedString {
                    blueGradientText("Welcome to")
                    append("\n\n")
                    pinkBlueGradientText("Land of sages, ")
                    append("\n\n")
                    pinkGradientText("Aryavarta!!")
                }

                Text(annotatedString)
            }
        }
    }

    private fun AnnotatedString.Builder.blueGradientText(text: String) {
        withStyle(
            style = SpanStyle(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color(0xFF2788C7),
                        Color(0xFF00BBD4)
                    )
                ),
                fontSize = 42.sp,
                fontWeight = FontWeight.Medium
            )
        ) {
            append(text)
        }
    }

    private fun AnnotatedString.Builder.pinkBlueGradientText(text: String) {
        withStyle(
            style = SpanStyle(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color(0xFFFF3B85),
                        Color(0xFF00BBD4)
                    )
                ),
                fontSize = 48.sp,
                fontWeight = FontWeight.Medium
            )
        ) {
            append(text)
        }
    }


    private fun AnnotatedString.Builder.pinkGradientText(text: String) {
        withStyle(
            style = SpanStyle(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color(0xFFFF3B85),
                        Color(0xFFCC0552)
                    )
                ),
                fontSize = 48.sp,
                fontWeight = FontWeight.Medium
            )
        ) {
            append(text)
        }
    }
}
