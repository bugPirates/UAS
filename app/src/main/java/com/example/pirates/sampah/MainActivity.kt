package com.example.pirates.sampah

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.CardView
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val js1 = findViewById<View>(R.id.jenissampah) as CardView
        js1.setOnClickListener {
            val intent=Intent(applicationContext,JenisSampah::class.java)
            startActivity(intent)
        }
        val pemanfaatan :CardView = findViewById<View>(R.id.pemanfaatan) as CardView
        pemanfaatan.setOnClickListener {
            val intent=Intent(applicationContext,Pemanfaatan::class.java)
            startActivity(intent)
        }
        val bahaya :CardView = findViewById(R.id.bahayasampah) as CardView
        bahaya.setOnClickListener {
            val intent=Intent(applicationContext,BahayaSampah::class.java)
            startActivity(intent)
        }
        val penanggulangan :CardView = findViewById<View>(R.id.psampah) as CardView
        penanggulangan.setOnClickListener {
            val intent=Intent(applicationContext,PenangulanganSampah::class.java)
            startActivity(intent)
        }

    }

}


