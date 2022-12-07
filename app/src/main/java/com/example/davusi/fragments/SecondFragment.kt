package com.example.davusi.fragments

import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.davusi.R

class SecondFragment: Fragment(R.layout.fragment_second) {
    private lateinit var editText: EditText
    private lateinit var button: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        editText=view.findViewById(R.id.editText)
        button=view.findViewById(R.id.button)
        val rame=view.findViewById<TextView>(R.id.textview)
        button.setOnClickListener {
            if (editText.text.toString()!=""&& editText.text.toString()!="nikolozi"){
            rame.text=editText.text.toString()
            Toast.makeText(activity, "${rame.text} damatebulia shav siashi...", Toast.LENGTH_SHORT).show()
                button.isEnabled=true
            }
            if (editText.text.toString()=="nikolozi"){
                Toast.makeText(activity, "ar sheidzleba!!!", Toast.LENGTH_LONG).show()
                rame.text="ERROR"
                button.isEnabled=true
            }
        }
    }
}