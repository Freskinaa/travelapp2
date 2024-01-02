package com.example.travelapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val button: Button = findViewById(R.id.button)
        val nameEditText: EditText = findViewById(R.id.editTextTextEmail)
        val surnameEditText: EditText = findViewById(R.id.editTextSurname)
        val emailEditText: EditText = findViewById(R.id.editTextEmail)
        val passwordEditText: EditText = findViewById(R.id.editTextPassword)

        button.setOnClickListener {
            // Get values entered by the user
            val name = nameEditText.text.toString()
            val surname = surnameEditText.text.toString()
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (name.isEmpty() || surname.isEmpty() || email.isEmpty() || password.isEmpty()) {

                Toast.makeText(this@SignUpActivity, "All fields are required", Toast.LENGTH_SHORT).show()
            } else {

                val intent = Intent(this@SignUpActivity, SecondActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
