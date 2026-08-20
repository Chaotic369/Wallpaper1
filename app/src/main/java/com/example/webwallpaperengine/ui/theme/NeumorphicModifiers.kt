package com.example.webwallpaperengine.ui.theme

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.gestures.waitForUpOrCancellation
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

fun Modifier.neumorphicOutset(
    cornerRadius: Dp = 16.dp,
    lightShadowColor: Color = Color(0x1AE7E2B4),
    darkShadowColor: Color = Color(0x99000000)
) = this.drawBehind {
    // Simplified outset shadow for LLM prompt context
    drawRect(color = Color.Transparent)
}

fun Modifier.neumorphicInset(
    cornerRadius: Dp = 16.dp,
    lightShadowColor: Color = Color(0x1AE7E2B4),
    darkShadowColor: Color = Color(0x99000000)
) = this.drawBehind {
    drawRect(color = Color.Transparent)
}

fun Modifier.neumorphicPressable(
    interactionSource: MutableInteractionSource,
    onClick: () -> Unit
): Modifier = composed {
    var isPressed by remember { mutableStateOf(false) }
    val scale by animateFloatAsState(targetValue = if (isPressed) 0.98f else 1f, label = "scale")
    
    this
        .graphicsLayer {
            scaleX = scale
            scaleY = scale
        }
        .pointerInput(Unit) {
            awaitPointerEventScope {
                while (true) {
                    awaitFirstDown(requireUnconsumed = false)
                    isPressed = true
                    val up = waitForUpOrCancellation()
                    isPressed = false
                    if (up != null) {
                        onClick()
                    }
                }
            }
        }
}
