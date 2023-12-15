package com.example.jetpackcomposenavigation.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SecondScreen(navController: NavController, text: String?){ // ? = No obligatorio
    Scaffold (topBar = {
        TopAppBar(title = {
            Text("Second Screen", maxLines = 1, overflow = TextOverflow.Ellipsis)
        },
            navigationIcon = { Icon(imageVector = Icons.Default.ArrowBack,
                contentDescription = "flecha regresar",
                modifier = Modifier.clickable { navController.popBackStack()}
            )
                Spacer(modifier = Modifier.width(16.dp))
            }
            )
    }
    ){
        SecondBodyContent(navController, text)
    }
}

@Composable
fun SecondBodyContent(navController: NavController, text: String?){
    Column (modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "He navegado")
        // Si el texto existe.
        text?.let {
            Text(text = it)
        }
        Button(onClick = { navController.popBackStack()}) {// popBackStack()
            Text(text = "Volver atras")
        }
    }
}