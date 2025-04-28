package com.example.myinstagramprofile.ui.screens.instaprofile.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myinstagramprofile.R
import com.example.myinstagramprofile.model.UserProfileDetails


/* ProfileDetailView composable to show profile pic, bio , username and stats */
@Composable
fun ProfileDetailView(userProfileDetails: UserProfileDetails) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp, 5.dp, 5.dp, 5.dp),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                modifier = Modifier.size(80.dp)
            ) {
                CommonImageComponent(
                    painter = painterResource(id = userProfileDetails.userProfilePicture),
                    contentDescription = "Profile Image",
                    modifier = Modifier
                        .size(100.dp)
                        .clip(CircleShape)
                )
                Icon(
                    painter = painterResource(id = R.drawable.addd),
                    contentDescription = "Add",
                    modifier = Modifier
                        .size(20.dp)
                        .offset(x = -4.dp, y = 4.dp)
                        .align(Alignment.BottomEnd)
                        .clip(CircleShape)
                        .background(Color.White)
                )

            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp, 15.dp, 15.dp, 0.dp)
            ) {
                // getting yellow alert because it is already initialized
                userProfileDetails.userName.let {
                    CommonTextComponent(
                        text = userProfileDetails.userName,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }

                Spacer(modifier = Modifier.padding(0.dp, 5.dp, 0.dp, 5.dp))

                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(
                        modifier = Modifier.weight(1f)
                    ) {
                        CommonTextComponent(
                            text = userProfileDetails.userPost.toString(),
                            fontWeight = FontWeight.Normal
                        )
                        CommonTextComponent(
                            text = stringResource(R.string.Post), fontWeight = FontWeight.Normal
                        )
                    }

                    Column(
                        modifier = Modifier.weight(1f)
                    ) {
                        CommonTextComponent(
                            text = userProfileDetails.userFollowing.toString(),
                            fontWeight = FontWeight.Normal
                        )

                        CommonTextComponent(
                            text = stringResource(R.string.Following),
                            fontWeight = FontWeight.Normal
                        )
                    }

                    Column(
                        modifier = Modifier.weight(1f)
                    ) {

                        CommonTextComponent(
                            text = userProfileDetails.userFollowers.toString(),
                            fontWeight = FontWeight.Normal
                        )

                        CommonTextComponent(
                            text = stringResource(R.string.Followers),
                            fontWeight = FontWeight.Normal
                        )
                    }
                }
            }
        }

        CommonTextComponent(
            text = userProfileDetails.userBio,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(10.dp, 15.dp, 0.dp, 0.dp)
        )
    }
}