package com.example.tarot.viewModel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tarot.model.Card
import com.example.tarot.model.CardRepository
import com.example.tarot.viewModel.state.CardUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class CardViewModel(val repository: CardRepository): ViewModel() {

    val cards = repository.cardDeck()
    val newList = mutableSetOf<Card>()
    private val _uiState = MutableStateFlow(CardUiState())
    val uiState = _uiState.asStateFlow()

    init {
        getCards()
    }

    fun getCards() {
        newList.clear()
        _uiState.update { it.copy(isLoading = true) }
        viewModelScope.launch {
            for (i in 1..5) {
                val card = cards.random()
                newList.add(card)
                cards.remove(card)
            }
            _uiState.update { it.copy(cardsList = newList, isLoading = false) }
        }
    }
}