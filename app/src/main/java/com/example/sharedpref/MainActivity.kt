package com.example.sharedpref

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.sharedpref.SharedPreferences.Companion.prefs
import com.example.sharedpref.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)
        initUI()
        checkUserValues()
    }
    fun initUI(){
        b.btnAccess.setOnClickListener {
            accessSharedPreferences()
        }
    }
    fun checkUserValues(){
        if (prefs.getName().isNotEmpty()){
            goAccess()
        }
    }
    fun accessSharedPreferences(){
        if (b.edName.text.toString().isNotEmpty()){
            prefs.saveName(b.edName.text.toString())
            prefs.saveColor(b.checkBox.isChecked)
            goAccess()
            } else {
                Toast.makeText(this, "Debe rellenar el nombre", Toast.LENGTH_SHORT).show()
            }
    }
    private fun goAccess(){
        startActivity(Intent(this,AccessActivity::class.java))
    }
}