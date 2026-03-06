package com.example.tarot.model

import androidx.collection.intIntMapOf


class TarotCards: CardRepository {
    override fun cardDeck(): MutableList<Card> {
        return mutableListOf(
            Card(name = "01", description = "", image = ""),
            Card(name = "02", description = "", image = ""),
            Card(name = "03", description = "", image = ""),
            Card(name = "04", description = "", image = ""),
            Card(name = "05", description = "", image = ""),
            Card(name = "06", description = "", image = ""),
            Card(name = "07", description = "", image = ""),
            Card(name = "08", description = "", image = "")
        )
    }
}