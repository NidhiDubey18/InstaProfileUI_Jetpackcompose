package com.example.myinstagramprofile.ui.screens.instaprofile.components

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myinstagramprofile.R

@Composable
fun ArchivedScreen() {

    CommonTextComponent(
        text = stringResource(R.string.Archived_Post),
        fontSize = 20.sp,
        modifier = Modifier.padding(20.dp)
    )
}