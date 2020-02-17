package com.example.test

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.main_itemview.view.*

class NextFragment(val position:Int) :Fragment(){
    @SuppressLint("SetTextI18n")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_next,container,false)
        val posData =  TimeObject.time!!.get(position)
        view.findViewById<TextView>(R.id.mText).text = "${posData.startTime}\n${posData.endTime}\n${posData.parameter?.parameterName}${posData.parameter?.parameterUnit}"
        return view
    }
}