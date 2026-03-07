package com.example.tarot.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.tarot.R
import com.example.tarot.model.Card
import com.example.tarot.ui.components.ShowCardList
import com.example.tarot.viewModel.CardViewModel
import org.koin.androidx.compose.koinViewModel

@Preview
@Composable
fun CardScreen(navHostController: NavHostController = rememberNavController()) {

    val viewModel: CardViewModel = koinViewModel()
    val uiState = viewModel.uiState.collectAsStateWithLifecycle()
    val cardList = uiState.value.cardsList

    Scaffold() {innerPadding ->

        Box(modifier = Modifier.fillMaxSize())
        {

            MainScreen()

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .background(Color(0xCC000000))) {

                Image(
                    painter = painterResource(id = R.drawable.close_icon),
                    contentDescription = "Close icon",
                    alignment = Alignment.CenterStart,
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(50.dp)
                        .padding(10.dp)
                        .clickable(
                            interactionSource = remember { MutableInteractionSource() },
                            indication = null
                        ){ navHostController.popBackStack() },
                )

                Spacer(modifier = Modifier.height(10.dp))

                cardList.forEach {
                    Box(modifier = Modifier.fillMaxHeight()) {
                        ShowCardList(card = it)
                    }
                }
            }
        }
    }
    
}