package com.example.photo2slides

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Photo2SlidesApp()
        }
    }
}

@Composable
fun Photo2SlidesApp() {
    MaterialTheme {
        Surface {
            Text("مرحباً — مشروع Photo2Slides skeleton")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Photo2SlidesApp()
}
