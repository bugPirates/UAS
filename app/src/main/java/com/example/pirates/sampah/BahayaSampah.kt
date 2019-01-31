package com.example.pirates.sampah

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.CardView
import android.view.View

class BahayaSampah : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bahaya_sampah)
        val bahaya1 : CardView = findViewById<View>(R.id.sorganik3) as CardView
        bahaya1.setOnClickListener {
            val intent=Intent(applicationContext,BahayaOrganik::class.java)
            startActivity(intent)
        }
        val bahaya2 :CardView = findViewById<View>(R.id.sanorganik3) as CardView
        bahaya2.setOnClickListener {
            val intent=Intent(applicationContext,BahayaAnorganik::class.java)
            startActivity(intent)
        }
    }
}
