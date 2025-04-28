package com.example.myinstagramprofile.ui.screens.instaprofile.components

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myinstagramprofile.R
import com.example.myinstagramprofile.model.UserProfileDetails

/* TopBarView composable is used to show username on Top of screen
*  with 2 action buttons to show simple Toast msg
*/
@OptIn(ExperimentalMaterial3Api::class)  // avoid compilation error with TopAppBase
@Composable
fun TopBarView(
    context: Context, userProfileDetails: UserProfileDetails
) {
    TopAppBar(title = {
        Row(
            verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier.weight(1f), verticalAlignment = Alignment.CenterVertically
            ) {
                //using let here just to check if the data is not null , as the classes are already initialzed
                // its giving warning to remove let
                userProfileDetails.userId.let {
                    CommonTextComponent(
                        text = userProfileDetails.userId,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                    )
                }
                Icon(
                    imageVector = Icons.Default.KeyboardArrowDown,
                    contentDescription = "Dropdown Icon",
                    modifier = Modifier.size(25.dp)
                )
            }
        }
    }, actions = {
        IconButton(onClick = {
            Toast.makeText(context, R.string.Profile, Toast.LENGTH_SHORT).show()
        }) {
            Icon(
                painter = painterResource(R.drawable.at_the),
                contentDescription = "Msg",
                modifier = Modifier.size(25.dp)
            )
        }
        IconButton(onClick = {
            Toast.makeText(context, R.string.Msg, Toast.LENGTH_SHORT).show()
        }) {
            Icon(
                painter = painterResource(R.drawable.send),
                contentDescription = "Follow",
                modifier = Modifier.size(25.dp)
            )
        }
        IconButton(onClick = {
            Toast.makeText(context, R.string.Drawer, Toast.LENGTH_SHORT).show()
        }) {
            Icon(
                painter = painterResource(R.drawable.bars),
                contentDescription = "Follow",
                modifier = Modifier.size(25.dp)
            )
        }
    })
}
