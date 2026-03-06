package com.example.tarot.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tarot.ui.screens.CardScreen
import com.example.tarot.ui.screens.MainScreen
import com.example.tarot.ui.screens.ShowCardsScreen

@Composable
fun AppNavigation() {
    val navHostController = rememberNavController()

    NavHost(navController = navHostController, startDestination = "mainScreen") {

        composable("mainScreen") {
            MainScreen(navHostController = navHostController)
        }
        composable("cardScreen") {
            CardScreen(navHostController = navHostController)
        }
        composable("showCardsScreen") {
            ShowCardsScreen(navHostController = navHostController)
        }
    }

}
