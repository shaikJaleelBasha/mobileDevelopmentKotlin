package com.jaleel.first

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.provider.MediaStore.Images.Media
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ImplicitActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit)

        val cambutton = findViewById<TextView>(R.id.cameraText)
        cambutton.setOnClickListener{
            intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
    }
}