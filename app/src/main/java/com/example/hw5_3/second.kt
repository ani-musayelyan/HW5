package com.example.hw5_3

import android.content.Intent
import android.content.Intent.ACTION_CAMERA_BUTTON
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second)

        val call = findViewById<Button>(R.id.call)
        val send = findViewById<Button>(R.id.send)
        val camera = findViewById<Button>(R.id.camera)


        val phone = intent.getStringExtra("phone")
        call.setOnClickListener {
            val intentCall = Intent(Intent.ACTION_DIAL)
            intentCall.data = Uri.parse("tel:${phone.toString()}")
            startActivity(intentCall)
        }

        val mail = intent.getStringExtra("mail")
        send.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO)
            emailIntent.type = "text/plain"
            emailIntent.data = Uri.parse("mailto:$mail")
            startActivity(Intent.createChooser(emailIntent, "Send feedback"))
        }

        camera.setOnClickListener {
            val intentCamera = Intent()
            intentCamera.action = ACTION_CAMERA_BUTTON
            startActivity(intentCamera)
        }




    }
}