package com.jaleel.first

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FormActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)
        val emailText = findViewById<EditText>(R.id.email)
        val sendBtn = findViewById<Button>(R.id.emailBtn)
        val showTxt = findViewById<TextView>(R.id.showText)
        sendBtn.setOnClickListener{
            val show = emailText.text.toString()
            showTxt.text = show
        }

    }
}