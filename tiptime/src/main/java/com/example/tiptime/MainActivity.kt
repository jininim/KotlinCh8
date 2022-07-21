package com.example.tiptime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tiptime.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calculateButton.setOnClickListener { calculateTip() }
    }

    private fun calculateTip() {
        // 서비스 비용 가져오기
        val stringInTextField = binding.costOfService.text.toString()
        val cost = stringInTextField.toDouble()
        //팁 비율 가져오기
        val tipPercentage = when (binding.tipOptions.checkedRadioButtonId){
            R.id.option_twenty_percent -> 0.20
            R.id.option_eighteen_percent -> 0.18
            else -> 0.15
        }
        //팁 계산 및 반올림 하기
        var tip = tipPercentage * cost
        val roundUp = binding.roundUpSwitch.isChecked
        if ( roundUp){
            tip = kotlin.math.ceil(tip)
        }
        //팁 형식 지정
        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        binding.tipResult.text = getString(R.string.tip_amount,formattedTip)
    }
}