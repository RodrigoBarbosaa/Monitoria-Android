package com.example.p

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen(onNavigateToDetail: () -> Unit, onNavigateToGoogle: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Bem-vindo à Tela Inicial!")
        Button(onClick = onNavigateToDetail) {
            Text("Ir para Detalhes")
        }
        Button(onClick = onNavigateToGoogle) {
            Text("Abrir google")
        }
    }
}