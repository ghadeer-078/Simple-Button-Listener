package com.example.simplebuttonlistener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var btnFirst: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFirst.findViewById<Button>(R.id.listenerBtn)
        btnFirst.setOnClickListener {
            Toast.makeText(applicationContext, "I'm Clicked From Listener", Toast.LENGTH_SHORT)
                .show()
        }

    }


    fun fromDesign(view: android.view.View) {
        Toast.makeText(applicationContext, "I'm Clicked From Design", Toast.LENGTH_SHORT).show()
    }

}