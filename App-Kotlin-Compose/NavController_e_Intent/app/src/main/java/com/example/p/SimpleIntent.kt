package com.example.p

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext // Importe LocalContext
import androidx.core.net.toUri

@Composable
fun SimpleIntentScreen() {
    val context = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Clique para abrir um site.")
        Button(
            onClick = {
                val intent = Intent(Intent.ACTION_VIEW, "https://www.google.com".toUri())
                // O sistema Android encontrará e iniciará a Activity que pode lidar com esta Intent
                // (navegador padrão do usuário)
                context.startActivity(intent)
            }
        ) {
            Text("Abrir Google")
        }
    }
}