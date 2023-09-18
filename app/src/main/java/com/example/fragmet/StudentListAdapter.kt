package com.example.fragmet

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class StudentListAdapter(val context: Context, val userarray:ArrayList<PersonModel>, val studentClickLiseten: useraddActivity)
    :BaseAdapter() {
    override fun getCount(): Int {
       return userarray.size
    }

    override fun getItem(p0: Int): Any {
    return  userarray[p0]
    }

    override fun getItemId(p0: Int): Long {
       return p0.toLong()
    }

    @SuppressLint("MissingInflatedId")
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
//        val student=userarray
 val layout=LayoutInflater.from(context).inflate(R.layout.student_list_item,p2,false)
        val nameEdit=layout.findViewById<TextView>(R.id.nameedittext)
        val emailedogt=layout.findViewById<TextView>(R.id.emailedittext)
        val image=layout.findViewById<ImageView>(R.id.imageview)
        val delete=layout.findViewById<Button>(R.id.delete)
         nameEdit.text=userarray[p0].name
        emailedogt.text=userarray[p0].email
        image.setImageResource(userarray[p0].pic)



delete.setOnClickListener {


    studentClickLiseten.onprofileClick(delete, p0)

}

return layout
    }
}