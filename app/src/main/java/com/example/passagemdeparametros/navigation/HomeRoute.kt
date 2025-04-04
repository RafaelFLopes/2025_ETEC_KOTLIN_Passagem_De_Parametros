package com.example.passagemdeparametros.navigation

import androidx.compose.runtime.Composable
import com.example.passagemdeparametros.data.getUserData
import com.example.passagemdeparametros.ui.screen.HomeScreen

@Composable
fun HomeRoute(userName: String){
    val user = getUserData(userName = userName)

    HomeScreen(user = user)
}