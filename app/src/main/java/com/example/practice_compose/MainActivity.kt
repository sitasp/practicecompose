package com.example.practice_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                var textState by remember {
                    mutableStateOf("")
                }
                MyTextField(
                    textState = textState,
                    onValueChanged = {
                        textState = it
                    }
                )
            }
        }
    }
}



// stateless component
@Composable
fun MyTextField (
    textState: String,
    onValueChanged: (String) -> Unit
) {
    TextField(
        value = textState,
        onValueChange = {
            onValueChanged(it)
        },
        modifier = Modifier.fillMaxWidth()
    )
}
