package com.example.tarotcat.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.tarotcat.R
import com.example.tarotcat.model.ContentDTO

class ContentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var tvTitle : TextView = itemView.findViewById(R.id.tv_content)
    var constraint : ConstraintLayout = itemView.findViewById(R.id.content_constraint)
    lateinit var data : ContentDTO

    fun onBind(data: ContentDTO) {
        this.data = data
        tvTitle.text = data.title
        constraint.setBackgroundResource(data.color)
    }

}

class ContentAdapter(private val contentList: List<ContentDTO>) : RecyclerView.Adapter<ContentViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.content_item_view,
            parent,
            false
        )
        return ContentViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContentViewHolder, position: Int) {
        if (holder is ContentViewHolder) {
            holder.onBind(contentList[position])
        }
    }

    override fun getItemCount(): Int = contentList.size
}