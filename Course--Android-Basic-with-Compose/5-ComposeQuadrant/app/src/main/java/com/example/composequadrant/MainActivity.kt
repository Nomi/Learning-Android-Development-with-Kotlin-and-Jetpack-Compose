package com.example.composequadrant

import android.os.Bundle
import android.text.Selection
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeQuadrantScreen()
                }
            }
        }
    }
}

@Composable
fun RowScope.Quadrant(title: String, body: String, backgroundColor: Color, modifier: Modifier = Modifier)
{
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .weight(0.5F, true)
            .fillMaxHeight()
            .background(color = backgroundColor)
            .padding(16.dp)
    //IMPORTANT: since order matters,
    // padding after background makes sure background covers full quadrant as is required.
    // Content however will be affected by padding.
    ) {
        Text(text = title, fontWeight = FontWeight.Bold, modifier = modifier.padding(bottom = 16.dp))
        Text(text = body, textAlign = TextAlign.Justify, modifier = modifier)
    }
}

@Composable
private fun ComposeInfoCard(title: String, body: String, backgroundColor: Color, modifier: Modifier = Modifier)
{
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxSize()
            .background(color = backgroundColor)
            .padding(16.dp)
        //IMPORTANT: since order matters,
        // padding after background makes sure background covers full quadrant as is required.
        // Content however will be affected by padding.
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = body,
            color = Color.Black,
            textAlign = TextAlign.Justify
        )
    }
}


@Composable
fun ComposeQuadrantScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Row(modifier = modifier.weight(1F,true)) {
            ComposeInfoCard(
                title = stringResource(id = R.string.text_composable_title),
                body =stringResource(id = R.string.text_composable_description),
                backgroundColor = colorResource(R.color.quadrant1),
                modifier.weight(1F)
            )
            ComposeInfoCard(
                title = stringResource(id = R.string.image_composable_title),
                body =stringResource(id = R.string.image_composable_description),
                backgroundColor = colorResource(R.color.quadrant2),
                modifier.weight(1F)
            )
        }
        Row(modifier = modifier.weight(1F,true)) {
            ComposeInfoCard(
                title = stringResource(id = R.string.row_composable_title),
                body =stringResource(id = R.string.row_composable_description),
                backgroundColor = colorResource(R.color.quadrant3),
                modifier.weight(1F)
            )
            ComposeInfoCard(
                title = stringResource(id = R.string.column_composable_title),
                body =stringResource(id = R.string.column_composable_description),
                backgroundColor = colorResource(R.color.quadrant4),
                modifier.weight(1F)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ComposableQuadrantScreenPreview() {
    ComposeQuadrantTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            ComposeQuadrantScreen()
        }
    }
}