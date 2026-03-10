package com.example.tarot.ui.components

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.tarot.R

@Preview
@Composable
fun LoadingCards() {

    val transition = rememberInfiniteTransition(label = "transition")
    val movementCard by transition.animateFloat(
        initialValue = 0f,
        targetValue = -20f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 1000,
                delayMillis = 0,
                easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse),
        label = "firstTransition"
    )

    Row(
        verticalAlignment = Alignment.Bottom,
        modifier = Modifier.padding(10.dp)){

        Card(
            shape = RoundedCornerShape(2.dp),
            colors = CardDefaults.cardColors(Color.White),
            modifier =
                Modifier
                .height(88.dp)
                .width(50.dp)
                .graphicsLayer{
                    rotationZ = -8f
                    translationY = movementCard }) {
            AsyncImage(
                model = R.drawable.card_back,
                contentDescription = "Card Back Loading"
            )
        }
        Card(
            shape = RoundedCornerShape(2.dp),
            colors = CardDefaults.cardColors(Color.White),
            modifier =
                Modifier
                    .height(88.dp)
                    .width(50.dp)
                    .graphicsLayer{ translationY = movementCard }) {
            AsyncImage(
                model = R.drawable.card_back,
                contentDescription = "Card Back Loading"
            )
        }
        Card(
            shape = RoundedCornerShape(2.dp),
            colors = CardDefaults.cardColors(Color.White),
            modifier =
                Modifier
                    .height(88.dp)
                    .width(50.dp)
                    .graphicsLayer{
                        rotationZ = 8f
                        translationY = movementCard }) {
            AsyncImage(
                model = R.drawable.card_back,
                contentDescription = "Card Back Loading"
            )
        }
    }
}