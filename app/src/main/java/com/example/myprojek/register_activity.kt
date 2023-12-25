package com.example.myprojek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.provider.ContactsContract.CommonDataKinds.Email
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.myprojek.api.ApiConfig
import com.example.myprojek.model.ResponModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class  register_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        val registerButton = findViewById<Button>(R.id.button_register)

        val ButtonLogin = findViewById<Button>(R.id.ke_login)

        ButtonLogin.setOnClickListener(View.OnClickListener {
            val register = Intent(this, login_activity::class.java)
            startActivity(register)
        })


        registerButton.setOnClickListener {
            register()
        }


    }

    fun register() {
        val usernameEdit = findViewById<EditText>(R.id.username)
        val email = findViewById<EditText>(R.id.email)
        val passwordEdit = findViewById<EditText>(R.id.password)



        if (usernameEdit.text.isEmpty()) {
            usernameEdit.error = "Kolom Email tidak boleh kosong"
            usernameEdit.requestFocus()
            return
        } else if (email.text.isEmpty()) {
            email.error = "Kolom Email tidak boleh kosong"
            email.requestFocus()
            return
        } else if (passwordEdit.text.isEmpty()) {
            passwordEdit.error = "Kolom Password tidak boleh kosong"
            passwordEdit.requestFocus()
            return

        } else if (passwordEdit.text.isEmpty()) {
            passwordEdit.error = "Kolom Password tidak boleh kosong"
            passwordEdit.requestFocus()
            return

        }

        ApiConfig.instanceRetrofit.register(usernameEdit.text.toString(), email.text.toString(), passwordEdit.text.toString()).enqueue(object :Callback<ResponModel>{
            override fun onResponse(call: Call<ResponModel>, response: Response<ResponModel>) {
                val respon =response.body() !!

                if (respon.status == 200){
                    Toast.makeText(this@register_activity, "Berhasil Membuat Akun, Silahkan Login", Toast.LENGTH_SHORT).show()
                    Handler(Looper.getMainLooper()).postDelayed({
                        val intent = Intent(this@register_activity, login_activity::class.java)
                        startActivity(intent)
                        finish()  // Menutup aktivitas saat ini agar pengguna tidak dapat kembali ke halaman pendaftaran
                    }, 2000)

                }else {
                    Toast.makeText(this@register_activity, "Gagal :" + respon.message, Toast.LENGTH_SHORT).show()

                }
            }

            override fun onFailure(call: Call<ResponModel>, t: Throwable) {
                Toast.makeText(this@register_activity, "Error:" + t.message, Toast.LENGTH_SHORT).show()
            }

        })
    }
}




