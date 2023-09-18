package com.example.fragmet

import android.annotation.SuppressLint
import android.icu.text.Transliterator.Position
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

class useraddActivity : AppCompatActivity(),studentClicklisten {
    lateinit var arrayList: ArrayList<PersonModel>
    lateinit var adapter: StudentListAdapter
     @SuppressLint("MissingInflatedId")
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_useradd)
         arrayList= ArrayList()
         val add=findViewById<Button>(R.id.usearAdd)
         val list=findViewById<ListView>(R.id.list)
         val name=findViewById<EditText>(R.id.username)
         val email=findViewById<EditText>(R.id.usernemial)
   adapter= StudentListAdapter(this,arrayList,this)
         list.adapter=adapter
         add.setOnClickListener {
      arrayList.add(PersonModel(name.text.toString(),email.text.toString(),R.drawable.baseline_home_24))
    adapter.notifyDataSetChanged()
         }

    }
   override fun  onprofileClick(name: Button, position: Int) {
       arrayList.removeAt(position)
    adapter.notifyDataSetChanged()
   }

}