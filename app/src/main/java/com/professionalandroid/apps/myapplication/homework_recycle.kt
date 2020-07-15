package com.professionalandroid.apps.myapplication

import android.graphics.Insets.add
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_recycle_view.*

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homework_recycleview)

        var data = ArrayList<data>()

        for (i in 0 until 10) {
            val sampledata = data(title1 = "" + i)
            data.add(sampledata)
        }


        val adapt = ReCycle(data, LayoutInflater.from(this))
        recycle.adapter = adapt
        recycle.layoutManager = LinearLayoutManager(this)
    }

}

class data(
    val title1: String? = null
) {

}

class recycle(
    val itemList: ArrayList<data>,
    val inflater: LayoutInflater
) : RecyclerView.Adapter<ReCycle.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title1 = view.findViewById<TextView>(R.id.text_home
        )
     

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReCycle.ViewHolder {
        return ViewHolder(inflater.inflate(R.layout.homework_recycle2, parent, false))
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ReCycle.ViewHolder, position: Int) {
        holder.title1.setText(itemList[position].title1)
        holder.title2.setText(itemList[position].title2)
    }
}



