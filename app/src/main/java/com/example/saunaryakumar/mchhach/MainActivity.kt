package com.example.saunaryakumar.mchhach

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity :  AppCompatActivity() {
    lateinit var button1:Button
    lateinit var button2:Button
    lateinit var button3:Button
    lateinit var button4:Button
    lateinit var button5:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button5)

        button1.setOnClickListener{
            val intent = Intent(this,Class1::class.java)
            startActivity(intent)

        }
        button2.setOnClickListener{
            val intent = Intent(this,Class11::class.java)
            startActivity(intent)

        }
        button3.setOnClickListener{
            val intent = Intent(this,UG::class.java)
            startActivity(intent)

        }
        button4.setOnClickListener{
            val intent = Intent(this,Booster::class.java)
            startActivity(intent)

        }
        button5.setOnClickListener{
            val intent = Intent(this,Motivate::class.java)
            startActivity(intent)
        }
    }
    }