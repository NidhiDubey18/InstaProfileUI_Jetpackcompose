package com.example.myinstagramprofile.ui.screens.instaprofile.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myinstagramprofile.R
import com.example.myinstagramprofile.model.UserProfileHighlights


/*ProfileHighlightsView composable to load horizontal scroll of story highlights*/
@Composable
fun ProfileHighlightsView(highlights: List<UserProfileHighlights>) {

    LazyRow(
        contentPadding = PaddingValues(horizontal = 10.dp),
    ) {
        item {
            Column(
                modifier = Modifier.padding(end = 8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(90.dp)
                        .clip(CircleShape)
                        .border(2.dp, color = Color.Black, shape = CircleShape)
                        .align(Alignment.CenterHorizontally)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.icons_plus),
                        contentDescription = "Add Highlight",
                        modifier = Modifier.size(24.dp)
                    )
                }
                Spacer(modifier = Modifier.padding(8.dp))
                CommonTextComponent(
                    text = stringResource(R.string.New),
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 15.sp
                )
            }
        }

        items(highlights.size) { indices ->
            Column(
                modifier = Modifier.padding(end = 8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                CommonImageComponent(
                    painter = painterResource(id = highlights[indices].highlights),
                    contentDescription = "",
                    modifier = Modifier
                        .size(90.dp)
                        .clip(CircleShape)
                        .border(2.dp, Color.LightGray, CircleShape)
                        .padding(5.dp),
                    contentScale = ContentScale.Crop
                )
                Spacer(
                    modifier = Modifier.padding(
                        8.dp
                    )
                )
                CommonTextComponent(
                    text = highlights[indices].highlightText,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 15.sp
                )
            }
        }
    }
}
