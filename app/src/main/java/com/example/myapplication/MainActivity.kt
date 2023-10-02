package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var tv: TextView? = null
    var btnTextChange: Button? = null
    var btnColorChange: Button? = null
    fun onBtnChangeTextClick(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById<View>(R.id.tvMain) as TextView
        btnTextChange = findViewById<View>(R.id.BtnChangeText) as Button
        btnColorChange = findViewById<View>(R.id.BtnChangeText) as Button
        btnTextChange!!.setOnClickListener { tv!!.text = "Mygtukas yra paspaustas" }
        btnColorChange!!.setOnClickListener { tv!!.setTextColor(Color.parseColor("#FF0000")) }
    }
}


