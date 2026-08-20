package com.example.webwallpaperengine

import android.app.Activity
import android.os.Bundle
import android.view.KeyEvent
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.FrameLayout
import androidx.core.content.getSystemService

class KeyboardProxyActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val editText = EditText(this).apply {
            alpha = 0f
            setOnFocusChangeListener { _, hasFocus ->
                if (!hasFocus) finish()
            }
            setOnKeyListener { _, keyCode, event ->
                if (event.action == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                    finish()
                    true
                } else false
            }
        }
        setContentView(FrameLayout(this).apply { addView(editText) })
        editText.requestFocus()
        getSystemService<InputMethodManager>()?.showSoftInput(editText, InputMethodManager.SHOW_IMPLICIT)
    }
}
