package com.example.jetpackcomposenavigation.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.navigation.NavController
import com.example.jetpackcomposenavigation.navigation.AppScreens
import androidx.compose.material3.TopAppBar
import com.example.jetpackcomposenavigation.navigation.AppScreens.FirstScreen.route

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FirstScreen(navController: NavController){
    Scaffold (
        topBar = { TopAppBar(title = { Text("FirstScreen")}) }
    )
    {
        BodyContent(navController)
    }
}

@Composable
fun BodyContent(navController: NavController){
    Column (modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "Hola navegación")
        Button(onClick = { navController.navigate(route= AppScreens.SecondScreen.route + "/Este es un parametro")}) {
            Text(text = "Navega")
        }
    }
}