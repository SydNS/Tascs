package com.example.tascs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        signuplink.setOnClickListener {
            startActivity(Intent(this,SignUpActivity::class.java))
                finish()
//            Toast.makeText(this,"deands",Toast.LENGTH_LONG)
//                .show()
        }
    }
}