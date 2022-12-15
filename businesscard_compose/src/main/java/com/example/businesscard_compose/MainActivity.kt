package com.example.businesscard_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard_compose.ui.theme.Kotlin_0704Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Kotlin_0704Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting()
                }

            }
        }
    }
}

@Composable
//화면 출력
fun Greeting() {
    Column(modifier = Modifier.fillMaxSize()) {
        topScreen("이진", "성결대학교")
        bottomScreen("010-4749-0000", "haks444@naver.com")
    }
}

@Composable
fun topScreen(name: String, title: String) {
    val image = painterResource(id = R.drawable.ic_banner_foreground)
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(500.dp)
            .wrapContentWidth(CenterHorizontally)
            .wrapContentHeight(CenterVertically)
    ) {
        Image(painter = image, contentDescription = null, modifier = Modifier.fillMaxWidth())
        Text(
            text = name,
            textAlign = TextAlign.Center,
            fontSize = 24.sp,
            modifier = Modifier
                .wrapContentWidth(CenterHorizontally)
                .fillMaxWidth()
        )
        Text(
            text = title,
            textAlign = TextAlign.Center,
            fontSize = 24.sp,
            modifier = Modifier
                .wrapContentWidth(CenterHorizontally)
                .fillMaxWidth()
        )
    }
}

@Composable
fun bottomScreen(number: String, email: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(CenterHorizontally)
            .wrapContentHeight(CenterVertically)
    ) {
        Row() {
            Icon(
                painter = painterResource(id = R.drawable.ic_baseline_add_ic_call_24),
                contentDescription = null,
                modifier = Modifier
                    .padding(end = 10.dp)
            )
            Text(text = number)
        }
        Row() {
            Icon(
                painter = painterResource(id = R.drawable.ic_baseline_email_24),
                contentDescription = null,
                modifier = Modifier
                    .padding(end = 10.dp)
            )
            Text(text = email)
        }

    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    Kotlin_0704Theme {
        Greeting()
    }
}