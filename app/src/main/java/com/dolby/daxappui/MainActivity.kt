package com.dolby.daxappui

import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = Intent()
        intent.component = ComponentName("com.android.settings", "com.android.settings.DolbyMainActivity")
        startActivity(intent)

        // Close the app so it doesn't remain in the background
        finish()
    }
}
