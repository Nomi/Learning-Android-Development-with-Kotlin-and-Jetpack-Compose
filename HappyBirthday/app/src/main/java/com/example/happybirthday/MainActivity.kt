package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText(message = "Happy Birthday Sam!", from="Emma", modifier = Modifier.padding(8.dp))
                }
            }
        }
    }
}
@Composable
fun GreetingText(message: String, from:String, modifier: Modifier = Modifier) {
    Column (
        modifier = modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.Center,
    ) {
        Box(
            modifier = modifier.weight(0.9F).fillMaxWidth()
        )
        {
            Text(
                text = message,
                fontSize = 70.sp,
                lineHeight = 75.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                //        color = Color.Red,
                style = TextStyle.Default.copy(
                    brush = Brush.linearGradient(
                        0.11F to Color.Yellow,
                        0.44F to Color.Red,
                        0.77F to Color.Blue,
                        tileMode = TileMode.Mirror
                    ),
                ),
                modifier = Modifier.align(alignment = Alignment.Center)

            )
        }
        Box(modifier=modifier.padding(15.dp).weight(0.1F).fillMaxWidth())
        {
            Text(
                text="❤",
                fontSize = 18.sp,
                textAlign = TextAlign.Center,
                modifier = modifier.align(alignment = Alignment.BottomStart)
                    //.padding(8.dp)
                )
            Text(
                text = "From $from",
                fontSize = 36.sp,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.ExtraLight,
                textAlign = TextAlign.Right,
                color = Color.DarkGray,
//                modifier = Modifier.align(alignment = Alignment.End)
                modifier = modifier.align(alignment = Alignment.BottomEnd)
                    //.padding(8.dp)
            )
        }

    }
}

@Preview(showBackground = true, name="Birthday Card Preview")
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        GreetingText(message = "Happy Birthday Bob!", from = "Wendy")
    }
}


/* // Their solution:
package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText(
                        message = "Happy Birthday Sam!",
                        from = "From Emma",
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = message,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        GreetingText(message = "Happy Birthday Sam!", from = "From Emma")
    }
}
 */