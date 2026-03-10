package com.example.tarot.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.tarot.model.Card

@Preview
@Composable
fun CardItem(cardImage: Int, onClick: () -> Unit = {}) {
    Card(
        colors = CardDefaults.cardColors(Color.White),
        modifier = Modifier.height(140.dp).width(76.dp).clickable{ onClick() },
        shape = RoundedCornerShape(4.dp)) {
        AsyncImage(
            model = cardImage,
            contentDescription = "Card Front",
            contentScale = ContentScale.Crop,
            modifier = Modifier.padding(2.dp)
        )
    }
}