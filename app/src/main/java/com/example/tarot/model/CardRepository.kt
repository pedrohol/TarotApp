package com.example.tarot.model

interface CardRepository {

    fun cardDeck(): MutableList<Card>

}