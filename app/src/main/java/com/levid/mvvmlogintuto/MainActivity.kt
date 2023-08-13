package com.levid.mvvmlogintuto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.levid.mvvmlogintuto.navigation.AppNavigation
import com.levid.mvvmlogintuto.ui.login.ui.LoginScreen
import com.levid.mvvmlogintuto.ui.login.ui.LoginViewModel
import com.levid.mvvmlogintuto.ui.theme.MVVMLoginTutoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MVVMLoginTutoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //LoginScreen(LoginViewModel())
                    AppNavigation()
                }
            }
        }
    }
}