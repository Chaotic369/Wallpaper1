# Add project specific ProGuard rules here.
-keep class com.example.webwallpaperengine.service.WebWallpaperService { *; }
-keepclassmembers class * extends android.webkit.WebChromeClient { *; }
-keepclassmembers class * extends android.webkit.WebViewClient { *; }
