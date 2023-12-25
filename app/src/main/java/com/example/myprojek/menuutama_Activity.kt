package com.example.myprojek

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class menuutama_Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menuutama)

        val ImageView = findViewById<ImageView>(R.id.back_utama)

        ImageView.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            }

        val Button = findViewById<Button>(R.id.button9)

        Button.setOnClickListener{
            val intent = Intent(this, ReferensiActivity::class.java)
            startActivity(intent)
        }

        val ImageView1 = findViewById<ImageView>(R.id.profil)

        ImageView1.setOnClickListener{
            val intent = Intent(this, AkunActivity::class.java)
            startActivity(intent)
        }

        val Button1 = findViewById<Button>(R.id.button_jobsheet)

        Button1.setOnClickListener{
            val intent = Intent(this, JobsheetActivity::class.java)
            startActivity(intent)
        }


    }
}