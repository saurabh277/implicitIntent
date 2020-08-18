package com.example.implicitintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var name= intent.getStringExtra(KEY1)
        var age=intent.getIntExtra(KEY2,0)
        tvResult.text="$name has age:$age"
    }
}
