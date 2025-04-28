package com.example.myinstagramprofile.ui.screens.instaprofile.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

/*CommonTextComponent composable to set Text on view it will avoid repeating
* Text composable call*/
@Composable
fun CommonTextComponent(
    text: String = "",
    fontWeight: FontWeight = FontWeight.Normal,
    fontSize: TextUnit = 15.sp,
    modifier: Modifier = Modifier,
    textColor: Color = Color.Black
) {
    Text(
        text = text,
        fontWeight = fontWeight,
        fontSize = fontSize,
        modifier = modifier,
        color = textColor,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis
    )
}