package com.example.sharedpref

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.sharedpref.SharedPreferences.Companion.prefs
import com.example.sharedpref.databinding.ActivityAccessBinding

class AccessActivity : AppCompatActivity() {
    lateinit var b:ActivityAccessBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityAccessBinding.inflate(layoutInflater)
        setContentView(b.root)
        initUI()
    }
    fun initUI(){
        b.btnClose.setOnClickListener {
            prefs.wipeData()
            onBackPressed()
        }
        val userName = prefs.getName()
        b.tvHola.text = "¡Hola $userName!"
        if (prefs.getColorCheck()){
            b.containerLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.grey_blue))
        }
    }
}