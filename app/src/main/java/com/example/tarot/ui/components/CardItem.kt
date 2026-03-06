package com.example.tarot.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun CardItem(onClick: () -> Unit = {}) {
    Card(
        modifier = Modifier.height(130.dp).width(76.dp).clickable{ onClick() },
        shape = RoundedCornerShape(4.dp)
    ) {}
}