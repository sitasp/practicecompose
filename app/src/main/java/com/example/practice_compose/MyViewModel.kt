package com.example.practice_compose

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {

    val state = mutableStateOf(MainActivityScreenState())

    fun updateText(newText: String) {
        state.value = state.value.copy(text = newText)
    }

    fun updateNamesList(newName: String) {
        state.value = state.value.copy(namesList = state.value.namesList + newName)
    }
}