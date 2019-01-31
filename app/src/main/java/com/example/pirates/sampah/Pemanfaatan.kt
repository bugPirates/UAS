package com.example.pirates.sampah

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.CardView
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class Pemanfaatan : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pemanfaatan)
        val manfaat1 : CardView = findViewById<View>(R.id.sorganik2) as CardView
        manfaat1.setOnClickListener {
            val intent=Intent(applicationContext,PemanfaatanOrganik::class.java)
            startActivity(intent)

            val manfaat2 : CardView = findViewById<View>(R.id.sanorganik2) as CardView

            manfaat2.setOnClickListener {
                val intent1=Intent(applicationContext,PemanfaatanAnorganik::class.java)
                startActivity(intent1)
            }
        }
    }
}
