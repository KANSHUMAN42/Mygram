package com.example.mygram

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textview:TextView

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.nav_home -> {
                textview.setText("home")
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_search -> {
                textview.setText("search")
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_addpost -> {
                textview.setText("addpost")
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_notification -> {
                textview.setText("notification")
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_profile -> {
                textview.setText("profile")
                return@OnNavigationItemSelectedListener true
            }
        }

        false
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textview=findViewById(R.id.tv);
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)

           }
}
