package com.example.webwallpaperengine.data

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore

val Context.dataStore by preferencesDataStore(name = "settings")

object SettingsKeys {
    val SOURCE_URI = stringPreferencesKey("source_uri")
    val MEDIA_TYPE = stringPreferencesKey("media_type")
    val KEYBOARD_OVERLAY = booleanPreferencesKey("keyboard_overlay")
    val PAUSE_OBSCURED = booleanPreferencesKey("pause_obscured")
    val LOW_BATTERY = booleanPreferencesKey("low_battery")
}
