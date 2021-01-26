package com.example.tascs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.tascs.databinding.ActivityLoginBinding
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    lateinit var activityLoginBinding:ActivityLoginBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityLoginBinding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(activityLoginBinding.root)

//        signuplink.setOnClickListener {
//            startActivity(Intent(this,SignUpActivity::class.java))
//                finish()
//        }
    }
}