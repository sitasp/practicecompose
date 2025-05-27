package com.example.practice_compose

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.example.practice_compose.models.Quote
import com.google.gson.Gson

object DataManager {
    val gson = Gson()
    var data = emptyArray<Quote>()
    var isDataLoaded = mutableStateOf(false)

    fun loadAssetsFromFile(context: Context) {
        val inputStream = context.assets.open("quotes.json")
        val size: Int = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val jsonString = String(buffer, Charsets.UTF_8)
        data = gson.fromJson(jsonString, Array<Quote>::class.java)
        isDataLoaded.value = true
    }
}