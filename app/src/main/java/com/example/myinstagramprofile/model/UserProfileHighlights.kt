package com.example.myinstagramprofile.model

import androidx.annotation.DrawableRes

/*ProfileHighlightsView class will hold the information about
user archive their story in highlight section*/

data class UserProfileHighlights(@DrawableRes val highlights: Int, val highlightText: String)

