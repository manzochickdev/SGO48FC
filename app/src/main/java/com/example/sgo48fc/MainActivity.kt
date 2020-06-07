package com.example.sgo48fc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.sgo48fc.databinding.ActivityMainBinding
import com.example.sgo48fc.home.HomeFragment

class MainActivity : AppCompatActivity() {
    lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        initFragment()
    }

    private fun initFragment(){
        val homeFragment = HomeFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,homeFragment).commit()
    }
}