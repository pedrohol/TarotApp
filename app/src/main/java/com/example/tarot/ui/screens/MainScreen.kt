package com.example.tarot.ui.screens

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.tarot.R
import com.example.tarot.ui.components.CardDeck
import com.example.tarot.viewModel.CardViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.koin.androidx.compose.koinViewModel

@Preview
@Composable
fun MainScreen(navHostController: NavHostController = rememberNavController()) {

    val viewModel: CardViewModel = koinViewModel()
    val uiState = viewModel.uiState.collectAsStateWithLifecycle()
    val cardList = uiState.value.cardsList
    val scope = rememberCoroutineScope()

    val infiniteTransition = rememberInfiniteTransition(label = "tapTransition")
    val tapLoop by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = -14f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 1000, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "tapAnimation"
    )

    var showLoading by remember { mutableStateOf(false) }
    val animatedAlpha by animateFloatAsState(
        targetValue = if (showLoading) 1f else 0f,
        label = "alpha"
        )

    Scaffold() { innerPadding ->
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .background(Color(0xFF52969F))) {

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .clickable{
                        showLoading = true
                        scope.launch {
                            delay(2000)
                            navHostController.navigate("cardScreen")
                            delay(2000)
                            showLoading = false
                        }
                    }) {
                CardDeck()
            }

            Box(
                contentAlignment = Alignment.BottomCenter,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = 220.dp)) {

                Image(
                    painterResource(id = R.drawable.tap_icon),
                    contentDescription = "Tap icon",
                    modifier = Modifier
                        .size(60.dp)
                        .graphicsLayer{ translationY = tapLoop }
                )

            }

            Box(contentAlignment = Alignment.TopEnd,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp)
            ){

                Image(
                    painterResource(id = R.drawable.cards_icon),
                    contentDescription = "Cards icon",
                    modifier = Modifier
                        .size(45.dp)
                        .clickable(
                            interactionSource = remember { MutableInteractionSource() },
                            indication = null) {
                            navHostController.navigate("showCardsScreen")
                        }
                )
            }

            if(showLoading) {
                LoadingScreen(modifier = Modifier.graphicsLayer{ alpha = animatedAlpha })
            }

        }
    }
}