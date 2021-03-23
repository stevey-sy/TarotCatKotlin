package com.example.tarotcat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.tarotcat.adapter.PagerAdapter
import com.example.tarotcat.model.PagerDTO

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var viewPager : ViewPager2 = findViewById(R.id.view_pager_top)

        var pagerList = ArrayList<PagerDTO>()
        pagerList.add(PagerDTO(android.R.color.white, "1 Page"))
        pagerList.add(PagerDTO(android.R.color.holo_red_light, "2 Page"))
        pagerList.add(PagerDTO(android.R.color.holo_green_dark, "3 Page"))
        pagerList.add(PagerDTO(android.R.color.holo_orange_dark, "4 Page"))
        pagerList.add(PagerDTO(android.R.color.white, "5 Page"))


        viewPager.adapter = PagerAdapter(pagerList)
        viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL



    }
}