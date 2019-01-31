package com.example.pirates.sampah

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.CardView
import android.view.View

class PenangulanganSampah : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_penangulangan_sampah)
        val penorganik : CardView = findViewById<View>(R.id.sorganik4) as CardView
        penorganik.setOnClickListener {
            val intent=Intent(applicationContext,PenanggulanganOrganik::class.java)
            startActivity(intent)
        }
        val penoraganik2 :CardView = findViewById<View>(R.id.sanorganik4) as CardView
        penoraganik2.setOnClickListener {
            val intent=Intent(applicationContext,PenangulanganAnorganik::class.java)
            startActivity(intent)
        }
    }
}
