 package com.example.webwallpaperengine.service

import android.content.Intent
import android.service.wallpaper.WallpaperService
import android.view.MotionEvent
import android.view.SurfaceHolder
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel

class WebWallpaperService : WallpaperService() {
    override fun onCreateEngine(): Engine {
        return WebEngine()
    }

    inner class WebEngine : Engine() {
        private val scope = CoroutineScope(Dispatchers.Main + SupervisorJob())
        
        override fun onSurfaceCreated(holder: SurfaceHolder) {
            super.onSurfaceCreated(holder)
            // Init WebView/ExoPlayer and draw to canvas or attach surface
        }

        override fun onVisibilityChanged(visible: Boolean) {
            super.onVisibilityChanged(visible)
            if (visible) {
                // resume
            } else {
                // pause
            }
        }

        override fun onTouchEvent(event: MotionEvent?) {
            super.onTouchEvent(event)
            // Dispatch to WebView
        }

        override fun onDestroy() {
            super.onDestroy()
            scope.cancel()
        }
    }
}
