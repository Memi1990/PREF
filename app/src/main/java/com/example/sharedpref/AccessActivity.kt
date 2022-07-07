package com.example.sharedpref

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sharedpref.databinding.ActivityAccessBinding

class AccessActivity : AppCompatActivity() {
    lateinit var b:ActivityAccessBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityAccessBinding.inflate(layoutInflater)
        setContentView(b.root)
//        initUI()
    }
}