package com.example.totemdesbloqueio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import com.example.totemdesbloqueio.databinding.ActivityMainBinding

class screenReset : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_reset)

        val webView: WebView = findViewById(R.id.webViewReset)
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.loadUrl("https://github.com/luiz-08") // link to your company's portal to reset profile
        webView.webViewClient = WebViewClient()

        fun returnhome2 (view: View){
            val button = findViewById<Button>(R.id.ButtonFinalizarReset)
            webView.clearFormData();
            webView.clearHistory();
            webView.clearCache(true);
            finish();
        }
    }
}
