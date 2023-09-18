package com.example.fragmet

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bitton1=findViewById<ImageView>(R.id.first_button)
        val button2=findViewById<ImageView>(R.id.second_button)
        val sunmit=findViewById<Button>(R.id.submit)
        val name=findViewById<EditText>(R.id.name)
        val email=findViewById<EditText>(R.id.email)
        val age=findViewById<EditText>(R.id.age)

        val password=findViewById<EditText>(R.id.password)
        sunmit.setOnClickListener {

            val text = password.text.toString()
            val edi = email.text.toString()
            var numcount = 0
            var Capitalletter = 0
            var smallletter = 0
            var spaclechar = 0
            var emil = 0

            for (a in text) {
                for (b in 1..9) {
                    if (a.toString() == b.toString()) {
                        numcount++
                    }
                }
            }
            for (a in text) {
                for (b in 'A'..'Z') {
                    if (a.toString() == b.toString()) {
                        Capitalletter++
                    }
                }
            }
            for (a in text) {
                for (b in 'a'..'z') {
                    if (a.toString() == b.toString()) {
                        smallletter++
                    }
                }
            }
            for (a in text) {
                for (b in "@#$%&*") {
                    if (a.toString() == b.toString()) {
                        spaclechar++
                    }
                }
            }
            for (a in edi) {
                for (b in "@gmail.com") {
                    if (a.toString() == b.toString()) {
                        emil++
                    }
                }
            }
            if (name.text.isEmpty()) {
                Toast.makeText(this, "enter the name", Toast.LENGTH_SHORT).show()
            }
            else if (email.text.isEmpty()){
                Toast.makeText(this, "enter the email", Toast.LENGTH_SHORT).show()
            }
            else if (emil == 0) {
                Toast.makeText(this, "enter the email Add @gmail,com", Toast.LENGTH_SHORT).show()
            } else if (age.text.isEmpty()) {
                Toast.makeText(this, "enate the age", Toast.LENGTH_SHORT).show()
            } 
            else if (password.text.isEmpty()){
                Toast.makeText(this, "enter the password", Toast.LENGTH_SHORT).show()
            }
            else if (numcount == 0) {
                Toast.makeText(this, "enter the 1 number password", Toast.LENGTH_SHORT).show()
            } else if (Capitalletter ==0) {
                Toast.makeText(this, "enter the 1  capitalletter word password", Toast.LENGTH_SHORT)
                    .show()
            } else if (smallletter == 0) {
                Toast.makeText(this, "enter the 1  smallletter word  password", Toast.LENGTH_SHORT)
                    .show()
            } else if (spaclechar == 0) {
                Toast.makeText(this, "enter the i spaclechar word password", Toast.LENGTH_SHORT)
                    .show()
            }
            else if (password.text.toString().length<8){
                Toast.makeText(this, "enter the 8 word password", Toast.LENGTH_SHORT).show()
            }
            else {
                val intent = Intent(this, homeActivity2::class.java)
                intent.putExtra("name", name.text.toString())
                intent.putExtra("email", email.text.toString())
                intent.putExtra("age", age.text.toString())
                intent.putExtra("password", password.text.toString())
                startActivity(intent)
            }
        }
        bitton1.setOnClickListener {
            changeFragment(homeFragment())
        }
        button2.setOnClickListener {
            changeFragment(settingFragment())
        }

    }
    fun changeFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.farmelayout,fragment).commit()

    }
}