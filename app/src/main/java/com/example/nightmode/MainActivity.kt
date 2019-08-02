package com.example.nightmode

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layout.setBackgroundColor(Color.LTGRAY)
        switchk.setOnCheckedChangeListener{ _, isChecked ->
            if(isChecked)
            {
                mode.setTextColor(Color.LTGRAY)
                mode.text = "Dark mode"
                switchk.setTextColor(Color.LTGRAY)
                layout.setBackgroundColor(Color.BLACK)
            }
            else
            {
                mode.text = "Light mode"
                mode.setTextColor(Color.BLACK)
                switchk.setTextColor(Color.BLACK)
                layout.setBackgroundColor(Color.LTGRAY)
            }
        }
    }
}
