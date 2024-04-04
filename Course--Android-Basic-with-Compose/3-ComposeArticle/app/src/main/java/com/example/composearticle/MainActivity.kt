package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Article(
                        title = stringResource(R.string.article_title_jetpack_compose_tutorial),
                        description = stringResource(R.string.article_description_jetpack_compose_tutorial),
                        content = stringResource(R.string.article_content_jetpack_compose_tutorial)
                    )
                }
            }
        }
    }
}

@Composable
fun Article(title: String, description: String, content: String, modifier: Modifier = Modifier) {
    val imgPainter = painterResource(id = R.drawable.bg_compose_background)
    Column(modifier = modifier)
    {
        Image(
            painter = imgPainter,
            contentDescription = null, //Because we don't want this to clutter TTS.
            modifier = modifier.fillMaxWidth()
        )
        Text(
            text = title,
            fontSize = 24.sp,
            fontWeight = FontWeight.ExtraBold,
            color = MaterialTheme.colorScheme.onBackground,
            modifier = modifier.padding(16.dp)
        )
        Text(
            text = description,
            fontWeight = FontWeight.Light,
            textAlign = TextAlign.Justify,
            color = MaterialTheme.colorScheme.onBackground,
            modifier = modifier.padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = content,
            textAlign = TextAlign.Justify,
            color = MaterialTheme.colorScheme.onBackground,
            modifier = modifier.padding(16.dp)
        )
    }
}

@Preview(showBackground = true, name = "Article Preview")
@Composable
fun ArticlePreview() {
    ComposeArticleTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Article(
                title = stringResource(R.string.article_title_jetpack_compose_tutorial),
                description = stringResource(R.string.article_description_jetpack_compose_tutorial),
                content = stringResource(R.string.article_content_jetpack_compose_tutorial)
            )
        }
    }
}