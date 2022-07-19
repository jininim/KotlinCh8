package com.example.diceroller2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.diceroller2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnRoll.setOnClickListener {
            rollDice()
        }
        rollDice()


    }
    //주사위를 굴리는 함수정의
    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val drawableResource = when (diceRoll){
            1 -> (R.drawable.dice_1)
            2 -> (R.drawable.dice_2)
            3 -> (R.drawable.dice_3)
            4 -> (R.drawable.dice_4)
            5 -> (R.drawable.dice_5)
            else -> R.drawable.dice_6
        }
        binding.imgDice.setImageResource(drawableResource)
        binding.imgDice.contentDescription = diceRoll.toString()
    }
}