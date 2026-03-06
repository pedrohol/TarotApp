package com.example.tarot.viewModel.state

import com.example.tarot.model.Card

data class CardUiState(
    val cardsList: Set<Card> = emptySet(),
    val isLoading: Boolean = false
)
