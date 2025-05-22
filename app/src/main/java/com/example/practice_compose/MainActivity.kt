package com.example.practice_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.fillMaxSize()) {

                var textState by remember {
                    mutableStateOf("")
                }

                val namesListState = remember {
                    mutableStateListOf<String>()
                }

                LazyColumn(
                    modifier = Modifier.fillMaxWidth()
                        .weight(1f)
                ){
                    items(namesListState.size) { index ->
                        Text(
                            text = namesListState[index]
                        )
                    }
                }

                MyTextField(
                    textState = textState,
                    onValueChanged = {
                        textState = it
                    },
                    onAddClick = {
                        namesListState.add(textState)
                        textState = ""
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
    onValueChanged: (String) -> Unit,
    onAddClick: () -> Unit
) {
    TextField(
        value = textState,
        onValueChange = {
            onValueChanged(it)
        },
        modifier = Modifier.fillMaxWidth(),
        trailingIcon = {
            Icon(imageVector = Icons.Default.Add, contentDescription = null, modifier = Modifier.clickable { onAddClick() })
        }
    )
}
