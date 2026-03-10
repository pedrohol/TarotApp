package com.example.tarot.di

import com.example.tarot.model.CardRepository
import com.example.tarot.model.TarotCards
import com.example.tarot.viewModel.CardViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import org.koin.plugin.module.dsl.viewModel

val viewModelModule = module {
    factory<CardRepository> { TarotCards() }
    viewModelOf(::CardViewModel)
}
val modules = listOf(viewModelModule)