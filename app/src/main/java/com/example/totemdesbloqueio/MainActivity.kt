package com.example.totemdesbloqueio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun teladesbloqueio (view: View){
        val button = findViewById<Button>(R.id.buttonDesbloqueio1)
        val intent = Intent(this, screenDesbloqueio::class.java).apply {  }
        startActivity(intent)
        finish();
    }

    fun telaReset (view: View){
        val button = findViewById<Button>(R.id.buttonReset)
        val intent2 = Intent(this, screenReset::class.java).apply {  }
        startActivity(intent2)
        finish();
    }
}

