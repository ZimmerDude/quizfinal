package com.aadesh.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            if (text3.text.toString().isEmpty()) {
                Toast.makeText(this, "Name cannot be empty", Toast.LENGTH_LONG).show()
            } else {
                val intent = Intent(this, quiz::class.java)
                intent.putExtra(constants.USERNAME,text3.text.toString()    )
                startActivity(intent)
                finish()
            }
        }

    }
}