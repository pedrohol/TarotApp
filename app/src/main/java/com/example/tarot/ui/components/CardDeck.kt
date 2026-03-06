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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun CardDeck() {
    Box(contentAlignment = Alignment.TopCenter) {
        Card(
            modifier = Modifier.height(130.dp).width(76.dp),
            shape = RoundedCornerShape(4.dp)
        ) {}

        Card(
            modifier = Modifier.height(129.dp).width(76.dp),
            shape = RoundedCornerShape(4.dp),
            colors = CardDefaults.cardColors(Color(0x33000000)),
            ) {}

        Card(
            modifier = Modifier.height(128.dp).width(76.dp),
            shape = RoundedCornerShape(4.dp)
        ) {}

        Card(
            modifier = Modifier.height(127.dp).width(76.dp),
            shape = RoundedCornerShape(4.dp),
            colors = CardDefaults.cardColors(Color(0x33000000)),
        ) {}

        Card(
            modifier = Modifier.height(126.dp).width(76.dp),
            shape = RoundedCornerShape(4.dp)
        ) {}

        Card(
            modifier = Modifier.height(125.dp).width(76.dp),
            shape = RoundedCornerShape(4.dp),
            colors = CardDefaults.cardColors(Color(0x33000000)),
        ) {}

        Card(
            modifier = Modifier.height(124.dp).width(76.dp),
            shape = RoundedCornerShape(4.dp),
        ) {}

        Card(
            modifier = Modifier.height(123.dp).width(76.dp),
            shape = RoundedCornerShape(4.dp),
            colors = CardDefaults.cardColors(Color(0x33000000)),
        ) {}

        Card(
            modifier = Modifier.height(122.dp).width(76.dp),
            shape = RoundedCornerShape(4.dp),
        ) {}

        Card(
            modifier = Modifier.height(121.dp).width(76.dp),
            shape = RoundedCornerShape(4.dp),
            colors = CardDefaults.cardColors(Color(0x33000000)),
        ) {}

        Card(
            modifier = Modifier.height(120.dp).width(76.dp),
            shape = RoundedCornerShape(4.dp),
        ) {}

        Card(
            modifier = Modifier.height(119.dp).width(76.dp),
            shape = RoundedCornerShape(4.dp),
            colors = CardDefaults.cardColors(Color(0x33000000)),
        ) {}

        Card(
            modifier = Modifier.height(118.dp).width(76.dp),
            shape = RoundedCornerShape(4.dp),
        ) {}

        Card(
            modifier = Modifier.height(117.dp).width(76.dp),
            shape = RoundedCornerShape(4.dp),
            colors = CardDefaults.cardColors(Color(0x33000000)),
        ) {}

        Card(
            modifier = Modifier.height(116.dp).width(76.dp),
            shape = RoundedCornerShape(4.dp),
        ) {}

    }
}
