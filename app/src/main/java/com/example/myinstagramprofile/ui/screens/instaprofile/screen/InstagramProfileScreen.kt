package com.example.myinstagramprofile.ui.screens.instaprofile.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myinstagramprofile.R
import com.example.myinstagramprofile.model.UserProfileDetails
import com.example.myinstagramprofile.model.UserProfileHighlights
import com.example.myinstagramprofile.model.UserProfilePost
import com.example.myinstagramprofile.ui.screens.instaprofile.components.ProfileActionView
import com.example.myinstagramprofile.ui.screens.instaprofile.components.ProfileDetailView
import com.example.myinstagramprofile.ui.screens.instaprofile.components.ProfileHighlightsView
import com.example.myinstagramprofile.ui.screens.instaprofile.components.ProfileTabView
import com.example.myinstagramprofile.ui.screens.instaprofile.components.TopBarView

/*
* InstagramProfileScreen is the main screen with composable function to showcase
* Profile UI. It has Static Profile Picture, Username, Bio,Follow, Highlights
* and post details.
*/

@Preview(showBackground = true)
@Composable
fun InstagramProfileScreen() {

    //prepare static hardcoded details

    val userProfileDetails = UserProfileDetails(
        userId = stringResource(R.string.userId),
        userName = stringResource(R.string.userName),
        userBio = stringResource(R.string.userBio),
        userProfilePicture = R.drawable.avatar,
        userPost = 12,
        userFollowers = 10,
        userFollowing = 10
    )

    val storyHighlight = listOf(
        UserProfileHighlights(R.drawable.indore, stringResource(R.string.highlight1)),
        UserProfileHighlights(R.drawable.mumbai, stringResource(R.string.highlight2)),
        UserProfileHighlights(R.drawable.delhi, stringResource(R.string.highlight3)),
        UserProfileHighlights(R.drawable.pune, stringResource(R.string.highlight4)),
        UserProfileHighlights(R.drawable.bnglr, stringResource(R.string.highlight1)),
    )

    val posts = listOf(
        UserProfilePost(painterResource(R.drawable.indore)),
        UserProfilePost(painterResource(R.drawable.mumbai)),
        UserProfilePost(painterResource(R.drawable.delhi)),
        UserProfilePost(painterResource(R.drawable.pune)),
        UserProfilePost(painterResource(R.drawable.bnglr)),
        UserProfilePost(painterResource(R.drawable.indore)),
        UserProfilePost(painterResource(R.drawable.mumbai)),
        UserProfilePost(painterResource(R.drawable.pune)),
        UserProfilePost(painterResource(R.drawable.delhi)),
        UserProfilePost(painterResource(R.drawable.bnglr)),
        UserProfilePost(painterResource(R.drawable.indore)),
        UserProfilePost(painterResource(R.drawable.mumbai))
    )


    // prepare vertical scroll for profile page
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxSize()
    ) {
        TopBarView(LocalContext.current, userProfileDetails)
        ProfileDetailView(userProfileDetails)
        Spacer(
            modifier = Modifier
                .size(20.dp)
        )
        ProfileActionView(LocalContext.current)
        Spacer(modifier = Modifier.size(20.dp))
        ProfileHighlightsView(storyHighlight)
        Spacer(modifier = Modifier.size(20.dp))
        ProfileTabView(userProfilePost = posts)
    }
}