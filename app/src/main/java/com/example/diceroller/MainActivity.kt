package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
  //lateinit to inicialization
    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //variable for my button
        val rollButton: Button = findViewById(R.id.roll_button)
        //asign a value in rollbutton
        //rollButton.text = "Let's roll!"
       /*
        rollButton.setOnClickListener{
            Toast.makeText(this,"button clicked",Toast.LENGTH_SHORT).show()
        }*/
        rollButton.setOnClickListener{
           rollDice()
        }


        diceImage = findViewById(R.id.dice_image)

    }

    private fun rollDice() {

        val randomInt = Random().nextInt(6)+1

        val drawableResource = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
     //   val diceImage : ImageView = findViewById(R.id.dice_image)
        diceImage.setImageResource(drawableResource)



    }
}
