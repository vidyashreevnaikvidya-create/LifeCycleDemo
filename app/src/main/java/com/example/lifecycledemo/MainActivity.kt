package com.example.lifecycledemo

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private val TAG = "PRINTEVENTS"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val button = findViewById<Button>(R.id.btn)


        button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
            finish()
        }

        Log.d(TAG, "MainActivity onCreate called")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "MainActivity onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "MainActivity onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "MainActivity onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "MainActivity onStop called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "MainActivity onRestart called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "MainActivity onDestroy called")
    }
}