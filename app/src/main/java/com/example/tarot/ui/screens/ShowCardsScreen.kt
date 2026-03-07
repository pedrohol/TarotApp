package com.example.tarot.ui.screens

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyGridScope
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.tarot.R
import com.example.tarot.ui.components.CardItem
import com.example.tarot.ui.components.ShowCard

@Preview
@Composable
fun ShowCardsScreen(navHostController: NavHostController = rememberNavController()) {

    var showCard by remember { mutableStateOf(false) }
    var cardDescription by remember { mutableStateOf("") }

    val animatedAlpha by animateFloatAsState(
        targetValue = if (showCard) 1f else 0f
    )

    Scaffold() { innerPadding ->

        Column(modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .background(Color(0xFF52969F))) {

            Image(
                painter = painterResource(id = R.drawable.back_icon),
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

            Box(){

                Box(modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp))
                {
                    LazyVerticalGrid(
                        columns = GridCells.Adaptive(minSize = 74.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                        contentPadding = PaddingValues(top = 10.dp, bottom = 20.dp)
                    )
                    {
                        items(count = 80, ) {
                            CardItem() { showCard = true }
                        }
                    }
                }

                if(showCard) {

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxSize()
                            .verticalScroll(rememberScrollState())
                            .background(Color(0xCC000000))
                            .graphicsLayer{ alpha = animatedAlpha }) {

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
                                ){ showCard = false },
                        )

                        Spacer(modifier = Modifier.height(10.dp))

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .fillMaxSize()
                                .graphicsLayer{ alpha = animatedAlpha }
                        ) {

                            Card(
                                elevation = CardDefaults.cardElevation(6.dp),
                                modifier = Modifier
                                    .height(450.dp)
                                    .width(250.dp)
                                    .graphicsLayer{ alpha = animatedAlpha })
                            {}

                            Spacer(modifier = Modifier.height(20.dp))

                            Column(modifier = Modifier.fillMaxHeight()) {
                                Box(
                                    contentAlignment = Alignment.TopCenter,
                                    modifier = Modifier
                                        .animateContentSize()
                                        .width(350.dp)
                                        .height(220.dp)
                                ) {

                                    Card(
                                        modifier = Modifier.fillMaxSize(),
                                        colors = CardDefaults.cardColors(Color(0x33000000)),
                                        shape = RoundedCornerShape(4.dp)) {}

                                    Text(
                                        text = cardDescription,
                                        fontSize = 14.sp,
                                        color = Color.White,
                                        textAlign = TextAlign.Center,
                                        modifier = Modifier.fillMaxWidth().padding(8.dp))
                                }

                                Spacer(modifier = Modifier.height(20.dp))

                            }
                        }
                    }
                }
            }

        }
    }

}