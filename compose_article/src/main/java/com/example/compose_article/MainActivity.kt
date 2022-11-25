package com.example.compose_article

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose_article.ui.theme.Kotlin_0704Theme

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
                    ImageGreeting2(
                        text1 = "All tasks completed",
                        text2 = "Nice work!"

                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(text1 : String , text2: String) {
    Text(
        text = text1,
        fontSize=24.sp,

        modifier = Modifier
            .padding(top = 24.dp, end = 8.dp)
            .fillMaxWidth()
            .fillMaxHeight()
            .wrapContentWidth(CenterHorizontally)
            .wrapContentHeight(CenterVertically)
    )
    Text(
        text = text2,
        textAlign = TextAlign.Justify,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .wrapContentWidth(CenterHorizontally)
            .wrapContentHeight(CenterVertically)


    )

}
//@Composable
//fun ImageGreeting(text1 : String , text2: String){
//    val image = painterResource(id = R.drawable.bg_compose_background)
//    Column() {
//        Image(
//            painter = image,
//            contentDescription = null,
//            modifier = Modifier
//                .fillMaxWidth()
//        )
//        Greeting(text1 = text1, text2 = text2)
//    }
//}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Kotlin_0704Theme {
        ImageGreeting2(
            text1 = "All tasks completed",
            text2 = "Nice work!"
        )
    }
}

@Composable
fun ImageGreeting2(text1 : String , text2: String){
    val image = painterResource(id = R.drawable.ic_task_completed)
    Box() {
        Column() {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .wrapContentWidth(CenterHorizontally)
                    .wrapContentHeight(CenterVertically)

            )
            Greeting(text1 = text1, text2 = text2)
        }


    }

}