package com.example.pirates.sampah

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.CardView
import android.view.View
import kotlinx.android.synthetic.main.activity_jenis_sampah.*

class JenisSampah : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jenis_sampah)

        val orga = findViewById<View>(R.id.sorganik) as CardView

        orga.setOnClickListener {
            val intent = Intent(applicationContext, organik::class.java)
            startActivity(intent)
        }
        val orga2 :CardView = findViewById<View>(R.id.sanorganik) as CardView

        orga2.setOnClickListener {
            val intent = Intent(applicationContext, anorganik::class.java)
            startActivity(intent)
        }
        val orga3 :CardView = findViewById<View>(R.id.sbahaya) as CardView

        orga3.setOnClickListener {
            val intent = Intent(applicationContext, beracun::class.java)
            startActivity(intent)
        }

        }
    }

