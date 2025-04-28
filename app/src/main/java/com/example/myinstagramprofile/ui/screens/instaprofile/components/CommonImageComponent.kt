package com.example.myinstagramprofile.ui.screens.instaprofile.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.myinstagramprofile.R

/*CommonImageComponent composable to load Image with default value
* to void repeat Image set call*/

@Composable
fun CommonImageComponent(
    painter: Painter = painterResource(R.drawable.avatar),
    contentDescription: String = "",
    modifier: Modifier = Modifier,
    contentScale: ContentScale = ContentScale.Crop
) {
    Image(
        painter = painter,
        contentDescription = contentDescription,
        modifier = modifier
            .size(80.dp)
            .clip(CircleShape)
            .background(Color.Gray)
            .border(2.dp, Color.DarkGray, CircleShape),
        contentScale = contentScale
    )
}