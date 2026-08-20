package com.example.webwallpaperengine.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.webwallpaperengine.ui.theme.Accent
import com.example.webwallpaperengine.ui.theme.Ink
import com.example.webwallpaperengine.ui.theme.Text

@Composable
fun SettingsScreen(onBack: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Ink)
            .padding(16.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("SETTINGS", color = Text)
            TextButton(onClick = onBack) {
                Text("BACK", color = Accent)
            }
        }
        // Toggles and dropdowns go here
    }
}
