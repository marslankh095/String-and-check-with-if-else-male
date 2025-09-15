package com.app.newtry

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // reusable variable to hold selection
    private var selected: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMale = findViewById<Button>(R.id.btnMale)
        val btnFemale = findViewById<Button>(R.id.btnFemale)

        // one function to handle both buttons
        val clickListener = { button: Button ->
            selected = button.text.toString().lowercase()  // get text dynamically
            if (selected == "male") {
                openActivity(MaleActivity::class.java)   // use extension
            } else {
                openActivity(FemaleActivity::class.java) // use extension
            }
        }

        btnMale.setOnClickListener { clickListener(btnMale) }
        btnFemale.setOnClickListener { clickListener(btnFemale) }
    }
}
