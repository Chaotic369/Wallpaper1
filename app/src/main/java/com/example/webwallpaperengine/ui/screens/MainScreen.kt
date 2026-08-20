package com.example.webwallpaperengine.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.webwallpaperengine.ui.theme.Ink
import com.example.webwallpaperengine.viewmodel.WallpaperViewModel
import kotlinx.coroutines.delay

@Composable
fun MainScreen(viewModel: WallpaperViewModel = viewModel()) {
    var currentScreen by remember { mutableStateOf(ScreenState.MAIN) }
    
    Box(modifier = Modifier.fillMaxSize().background(Ink)) {
        when (currentScreen) {
            ScreenState.MAIN -> {
                Column(Modifier.fillMaxSize().padding(16.dp)) {
                    Text("Main Settings placeholder")
                    // Implementation of Main UI
                }
            }
            ScreenState.SETTINGS -> SettingsScreen(onBack = { currentScreen = ScreenState.MAIN })
            ScreenState.HISTORY -> HistoryScreen(onBack = { currentScreen = ScreenState.MAIN })
        }
    }
}

enum class ScreenState { MAIN, SETTINGS, HISTORY }
