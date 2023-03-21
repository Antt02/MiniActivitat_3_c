package com.example.share_activity

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.net.InterfaceAddress

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text = findViewById<TextView>(R.id.text)
        val rawText = intent.getStringExtra(Intent.EXTRA_TEXT)
        val retrieved = rawText?.split("\"")
        text.text = retrieved?.get(1)
    }

}