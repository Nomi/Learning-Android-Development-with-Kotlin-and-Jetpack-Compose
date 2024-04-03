package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = colorResource(id = R.color.background_light_green_ish)
                ) {
                    BusinessCard(
                        fullName = stringResource(R.string.full_name),
                        currentTitle = stringResource(R.string.current_title),
                        phone = stringResource(R.string.phone_number),
                        socialMedia = stringResource(R.string.social_media),
                        email = stringResource(R.string.email_address)
                    )
                }
            }
        }
    }
}

@Composable
private fun GeneralInfoCard(fullName: String, currentTitle: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier)
    {
        Image(
            painter = painterResource(id = R.drawable.avatar_1577909_1280),
            contentDescription = stringResource(R.string.photo_content_description),
            modifier = Modifier
                .width(200.dp)
                .border(BorderStroke(1.dp, Color.Black))
                .background(Color.Yellow)
            )
        Text(
            text = fullName,
            fontWeight = FontWeight.ExtraBold,
            color = Color.Black,
            fontSize = 48.sp
        )
        Text(
            text = currentTitle ,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            color = colorResource(id = R.color.foreground_auxiliary_dark_green_ish),
            fontSize = 24.sp
        )
    }
}

@Composable
private fun ContactInfoCard(phone: String, socialMedia: String, email: String, modifier: Modifier = Modifier) {
    Column (verticalArrangement = Arrangement.Center, modifier = modifier) {
        ContactInfoRow(
            text = phone,
            icon = Icons.Rounded.Phone,
            iconDescription = stringResource(R.string.phone_number_icon),
        )
        Spacer(Modifier.height(8.dp))
        ContactInfoRow(
            text = socialMedia,
            icon = Icons.Rounded.Share,
            iconDescription = stringResource(R.string.social_media_username_icon),
            modifier = Modifier//.padding(top = 6.dp, bottom = 6.dp) //replaced with spacers.
        )
        Spacer(Modifier.height(8.dp))
        ContactInfoRow(
            text = email,
            icon = Icons.Rounded.Email,
            iconDescription = stringResource(R.string.phone_number_icon),
        )
    }
}
@Composable
private fun ContactInfoRow(text: String, icon: ImageVector, iconDescription: String, modifier: Modifier = Modifier)
{
    Row(modifier = modifier) {
        Icon(
            icon,
            contentDescription = iconDescription,
            tint = colorResource(id = R.color.foreground_auxiliary_dark_green_ish),
            modifier = Modifier//.padding(end = 4.dp) //replaced with spacer.
        )
        Spacer(Modifier.width(4.dp))
        Text(
            text = text,
            textAlign = TextAlign.Start,
            color = Color.Black
        )
    }
}
@Composable
fun BusinessCard(fullName: String, currentTitle: String, phone: String, socialMedia: String, email: String, modifier: Modifier = Modifier) {
    Column(
//        verticalArrangement = Arrangement.Center,
// verticalArrangement is useless/not-needed-here cuz the GeneralInfoCard and ContactInfoCard
// (i.e. the column element inside them)
// fills the whole cell for each cell of the column due to use of weight function.

/*
// This also made me finally FULLY understand why we only give modifier to the FIRST element (/container)
// because we provide what's inside the component as a pre-built and styled unit, and
// the modifier provided to it is only used to set things like how our component should interact
// or displayed with the outside. E.g. padding, transparency (alpha), etc.
// So, I checked, and I was right:
// https://stackoverflow.com/questions/75653402/jetpack-compose-should-modifier-parameter-be-applied-to-the-outer-top-most-v
// Relevant answers from the above link;
        //https://stackoverflow.com/a/75653813
        //https://stackoverflow.com/a/75658660
// https://developer.android.com/develop/ui/compose/modifiers#extracting_and_reusing_scoped_modifiers
 */
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        GeneralInfoCard(
            fullName = fullName,
            currentTitle = currentTitle,
            modifier = modifier.weight(0.7F).padding(all = 16.dp)
        )
        ContactInfoCard(
            phone = phone,
            socialMedia = socialMedia,
            email = email,
            modifier = modifier.weight(0.3F).padding(all = 16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = colorResource(id = R.color.background_light_green_ish)
        ) {
            BusinessCard(
                fullName = stringResource(R.string.full_name),
                currentTitle = stringResource(R.string.current_title),
                phone = stringResource(R.string.phone_number),
                socialMedia = stringResource(R.string.social_media),
                email = stringResource(R.string.email_address)
            )
        }
    }
}