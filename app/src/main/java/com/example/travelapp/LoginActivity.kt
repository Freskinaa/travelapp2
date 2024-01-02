package com.example.travelapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton: Button = findViewById(R.id.loginButton)
        val signUpButton: Button = findViewById(R.id.signUpButton)
        val emailEditText: EditText = findViewById(R.id.editTextTextEmail)
        val passwordEditText: EditText = findViewById(R.id.editTextPassword)

        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Check if email or password is empty
            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this@LoginActivity, "Email and password are required", Toast.LENGTH_SHORT).show()
            } else {

                val intent = Intent(this@LoginActivity, SecondActivity::class.java)
                startActivity(intent)
            }
        }
        signUpButton.setOnClickListener {
            val intent = Intent(this@LoginActivity, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}
