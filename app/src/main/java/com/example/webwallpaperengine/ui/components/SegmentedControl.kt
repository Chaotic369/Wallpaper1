package com.example.webwallpaperengine.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.webwallpaperengine.ui.theme.Ink

@Composable
fun SegmentedControl() {
    Row(modifier = Modifier.fillMaxWidth().background(Ink).padding(4.dp)) {
        Text("WEB")
        Text("VIDEO")
        Text("HTML")
    }
}
