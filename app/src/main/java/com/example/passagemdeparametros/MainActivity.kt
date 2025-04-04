package com.example.passagemdeparametros

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.example.passagemdeparametros.navigation.SetupNavGraph
import com.example.passagemdeparametros.ui.theme.PassagemDeParametrosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PassagemDeParametrosTheme {
                SetupNavGraph(navController = rememberNavController())
            }
        }
    }
}