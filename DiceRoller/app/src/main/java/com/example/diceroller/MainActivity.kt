package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.TextKeyListener.clear
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    
    lateinit var diceImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val clearButton: Button = findViewById(R.id.clear_button)
        clearButton.setOnClickListener { clear() }

        /*
        val countupButton: Button = findViewById(R.id.countup_button)
        countupButton.setOnClickListener { countUp() }

        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { reset() }
        
         */
    }
/*
    private fun reset() {
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "0"
    }


    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)
        val preText = resultText.text.toString()
        val defaultText = "Hello World!"
        if (preText == defaultText) resultText.text = "1"
        else {
            val preValue = preText.toInt()
            val curValue: Int = if (preValue < 6) preValue + 1 else 6
            resultText.text = curValue.toString()
        }
    }
    */

    private fun clear() {
        diceImage.setImageResource(R.drawable.empty_dice)
    }

    private fun rollDice() {
        val randomInt = (1..6).random()
//        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
//        val resultText: TextView = findViewById(R.id.result_text)
//        resultText.text = randomInt.toString()

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }
}
