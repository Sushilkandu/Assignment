package com.example.assignment

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class AndroidDevelopment : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_development)
        val webViewVariable= findViewById<WebView>(R.id.AndroidView)
        webViewSetUp(webViewVariable)
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(webView: WebView){
        webView.webViewClient= WebViewClient()

        webView.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://www.google.com/search?q=android+.com+geeksforgeeks&rlz=1C1ONGR_enIN1003IN1003&ei=R9ouZPmILs6MseMPsceV2AY")

        }
    }
}