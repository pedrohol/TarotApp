package com.example.tarot.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.tarot.viewModel.CardViewModel
import org.koin.androidx.compose.koinViewModel

@Preview
@Composable
fun MainScreen(modifier:Modifier = Modifier) {

    val viewModel: CardViewModel = koinViewModel()
    val uiState = viewModel.uiState.collectAsStateWithLifecycle()
    val cardList = uiState.value.cardsList

    Column(modifier = modifier.fillMaxSize()) {

        cardList.forEach {
            Text(text = it.name)
        }

        Button(onClick = { viewModel.getCards()} ) {
        }

    }
}