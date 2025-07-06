package com.example.p

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MyAppNavController() {
    // utilização do rememberNavController para manter uma intancia que sobrivive a recomposição
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {

        composable("home") {
            HomeScreen(
                onNavigateToDetail = {
                    navController.navigate("detail")
                },
                onNavigateToGoogle = {
                    navController.navigate("google")
                }
            )
        }

        // Destino para a tela de detalhes
        composable("detail") {
            DetailScreen(
                onNavigateBack = {
                    navController.popBackStack()
                }
            )
        }
        composable("google") {
            SimpleIntentScreen()
        }
    }
}

