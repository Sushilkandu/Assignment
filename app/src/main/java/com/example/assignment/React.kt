package com.example.assignment

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class React : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_react)
        val webViewVariable= findViewById<WebView>(R.id.React)
        webViewSetUp(webViewVariable)
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(webView: WebView){
        webView.webViewClient= WebViewClient()

        webView.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://www.google.com/search?q=geeksforgeekslink+course+of+react&rlz=1C1ONGR_enIN1003IN1003&ei=n-AuZPOYG_e7seMPsqGHYA&ved=0ahUKEwiz5OPXxJX-AhX3XWwGHbLQAQwQ4dUDCA8&uact=5&oq=geeksforgeekslink+course+of+react&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQAzIHCCEQoAEQCjIHCCEQoAEQCjIECCEQFToKCAAQRxDWBBCwAzoGCAAQHhANOggIABAeEA0QCjoICAAQCBAeEA06CggAEAgQHhANEA86CAgAEIoFEIYDOgYIABAWEB5KBAhBGABQ6QJYoiRgoTNoAXABeACAAZkCiAGbGJIBBTAuOS43mAEAoAEByAEIwAEB&sclient=gws-wiz-serp")

        }
    }
}