package com.example.diceroller

import  android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            val rollButton : Button = findViewById(R.id.button1)

        rollButton.setOnClickListener {
            rollDice()

        }

    }

    private fun rollDice() {
        val diceImage : ImageView = findViewById(R.id.dice_image)
        var intNumber  : Int = Random.nextInt(6)+1

        val selectedImage = when(intNumber){

            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else ->R.drawable.dice_6

        }

        diceImage.setImageResource(selectedImage);


    }


}
