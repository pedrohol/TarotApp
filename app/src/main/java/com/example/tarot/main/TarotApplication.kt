package com.example.tarot.main

import android.app.Application
import com.example.tarot.di.modules
import org.koin.core.context.startKoin
import org.koin.dsl.module

class TarotApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin { modules(modules) }
    }
}