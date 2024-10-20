package com.example.cartevisite

import android.content.Context
import android.graphics.Paint.Align
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column



import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartevisite.ui.theme.CarteVisiteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CarteVisiteTheme {

                Scaffold(modifier = Modifier
                    .fillMaxSize()

                ) { innerPadding ->




                   MisePage (modifier = Modifier.padding(innerPadding))

                }
            }
        }
    }
}

@Composable
fun MisePage(modifier: Modifier = Modifier) {
    Box(
contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize(),

    ) {

        InfoComplementaire()
    }

}

@Composable
fun InfoComplementaire(modifier : Modifier = Modifier){
    val image = painterResource(id = R.drawable.android_logo)
Column(
horizontalAlignment = Alignment.CenterHorizontally
) {
    Column (){
        Image(  painter = image ,
            contentDescription = "PhotoProfil",

            modifier = Modifier
                .height(250.dp)
                .width(200.dp)
        )
        Text(
            text = "Ismael Camara",
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
            color = Color(0xFF3ddc84),
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Developpeur",
            fontSize = 16.sp,
            //color = Color(0xFF3ddc84),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
        )
    }
    val appIcon = Icons.Rounded

    Column(
        Modifier
            .padding(30.dp,60.dp,30.dp,60.dp)

    ) {
        Row (

        ){
            Icon(  appIcon.Call ,
                contentDescription = "Contact",
                
                )
            Text(
                text = "+225 07 89 13 05 85",

            )
        }
        Row (){
            Image(  appIcon.Home ,
                contentDescription = "Ecole",

                )
            Text(
                text = "Pigier Côte d'Ivoire"
            )
        }
        Row() {
            Image(  appIcon.Email ,
                contentDescription = "Email",

                )
            Text(
                text = "Ismaelcamara22@gmail.com"
            )
        }
    }

}


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CarteVisiteTheme {

    }
}
