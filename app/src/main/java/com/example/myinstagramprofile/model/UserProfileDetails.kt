package com.example.myinstagramprofile.model

import androidx.annotation.DrawableRes


/*UserProfileDetails class will hold the basic user information*/

data class UserProfileDetails(
    val userId: String,
    val userName: String,
    val userBio: String,
    @DrawableRes val userProfilePicture: Int,
    val userPost: Int,
    val userFollowers: Int,
    val userFollowing: Int
)
