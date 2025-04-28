package com.example.myinstagramprofile.ui.screens.instaprofile.components

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.myinstagramprofile.R
import com.example.myinstagramprofile.model.UserProfilePost

/* ProfileTabView composable rendering Tab layout with Icons
* Post and Archived post are 2 tab options */
@Composable
fun ProfileTabView(userProfilePost: List<UserProfilePost>) {
    var selectedTabIndex by remember { mutableStateOf(0) }
    val tabIcons =
        listOf(
            painterResource(R.drawable.profile),
            painterResource(R.drawable.video),
            painterResource(R.drawable.user)
        )

    TabRow(selectedTabIndex = selectedTabIndex) {
        tabIcons.forEachIndexed { index, painter ->
            Tab(
                selected = selectedTabIndex == index,
                onClick = { selectedTabIndex = index },
                icon = {
                    Icon(
                        painter,
                        null,
                        Modifier.size(30.dp),
                        tint = Color.Black
                    )
                }
            )
        }
    }
    when (selectedTabIndex) {
        0 -> ProfilePostView(userProfilePost)
        1 -> ArchivedScreen()
        2 -> ArchivedScreen()
    }
}
