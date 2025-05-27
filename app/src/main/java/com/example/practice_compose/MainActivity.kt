package com.example.practice_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.practice_compose.screens.QuoteListScreen

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DataManager.loadAssetsFromFile(this)

        setContent {
            App()

        }
    }
}


@Composable
fun App() {
    if(DataManager.isDataLoaded.value) {
        QuoteListScreen(data = DataManager.data) { }
    }
}