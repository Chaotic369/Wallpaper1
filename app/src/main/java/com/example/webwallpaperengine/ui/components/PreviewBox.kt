 package com.example.webwallpaperengine.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.webwallpaperengine.ui.theme.neumorphicInset

@Composable
fun PreviewBox() {
    Box(
        modifier = Modifier
            .size(100.dp, 200.dp)
            .neumorphicInset()
    ) {
        // Preview content
    }
}
