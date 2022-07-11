package com.example.ch11_jetpact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.SearchView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.ch11_jetpack.OneFragment
import com.example.ch11_jetpack.ThreeFragment
import com.example.ch11_jetpack.TwoFragment
import com.example.ch11_jetpact.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        //ActionBarDrawerToggle 버튼 적용
        toggle = ActionBarDrawerToggle(this,binding.drawer,R.string.drawer_opened,R.string.drawer_closed)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toggle.syncState()
        //뷰 페이저에 어답터 적용
        val adapter = MyFragmentPagerAdapter(this)
        binding.viewpager.adapter = adapter

    }
    //툴바 메뉴 생성
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main,menu)
        // MenuItem 객체를 얻고 그 안에 포함된 ActionView 객체 획득
        val menuItem = menu?.findItem(R.id.menu_serarch)
        val searchView = menuItem?.actionView as SearchView
        searchView.setOnQueryTextListener(object:SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(p0: String?): Boolean {
                return true
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                return true
            }

        })
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
//뷰 페이저 어답터
class MyFragmentPagerAdapter(activity: FragmentActivity):FragmentStateAdapter(activity){
    private val fragments : List<Fragment> = listOf(OneFragment(),TwoFragment(),ThreeFragment())
    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment = fragments[position]

}