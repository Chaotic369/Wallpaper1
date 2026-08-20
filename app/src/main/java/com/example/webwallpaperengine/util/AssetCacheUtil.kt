package com.example.webwallpaperengine.util

import android.content.Context
import java.io.File

object AssetCacheUtil {
    fun clearCache(context: Context) {
        context.cacheDir.deleteRecursively()
    }
}
