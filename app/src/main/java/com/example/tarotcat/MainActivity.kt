package com.example.tarotcat

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.tarotcat.adapter.ContentAdapter
import com.example.tarotcat.adapter.PagerAdapter
import com.example.tarotcat.model.ContentDTO
import com.example.tarotcat.model.PagerDTO

class MainActivity : AppCompatActivity() {

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var viewPager : ViewPager2 = findViewById(R.id.view_pager_top)

        var pagerList = ArrayList<PagerDTO>()
        pagerList.add(PagerDTO(R.color.purple_200, "1 Page"))
        pagerList.add(PagerDTO(R.color.purple_500, "2 Page"))
        pagerList.add(PagerDTO(R.color.purple_700, "3 Page"))
        pagerList.add(PagerDTO(R.color.teal_200, "4 Page"))
        pagerList.add(PagerDTO(R.color.teal_700, "5 Page"))

        viewPager.adapter = PagerAdapter(pagerList)
        viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        var contentList = ArrayList<ContentDTO>()
        contentList.add(ContentDTO(R.color.purple_200, "1 Page"))
        contentList.add(ContentDTO(R.color.purple_500, "2 Page"))
        contentList.add(ContentDTO(R.color.purple_700, "3 Page"))
        contentList.add(ContentDTO(R.color.teal_200, "4 Page"))

        var recyclerView : RecyclerView = findViewById(R.id.recycler_view_contents)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = ContentAdapter(contentList)





    }
}