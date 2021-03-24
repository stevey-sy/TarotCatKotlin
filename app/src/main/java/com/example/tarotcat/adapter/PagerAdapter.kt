package com.example.tarotcat.adapter

import android.content.ContentValues.TAG
import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.tarotcat.R
import com.example.tarotcat.model.PagerDTO

class PagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var tvTitle : TextView = itemView.findViewById(R.id.tv_title)
    var constraint : ConstraintLayout = itemView.findViewById(R.id.constraint)
}

class PagerAdapter(private val pagerList: List<PagerDTO>) : RecyclerView.Adapter<PagerViewHolder>() {


    // view holder 만드는 부분
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.pager_item_view,
            parent,
            false
        )
        return PagerViewHolder(view)
    }

    override fun onBindViewHolder(holder: PagerViewHolder, position: Int) {
        val pager: PagerDTO = pagerList[position]
        holder.tvTitle.text = pager.title
        holder.constraint.setBackgroundColor(pager.color)
        Log.d(TAG, "onBindViewHolder: "+pager.color)
    }

    override fun getItemCount(): Int = pagerList.size
}