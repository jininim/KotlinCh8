package com.example.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tablayout.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tabs.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            //탭을 선택 할 때
            override fun onTabSelected(tab: TabLayout.Tab?) {
                TODO("Not yet implemented")
            }
            //선택된 탭 버튼을 다시 선택할 때
            override fun onTabUnselected(tab: TabLayout.Tab?) {
                TODO("Not yet implemented")
            }
            // 다른 탭 버튼을 눌러 선택된 탭 버튼이 해제될 때
            override fun onTabReselected(tab: TabLayout.Tab?) {
                TODO("Not yet implemented")
            }

        })

    }
}