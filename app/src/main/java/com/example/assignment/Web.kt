package com.example.assignment

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class Web : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        val webViewVariable= findViewById<WebView>(R.id.WebView)
        webViewSetUp(webViewVariable)
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(webView: WebView){
        webView.webViewClient= WebViewClient()

        webView.apply {
            settings.javaScriptEnabled= true
            settings.safeBrowsingEnabled= true
            loadUrl("https://www.google.com/search?q=chrome&rlz=1C1ONGR_enIN1003IN1003&oq=chrome&aqs=chrome..69i57j0i131i433i512l3j5l4.1667j0j7&sourceid=chrome&ie=UTF-8")

        }
    }
}