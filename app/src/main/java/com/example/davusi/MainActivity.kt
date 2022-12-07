package com.example.davusi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.davusi.adapters.ViewPagerFragmentAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {
    private lateinit var viewPager2:ViewPager2
    private lateinit var tabLayout:TabLayout
    private lateinit var viewPagerFragmentAdapter: ViewPagerFragmentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager2=findViewById(R.id.viewPager2)
        tabLayout=findViewById(R.id.tabLayout)
        viewPagerFragmentAdapter= ViewPagerFragmentAdapter(this)

        viewPager2.adapter=viewPagerFragmentAdapter
        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            if(position==0){
                tab.text="Salami"
            }
            if (position==1){
                tab.text="Shavi sia"
            }
            if (position==2){
                tab.text="siurprizi"
            }

        }.attach()

    }
}