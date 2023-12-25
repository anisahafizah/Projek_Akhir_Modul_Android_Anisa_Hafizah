package com.example.myprojek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ReferensiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_referensi)

        val ImageView = findViewById<ImageView>(R.id.back_das)

        ImageView.setOnClickListener{
            val intent = Intent(this, menuutama_Activity::class.java)
            startActivity(intent)
        }
    }
}