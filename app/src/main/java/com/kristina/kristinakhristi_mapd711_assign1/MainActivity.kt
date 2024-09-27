package com.kristina.kristinakhristi_mapd711_assign1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent;
import android.widget.Button
import android.widget.EditText
import com.kristina.kristinakhristi_mapd711_assign1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fullName = findViewById<EditText>(R.id.fullName)
        val address = findViewById<EditText>(R.id.address)
        val profession = findViewById<EditText>(R.id.profession)
        val dreamJob = findViewById<EditText>(R.id.dreamJob)
        val favoriteFood = findViewById<EditText>(R.id.favoriteFood)
        val submitButton = findViewById<Button>(R.id.submitButton)

        submitButton.setOnClickListener {
            val intent = Intent(this@MainActivity, ProfileActivity::class.java)
                intent.putExtra("fullName", fullName.text.toString())
                intent.putExtra("address", address.text.toString())
                intent.putExtra("profession", profession.text.toString())
                intent.putExtra("dreamJob", dreamJob.text.toString())
                intent.putExtra("favoriteFood", favoriteFood.text.toString())

            startActivity(intent)
        }
    }
}