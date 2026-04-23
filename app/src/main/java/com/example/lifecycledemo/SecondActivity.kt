package com.example.lifecycledemo

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    private val TAG = "PRINTEVENTS"
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Log.d(TAG, "SecondActivity onCreate called")

    }

        override fun onStart() {
            super.onStart()
            Log.d(TAG, "SecondActivity onStart called")
        }

        override fun onResume() {
            super.onResume()
            Log.d(TAG, "SecondActivity onResume called")
        }

        override fun onPause() {
            super.onPause()
            Log.d(TAG, "SecondActivity onPause called")
        }

        override fun onStop() {
            super.onStop()
            Log.d(TAG, "SecondActivity onStop called")
        }

        override fun onRestart() {
            super.onRestart()
            Log.d(TAG, "SecondActivity onRestart called")
        }

        override fun onDestroy() {
            super.onDestroy()
            Log.d(TAG, "SecondActivity onDestroy called")
        }
    }
