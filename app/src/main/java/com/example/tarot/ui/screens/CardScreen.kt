package com.example.tarot.ui.screens

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.animateSizeAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.KeyboardArrowDown
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
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
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.tarot.R

@Preview
@Composable
fun CardScreen(navHostController: NavHostController = rememberNavController()) {

    var rotated by remember { mutableStateOf(true) }
    var showCard by remember { mutableStateOf(false)}
    val infiniteTransition = rememberInfiniteTransition(label = "iconTransition")

    val rotation by animateFloatAsState(
        targetValue = if (rotated) 180f else 0f,
        animationSpec = tween(durationMillis = 600, easing = FastOutSlowInEasing),
        label = "cardFlip")

    val arrowLoop by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = -14f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 1000, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "arrowAnimation"
    )

    val animatedAlpha by animateFloatAsState(
        targetValue = if (showCard) 1.0f else 0f,
        label = "alpha"
    )

    Scaffold() {innerPadding ->

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(Color(0xFF524480))) {

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

            Card(
                elevation = CardDefaults.cardElevation(6.dp),
                modifier = Modifier
                    .height(450.dp)
                    .width(250.dp)

                    .clickable{
                        rotated = false
                        showCard = true }
                    .graphicsLayer{
                        rotationY = rotation
                        cameraDistance = 12f * density
                    }) {

                if (rotation == 180f) {
                    Text(text = "Verso da Carte")

                } else {
                    Text(text = "Frente da Carta")
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Box(
                contentAlignment = Alignment.TopCenter,
                modifier = Modifier
                    .animateContentSize()
                    .width(350.dp)
                    .height(if (showCard) 180.dp else 0.dp)
                    .graphicsLayer{ alpha = animatedAlpha }
            ) {

                Card(
                    modifier = Modifier.fillMaxSize(),
                    colors = CardDefaults.cardColors(Color(0x33000000)),
                    shape = RoundedCornerShape(4.dp)) {}

                Text(
                    text = "CARD NAME",
                    fontSize = 14.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth().padding(8.dp))
            }

            Spacer(modifier = Modifier.height(10.dp))

            if (showCard) {
                Image(
                    painter = painterResource(id = R.drawable.arrow_down_icon),
                    contentDescription = "Close icon",
                    alignment = Alignment.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(60.dp)
                        .padding(10.dp)
                        .graphicsLayer{ translationY = arrowLoop },
                )
            }
        }

    }
    
}