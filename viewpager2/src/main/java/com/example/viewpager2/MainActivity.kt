package com.example.viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewpager.adapter = MyFragmentPagerAdapter(this)
        binding.viewpager.orientation = ViewPager2.ORIENTATION_VERTICAL // 세로로 구현
    }
}
class MyFragmentPagerAdapter(activity: FragmentActivity): FragmentStateAdapter(activity) {
    private val fragment : List<Fragment> = listOf(OneFragment(),TwoFragment(),ThreeFragment())
    override fun getItemCount(): Int {
        return fragment.size

    }

    override fun createFragment(position: Int): Fragment {
        return fragment[position]
    }

}