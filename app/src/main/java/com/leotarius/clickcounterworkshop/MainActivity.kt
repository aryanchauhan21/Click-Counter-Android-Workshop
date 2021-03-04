package com.leotarius.clickcounterworkshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // This is to connect the activity to the layout file
        setContentView(R.layout.activity_main)

        var valCount = 0

//        val increment = findViewById<Button>(R.id.increment)
//        val decrement = findViewById<Button>(R.id.decrement)
//        val count = findViewById<TextView>(R.id.count)

        increment.setOnClickListener {
            valCount++
            count.text = valCount.toString()
        }

        decrement.setOnClickListener {
            valCount--
            count.text = valCount.toString()
        }
    }
}