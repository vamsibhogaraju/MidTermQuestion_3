package com.example.midtermq3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonCalculator: Button = findViewById(R.id.buttonCalculator)
        val buttonConverter: Button = findViewById(R.id.buttonConverter)

        buttonCalculator.setOnClickListener {
            val intent = Intent(this, buttonCalculator::class.java)
            startActivity(intent)
        }

        buttonConverter.setOnClickListener {
            val intent = Intent(this, buttonConverter::class.java)
            startActivity(intent)
        }
    }
}
