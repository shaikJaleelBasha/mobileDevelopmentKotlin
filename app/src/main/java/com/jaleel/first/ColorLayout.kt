package com.jaleel.first

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class ColorLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lightdark)

        val buttonDark = findViewById<Button>(R.id.btnDark)
        val buttonYellow = findViewById<Button>(R.id.btnYellow)
        val layout = findViewById<LinearLayout>(R.id.lightmode)
        val button3 = findViewById<Button>(R.id.explicitBtn)

        buttonYellow.setOnClickListener{
            layout.setBackgroundResource(R.color.yellow)
        }
        buttonDark.setOnClickListener{
            layout.setBackgroundResource(R.color.black)
        }
        button3.setOnClickListener{
            intent = Intent(applicationContext, ExplicitIntent::class.java)
            startActivity(intent)
        }
    }
}