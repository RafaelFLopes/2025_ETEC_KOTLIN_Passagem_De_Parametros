package com.example.passagemdeparametros.navigation

import com.example.passagemdeparametros.navigation.Routes.HOME_ROUTE
import com.example.passagemdeparametros.navigation.Routes.LOGIN_ROUTE

sealed class Screens(val route: String) {
    object LoginScreen : Screens(LOGIN_ROUTE)
    object HomeScreen : Screens(HOME_ROUTE)
}