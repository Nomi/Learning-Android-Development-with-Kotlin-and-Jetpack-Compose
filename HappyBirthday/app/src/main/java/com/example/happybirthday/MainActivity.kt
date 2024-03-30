package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
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
                    Box(modifier = Modifier.fillMaxSize().background(color = Color.Transparent))
                    {
                        HappyBirthdayTheme {
                            GreetingAppImage(
                                message = "Happy Birthday Bob!",
                                from = "Wendy",
                                modifier = Modifier.fillMaxSize().padding(0.dp)
                                    .align(Alignment.Center)
                            )
                        }
                    }
                }
            }
        }
    }
}
@Composable
fun GreetingTextPlain(message: String, from: String, modifier: Modifier = Modifier) {
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
            text = "From $from",
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .weight(0.8F)
                .fillMaxWidth()
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
                modifier = Modifier
                    //.align(alignment = Alignment.Center)
                    .background(
                        MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.2F),
                        RoundedCornerShape(25)
                    )
            )
        }
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Bottom,
            modifier = Modifier
                .weight(0.2F)
                .fillMaxWidth()
        )
        {
            Text(
                text = "❤",
                fontSize = 18.sp,
                textAlign = TextAlign.Center,
                //modifier = Modifier.align(alignment = Alignment.BottomStart)
                //.padding(8.dp)
            )
            Text(
                text = "From $from",
                fontSize = 36.sp,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.ExtraLight,
                textAlign = TextAlign.Right,
                color = MaterialTheme.colorScheme.secondary,//Color.DarkGray,
//                modifier = Modifier.align(alignment = Alignment.End)
                modifier = Modifier
                    //.align(alignment = Alignment.BottomEnd)
                    .background(
                        color = MaterialTheme.colorScheme.secondaryContainer.copy(alpha = 0.2F),
                        shape = RoundedCornerShape(25)
                    )
                //.padding(8.dp)
            )
        }

    }
}

@Composable
fun GreetingAppImage(
    message: String,
    from: String,
    modifier: Modifier
) { //apparently @Composable functions with a return value should start with a lowercase letter? (like painterResource) What's the use? (apparently they don't draw?)
    val imgPainter: Painter = painterResource(id = R.drawable.androidparty)
    Box(
        modifier = modifier
    ) {
        Image(
            painter = imgPainter,
            contentDescription = null, //the image in this app is only included for decorative purposes. The addition of a content description for the image would make it harder to use with TalkBack in this particular case. Instead of setting the content description that's announced to the user, you can set the image's contentDescription argument to null so that TalkBack skips the Image composable.
            contentScale = ContentScale.Crop,
            alpha = 0.5F,
            alignment = Alignment.Center,
            modifier = Modifier.fillMaxSize()
        )
        GreetingText(message = message, from = from, modifier = Modifier.fillMaxSize().align(Alignment.Center))
    }

}

@Preview(showBackground = true, name = "Birthday Card Preview")
@Composable
fun BirthdayCardPreview() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Box(modifier = Modifier.fillMaxSize().background(color = Color.Transparent))
        {
            HappyBirthdayTheme {
//                        GreetingText(
//                            message = "Happy Birthday Bob!",
//                            from = "Wendy",
//                            modifier = Modifier.padding(8.dp)//.fillMaxSize(0.94F)
//                        )
                GreetingAppImage(
                    message = "Happy Birthday Bob!",
                    from = "Wendy",
                    modifier = Modifier.fillMaxSize().padding(0.dp).align(Alignment.Center)
                )
            }
        }
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