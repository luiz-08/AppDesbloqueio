package com.example.totemdesbloqueio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.TextKeyListener.clear
import android.util.Log
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import androidx.navigation.ui.setupActionBarWithNavController



class screenReset : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_reset)

        val webView: WebView = findViewById<WebView>(R.id.webViewReset)
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.loadUrl("http://resetdesenha.ambev.com.br/") // link to your company's portal to reset profile
        webView.webViewClient = WebViewClient()
    }

    fun returnhomereset (view: View, webView: WebView){
        webView.clearHistory();
        webView.clearCache(true);
        webView.clearFormData()

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish();
    }
}
