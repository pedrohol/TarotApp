package com.example.tarot.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.tarot.R

@Preview
@Composable
fun CardDeck() {
    Box(contentAlignment = Alignment.TopCenter) {
        Card(
            modifier = Modifier.height(154.dp).width(78.dp),
            shape = RoundedCornerShape(4.dp)
        ) {}

        Card(
            modifier = Modifier.height(153.dp).width(78.dp),
            shape = RoundedCornerShape(4.dp),
            colors = CardDefaults.cardColors(Color(0x33000000)),
            ) {}

        Card(
            modifier = Modifier.height(152.dp).width(78.dp),
            shape = RoundedCornerShape(4.dp)
        ) {}

        Card(
            modifier = Modifier.height(151.dp).width(78.dp),
            shape = RoundedCornerShape(4.dp),
            colors = CardDefaults.cardColors(Color(0x33000000)),
        ) {}

        Card(
            modifier = Modifier.height(150.dp).width(78.dp),
            shape = RoundedCornerShape(4.dp)
        ) {}

        Card(
            modifier = Modifier.height(149.dp).width(78.dp),
            shape = RoundedCornerShape(4.dp),
            colors = CardDefaults.cardColors(Color(0x33000000)),
        ) {}

        Card(
            modifier = Modifier.height(148.dp).width(78.dp),
            shape = RoundedCornerShape(4.dp),
        ) {}

        Card(
            modifier = Modifier.height(147.dp).width(78.dp),
            shape = RoundedCornerShape(4.dp),
            colors = CardDefaults.cardColors(Color(0x33000000)),
        ) {}

        Card(
            modifier = Modifier.height(146.dp).width(78.dp),
            shape = RoundedCornerShape(4.dp),
        ) {}

        Card(
            modifier = Modifier.height(145.dp).width(78.dp),
            shape = RoundedCornerShape(4.dp),
            colors = CardDefaults.cardColors(Color(0x33000000)),
        ) {}

        Card(
            modifier = Modifier.height(144.dp).width(78.dp),
            shape = RoundedCornerShape(4.dp),
        ) {}

        Card(
            modifier = Modifier.height(143.dp).width(78.dp),
            shape = RoundedCornerShape(4.dp),
            colors = CardDefaults.cardColors(Color(0x33000000)),
        ) {}

        Card(
            modifier = Modifier.height(142.dp).width(78.dp),
            shape = RoundedCornerShape(4.dp),
        ) {}

        Card(
            modifier = Modifier.height(141.dp).width(78.dp),
            shape = RoundedCornerShape(4.dp),
            colors = CardDefaults.cardColors(Color(0x33000000)),
        ) {}

        Card(
            modifier = Modifier.height(140.dp).width(78.dp),
            shape = RoundedCornerShape(4.dp),
        ) {
            AsyncImage(
                model = R.drawable.card_back,
                contentDescription = "Card Back",
                contentScale = ContentScale.Crop
            )
        }

    }
}
