package com.kristina.kristinakhristi_mapd711_assign1

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val intent = intent
        val name = intent.getStringExtra("fullName")
        val address = intent.getStringExtra("address")
        val profession = intent.getStringExtra("profession")
        val job = intent.getStringExtra("dreamJob")
        val food = intent.getStringExtra("favoriteFood")

//        Log.d("hello",name.toString())
        val outputName = findViewById<TextView>(R.id.fullNameText)
        outputName.text = outputName.text.toString() + name.toString()

        val outputAddress = findViewById<TextView>(R.id.addressText)
        outputAddress.text = outputAddress.text.toString() + address.toString()

        val outputProfession = findViewById<TextView>(R.id.professionText)
        outputProfession.text = outputProfession.text.toString() + profession.toString()

        val outputJob = findViewById<TextView>(R.id.dreamJobText)
        outputJob.text = outputJob.text.toString() + job.toString()

        val outputFood = findViewById<TextView>(R.id.favoriteFoodText)
        outputFood.text = outputFood.text.toString() + food.toString()




    }
}