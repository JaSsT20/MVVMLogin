package com.levid.mvvmlogintuto.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.levid.mvvmlogintuto.screens.MainScreen
import com.levid.mvvmlogintuto.ui.login.ui.LoginScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    
    NavHost(navController = navController, startDestination = AppScreens.LoginScreen.route){
        composable(route = AppScreens.LoginScreen.route){
            LoginScreen(viewModel = viewModel(), navController)
        }
        composable(route = AppScreens.MainScreen.route){
            MainScreen(navController)
        }

    }


}