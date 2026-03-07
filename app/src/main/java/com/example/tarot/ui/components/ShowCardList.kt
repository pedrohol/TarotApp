package com.example.tarot.ui.components

import android.icu.number.Scale
import androidx.compose.animation.animateContentSize
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
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.LineBreak
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.tarot.R
import com.example.tarot.model.Card
import com.example.tarot.ui.theme.tarotFontFamily

@Preview
@Composable
fun ShowCardList(card: Card = Card("3 de Espadas","O 3 de Espadas geralmente significa algo doloroso em sua vida. Seu coração pode estar partido por conta de alguma situação ou de alguém. É necessário encontrar o equilíbrio em meio à tristeza para poder voltar a uma frequência positiva. Não seja vítima das injustiças, a vida às vezes bate forte, mas sempre temos o poder de nos levantar. Sugere que você deve ser honesto(a) com você mesmo(a) e parar de se enganar. Use o poder do seu intelecto e da razão, é a hora de dar a volta por cima e recomeçar.",R.drawable.card_dez_de_paus)) {

    var rotated by remember { mutableStateOf(true) }
    var showCard by remember { mutableStateOf(false)}
    val infiniteTransition = rememberInfiniteTransition(label = "iconTransition")

    val rotation by animateFloatAsState(
        targetValue = if (rotated) 180f else 0f,
        animationSpec = tween(durationMillis = 600, easing = FastOutSlowInEasing),
        label = "cardFlip")

    val animatedAlpha by animateFloatAsState(
        targetValue = if (showCard) 1.0f else 0f,
        label = "alpha"
    )

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {

        Card(
            colors = CardDefaults.cardColors(Color.White),
            elevation = CardDefaults.cardElevation(6.dp),
            modifier = Modifier
                .height(460.dp)
                .width(264.dp)

                .clickable{
                    rotated = !rotated
                    showCard = !showCard }
                .graphicsLayer{
                    rotationY = rotation
                    cameraDistance = 12f * density
                }) {

            if (rotation > 90f) {
                AsyncImage(
                    model = R.drawable.card_back,
                    contentDescription = "Card Back",
                    contentScale = ContentScale.Crop
                )

            } else if (rotation <= 90f) {
                Box(contentAlignment = Alignment.Center,
                    modifier = Modifier.fillMaxSize())
                {
                    AsyncImage(
                        model = card.image,
                        contentDescription = "Card Front",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(height = 450.dp, width = 256.dp)

                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Column(modifier = Modifier
            .animateContentSize()
            .height( if(showCard) 260.dp else 0.dp )
            .graphicsLayer{
                alpha = animatedAlpha
            }) {

            Text(
                text = card.name,
                fontSize = 22.sp,
                color = Color.White,
                textAlign = TextAlign.Center,
                fontFamily = tarotFontFamily,
                modifier = Modifier.fillMaxWidth().padding(top = 8.dp, start = 8.dp, end = 8.dp))

            Text(
                text = card.description,
                fontSize = 19.sp,
                color = Color.White,
                textAlign = TextAlign.Center,
                fontFamily = tarotFontFamily,
                style = TextStyle(lineBreak = LineBreak.Paragraph),
                modifier = Modifier.fillMaxWidth().padding(8.dp))

            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}
