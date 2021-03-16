package com.example.hw5_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = findViewById<EditText>(R.id.name)
        val lastname = findViewById<EditText>(R.id.lastname)
        val phone = findViewById<EditText>(R.id.phone)
        val mail = findViewById<EditText>(R.id.mail)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val intent = Intent(this , Second::class.java)
            intent.putExtra("phone" , phone.text.toString())
            intent.putExtra("mail" , mail.text.toString())
            startActivity(intent)
        }




    }
}