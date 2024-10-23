package com.example.mad_practical2_22012011162

import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Log.i("MainActivity","onCreate")
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show()
        Snackbar.make(findViewById(R.id.helloworld), "onCreate", Snackbar.LENGTH_LONG).show()

    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity","onStart")
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
        Snackbar.make(findViewById(R.id.helloworld), "onStart", Snackbar.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity","onResume")
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show()
        Snackbar.make(findViewById(R.id.helloworld), "onResume", Snackbar.LENGTH_LONG).show()

    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity","onPause")
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show()
        Snackbar.make(findViewById(R.id.helloworld), "onPause", Snackbar.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MainActivity","onRestart")
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show()
        Snackbar.make(findViewById(R.id.helloworld), "onRestart", Snackbar.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity","onStop")
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show()
        Snackbar.make(findViewById(R.id.helloworld), "onStop", Snackbar.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity","onDestroy")
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show()
        Snackbar.make(findViewById(R.id.helloworld), "onDestroy", Snackbar.LENGTH_LONG).show()
    }


}