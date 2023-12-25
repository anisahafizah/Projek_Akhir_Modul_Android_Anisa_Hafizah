package com.example.myprojek

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class JobsheetActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jobsheet)

        val ImageView = findViewById<ImageView>(R.id.back_dasjob)

        ImageView.setOnClickListener{
            val intent = Intent(this, menuutama_Activity::class.java)
            startActivity(intent)
        }

        val TextView = findViewById<TextView>(R.id.job1)

        TextView.setOnClickListener{
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }

        val TextView1 = findViewById<TextView>(R.id.job2)

        TextView1.setOnClickListener{
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }
    }
}