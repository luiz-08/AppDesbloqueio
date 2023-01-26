package com.example.totemdesbloqueio

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.Toast;


class screenDesbloqueio : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_desbloqueio)

        val webView: WebView = findViewById(R.id.webViewDesbloqueio)
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.loadUrl("http://desbloqueio.ambev.com.br/") // link to your company's portal to unlock
        webView.webViewClient = WebViewClient()
    }

    fun returnhomedesbloqueio (view: View, webView: WebView){
        webView.clearHistory();
        webView.clearCache(true);
        webView.clearFormData()

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish();
    }
}




















