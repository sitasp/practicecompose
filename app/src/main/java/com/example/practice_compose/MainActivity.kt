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
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider

class MainActivity : ComponentActivity() {

    val viewModel by lazy {
        ViewModelProvider(this).get(MyViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val state = viewModel.state.value

            Column(modifier = Modifier.fillMaxSize()) {

                LazyColumn(
                    modifier = Modifier.fillMaxWidth()
                        .weight(1f)
                ){
                    items(state.namesList.size) { index ->
                        Text(
                            text = state.namesList[index]
                        )
                    }
                }

                MyTextField(
                    textState = state.text,
                    onValueChanged = {
                        viewModel.updateText(it)
                    },
                    onAddClick = {
                        viewModel.updateNamesList(state.text)
                        viewModel.updateText("")
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
