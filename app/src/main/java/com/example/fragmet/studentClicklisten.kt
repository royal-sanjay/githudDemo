package com.example.fragmet

import android.icu.text.Transliterator.Position
import android.widget.Button

interface studentClicklisten {
  fun onprofileClick(name: Button, Position:Int)
//    abstract fun onprofileClick(name: String)
//    fun onprofileClick(delete: Button?, p0: Int, function: () -> Unit)
}