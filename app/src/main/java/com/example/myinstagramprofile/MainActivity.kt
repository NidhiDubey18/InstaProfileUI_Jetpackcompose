package com.example.myinstagramprofile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.myinstagramprofile.ui.screens.instaprofile.screen.InstagramProfileScreen

/* Launch UI screens from MainActivity */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InstagramProfileScreen()
        }
    }
}