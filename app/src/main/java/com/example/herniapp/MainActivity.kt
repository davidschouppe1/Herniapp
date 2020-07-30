package com.example.herniapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button
        val btnPose = findViewById<ImageButton>(R.id.button_pose)
        // set on-click listener
        btnPose.setOnClickListener{
            startActivity(Intent(this, Pose::class.java))
        }

        // get reference to button
        val btnStand = findViewById<ImageButton>(R.id.button_stand)
        // set on-click listener
        btnStand.setOnClickListener{
            startActivity(Intent(this, Stand::class.java))
        }
    }
}