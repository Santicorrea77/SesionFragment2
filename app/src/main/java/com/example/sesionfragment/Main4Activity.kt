package com.example.sesionfragment

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class Main4Activity : AppCompatActivity() {

    private lateinit var textMessage: TextView
    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        val manager = supportFragmentManager
        val transaction =  manager.beginTransaction()

        when (item.itemId) {
            R.id.navigation_superman -> {
                val supermanfragment = SupermanFragment()
                transaction.replace(R.id.contenedor, supermanfragment).commit()
                return@OnNavigationItemSelectedListener true

            }
            R.id.navigation_batman -> {
                val batmanfragment = BatmanFragment()
                transaction.replace(R.id.contenedor, batmanfragment).commit()
                return@OnNavigationItemSelectedListener true


            }
            R.id.navigation_flash -> {
                val flashfragment = FlashFragment()
                transaction.replace(R.id.contenedor, flashfragment).commit()
                return@OnNavigationItemSelectedListener true

            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val manager = supportFragmentManager
        val transaction =  manager.beginTransaction()

        val supermanfragment = SupermanFragment()
        transaction.add(R.id.contenedor, supermanfragment).commit()

        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }
}
