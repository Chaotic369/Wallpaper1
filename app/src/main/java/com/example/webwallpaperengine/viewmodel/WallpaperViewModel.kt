package com.example.webwallpaperengine.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class WallpaperViewModel : ViewModel() {
    private val _currentSource = MutableStateFlow("")
    val currentSource: StateFlow<String> = _currentSource

    fun setSource(source: String) {
        _currentSource.value = source
    }
}
