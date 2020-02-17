package com.example.test.main

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R
import com.example.test.TimeObject
import kotlinx.android.synthetic.main.main_itemview.view.*

class MainAdpater(main: MainActivity) : RecyclerView.Adapter<MainAdpater.ViewHolder>(){

    val main = main
    val mData = TimeObject.time!!
    lateinit var mTextView: TextView
    lateinit var mImage: ImageView
    lateinit var itemView:View
    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        itemView =  LayoutInflater.from(parent.context).inflate(R.layout.main_itemview,parent,false)
        mTextView = itemView.findViewById(R.id.dataText)
        mImage = itemView.findViewById(R.id.itemImage)

        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
       return mData.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.dataText.setOnClickListener {
            main.goNext(position)
        }
        val posData = mData.get(position)
        mTextView.text = "${posData.startTime}\n${posData.endTime}\n${posData.parameter?.parameterName}${posData.parameter?.parameterUnit}"
    }
}

