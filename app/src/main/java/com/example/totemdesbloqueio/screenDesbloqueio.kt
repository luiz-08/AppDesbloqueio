package com.example.totemdesbloqueio

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import com.example.totemdesbloqueio.databinding.ActivityMainBinding
import android.widget.Toast;


class screenDesbloqueio : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_desbloqueio)

        val webView: WebView = findViewById(R.id.webViewDesbloqueio)
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.loadUrl("https://github.com/luiz-08") // link to your company's portal to unlock
        webView.webViewClient = WebViewClient()

        fun returnhome (view: View){
            val button = findViewById<Button>(R.id.ButtonFinalizarDesbloqueio)
            webView.clearFormData();
            webView.clearHistory();
            webView.clearCache(true);
            finish();
        }
    }
}




















