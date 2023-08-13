package com.levid.mvvmlogintuto.navigation

sealed class AppScreens(val route: String){
    object  MainScreen: AppScreens("main_screen")
    object LoginScreen: AppScreens("login_screen")

}
