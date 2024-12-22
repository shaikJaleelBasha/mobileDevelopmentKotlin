package com.jaleel.first

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class LayoutActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_text_scroll)
    }
}