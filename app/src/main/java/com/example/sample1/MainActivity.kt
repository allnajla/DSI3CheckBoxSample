package com.example.sample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView

lateinit var txtbox : TextView
lateinit var ch1 : CheckBox
lateinit var ch2 : CheckBox
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ch1 = findViewById(R.id.checkBox)
        ch2 =findViewById(R.id.checkBox2)
        txtbox = findViewById(R.id.textView)
        ch1.setOnClickListener {
          if(ch1.isChecked) {
              txtbox.setText(" Yes I have !!")
              ch2.isChecked = false
          }
        }
        ch2.setOnClickListener {
            if(ch2.isChecked) {
            txtbox.setText(" No I haven't !!")
                ch1.isChecked = false
            }
        }
    }
}