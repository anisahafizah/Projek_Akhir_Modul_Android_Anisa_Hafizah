package com.example.myprojek

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class AkunActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_akun)

        val ImageView = findViewById<ImageView>(R.id.back_dasprofil)

        ImageView.setOnClickListener{
            val intent = Intent(this, menuutama_Activity::class.java)
            startActivity(intent)
        }

        val TextView = findViewById<TextView>(com.google.android.material.R.id.layout)

        TextView.setOnClickListener{
            val intent = Intent(this, menuutama_Activity::class.java)
            startActivity(intent)
        }
    }
}