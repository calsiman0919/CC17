package com.application.leap

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSignIn.setOnClickListener {
            Intent(this, homeScreenActivity::class.java).also {
                startActivity(it)
            }
        }

        btnSignUp.setOnClickListener {
            Intent( this, SignUpActivity::class.java).also {
                startActivity(it)
            }
        }
        tvForgotPassword.setOnClickListener {
            Intent(this, ForgotPassword::class.java).also {
                startActivity(it)
            }
        }
    }
}