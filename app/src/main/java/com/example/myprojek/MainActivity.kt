package com.example.myprojek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actButton = findViewById<Button>(R.id.ke_register)
        val buttonLogin = findViewById<Button>(R.id.buttonloginmain)

        buttonLogin.setOnClickListener(View.OnClickListener {
            val login = Intent(this, login_activity::class.java)
            startActivity(login)
        })

        actButton.setOnClickListener(View.OnClickListener {
            val register = Intent(this, register_activity::class.java)
            startActivity(register)
        })

    }
}