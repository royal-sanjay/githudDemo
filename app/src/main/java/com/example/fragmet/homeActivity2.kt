package com.example.fragmet

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class homeActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)
     val a=intent.extras?.getString("name")
         val b=intent.extras?.getString("email")
         val c=intent.extras?.getString("age")
         val d=intent.extras?.getString("password")
         val name=findViewById<TextView>(R.id.Name)
         val email=findViewById<TextView>(R.id.Email)
          val age=findViewById<TextView>(R.id.Age)
          val password=findViewById<TextView>(R.id.Password)

           val useradd=findViewById<Button>(R.id.usearadd)
        useradd.setOnClickListener {
            val intent= Intent(this,useraddActivity::class.java)
            startActivity(intent)
        }

        name.text=a
        email.text=b
        age.text=c
        password.text=d
        name.setOnClickListener {

        }
        email.setOnClickListener {

        }
        age.setOnClickListener {

        }
        password.setOnClickListener {

        }
    }
}