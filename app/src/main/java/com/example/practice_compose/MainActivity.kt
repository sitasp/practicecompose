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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.lifecycle.ViewModelProvider

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

                Text(
                    text = stringResource(id = R.string.land_of_sages)
                                    .plus(" ")
                                    .repeat(30),
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis
                )



//                Text(
//                    text = "Land of sages, aryavarta",
//                    color =
//                )

            }
        }
    }
}
