package com.example.implicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
const val KEY1="name"
const val KEY2 ="age"
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener {
            var i= Intent(this,Main2Activity::class.java)
            i.putExtra(KEY1,"saurabh bisht")
            i.putExtra(KEY2,23)
            startActivity(i)
        }
        mailbtn.setOnClickListener {
            var email=editText.text.toString()
            var i=Intent()
            i.action=Intent.ACTION_SENDTO
            i.data= Uri.parse("mailto:$email")
            startActivity(i)
        }
        browsebtn.setOnClickListener {
            var address=editText.text.toString()
            var i=Intent()
            i.action=Intent.ACTION_VIEW
            i.data= Uri.parse("http://$address")
            startActivity(i)
        }
        phonebtn.setOnClickListener {
            var number=editText.text.toString()
            var i=Intent()
            i.action=Intent.ACTION_DIAL
            i.data= Uri.parse("tel:$number")
            startActivity(i)
        }
    }
}
