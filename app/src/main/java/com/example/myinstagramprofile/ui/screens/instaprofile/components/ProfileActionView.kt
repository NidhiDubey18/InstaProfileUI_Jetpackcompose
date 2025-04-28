package com.example.myinstagramprofile.ui.screens.instaprofile.components

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myinstagramprofile.R

/*ActionButtons composable render Edit and share profile Text buttons */
@Composable
fun ProfileActionView(context: Context) {
    Row(horizontalArrangement = Arrangement.SpaceEvenly) {
        val modifier = Modifier
            .padding(10.dp, 0.dp, 0.dp, 0.dp)
            .height(40.dp)
            .border(2.dp, color = Color.Black, shape = RoundedCornerShape(6.dp))
            .wrapContentSize(Alignment.Center)
            .padding(20.dp, 0.dp, 20.dp, 0.dp)

        Box(modifier = modifier.weight(1f)) {
            CommonTextComponent(text = stringResource(R.string.Edit_Profile),
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.clickable {
                    Toast.makeText(
                        context,
                        R.string.Edit_Profile,
                        Toast.LENGTH_SHORT
                    ).show()
                })
        }

        Box(modifier = modifier.weight(1f)) {
            CommonTextComponent(text = stringResource(R.string.Share_Profile),
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.clickable {
                    Toast.makeText(context, R.string.Share_Profile, Toast.LENGTH_SHORT).show()
                })
        }
        Box(modifier = modifier) {
            Image(
                painter = painterResource(R.drawable.add), contentDescription = "",
                modifier = Modifier.size(20.dp),
            )
        }
        Spacer(Modifier.padding(end = 10.dp))
    }
}