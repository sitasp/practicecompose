package com.example.practice_compose.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.example.practice_compose.models.Quote

@Composable
fun QuoteList(data: Array<Quote>, onClick: (quote: Quote) -> Unit) {

    LazyColumn( content = {
        items(data.size) {
            QuoteListItem(quote = data[it], onClick)
        }
    })
}