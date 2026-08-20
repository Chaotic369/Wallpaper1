package com.example.webwallpaperengine.util

object UrlUtil {
    fun formatUrl(input: String): String {
        return if (!input.startsWith("http://") && !input.startsWith("https://") && !input.startsWith("file:///") && !input.startsWith("content:") && !input.startsWith("blob:")) {
            "https://$input"
        } else {
            input
        }
    }
}
