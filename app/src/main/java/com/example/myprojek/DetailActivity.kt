package com.example.myprojek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val ImageView = findViewById<ImageView>(R.id.back_dasdetail)

        ImageView.setOnClickListener{
            val intent = Intent(this, JobsheetActivity::class.java)
            startActivity(intent)
        }
    }
}