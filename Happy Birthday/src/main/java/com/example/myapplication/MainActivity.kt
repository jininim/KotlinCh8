package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.Kotlin_0704Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Kotlin_0704Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                )
                {
                    BirthdayGreetingWithText(message = "Happy Birthday jin!", from = "- from Emma")
                }
            }
        }
    }
}

@Composable
fun BirthdayGreetingWithText(message: String, from: String) {
    Column() {
        Text(
            text = message,
            fontSize = 36.sp
        )
        Text(
            text = from,
            fontSize = 24.sp
        )
    }
    }


@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    Kotlin_0704Theme {
        BirthdayGreetingWithText(message = "Happy Birthday jin!", from = "- from Emma")
    }
}