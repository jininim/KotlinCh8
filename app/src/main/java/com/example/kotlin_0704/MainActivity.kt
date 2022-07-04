package com.example.kotlin_0704

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.widget.Button
import android.widget.Chronometer
import com.example.kotlin_0704.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // 멈춘 시각 저장
    var pauseTime = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val btn_start : Button = binding.btnStart
        val btn_pause : Button = binding.btnStop
        val btn_reset : Button = binding.btnReset
        val chronometer : Chronometer = binding.chronometer
        btn_start.setOnClickListener {  //start 버튼 클릭시
            chronometer.base = SystemClock.elapsedRealtime() + pauseTime
            chronometer.start() //chronometer 시작
            btn_pause.isEnabled = true
            btn_reset.isEnabled = true
            btn_start.isEnabled = false

        }
        btn_pause.setOnClickListener {  //stop 버튼 클릭시
            pauseTime = chronometer.base - SystemClock.elapsedRealtime()
            chronometer.stop() //chronometer 중지
            btn_pause.isEnabled = false
            btn_reset.isEnabled = true
            btn_start.isEnabled = true

        }
        btn_reset.setOnClickListener {  //reset 버튼 클릭시
            pauseTime = 0L
            chronometer.base = SystemClock.elapsedRealtime()
            chronometer.stop()
            btn_pause.isEnabled = false
            btn_reset.isEnabled = false
            btn_start.isEnabled = true

        }


    }
}