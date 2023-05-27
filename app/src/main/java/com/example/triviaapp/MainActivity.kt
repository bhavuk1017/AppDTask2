package com.example.triviaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnStart=findViewById<Button>(R.id.btn_start)
        val getName=findViewById<EditText>(R.id.et_name)
        val name=getName.toString()
        btnStart.setOnClickListener {
            if(getName.text.isEmpty()){
                Toast.makeText(this, "Please enter your name",Toast.LENGTH_SHORT).show()
            }
            else {
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                startActivity(intent)
                Toast.makeText(this, "Welcome $name", Toast.LENGTH_LONG).show()
                finish()
            }
        }

        }

    }