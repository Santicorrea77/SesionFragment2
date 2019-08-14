package com.example.sesionfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val manager = supportFragmentManager
        val transaction =  manager.beginTransaction()

        val supermanfragment = SupermanFragment()
        transaction.add(R.id.contenedor, supermanfragment).commit()
    }
}
