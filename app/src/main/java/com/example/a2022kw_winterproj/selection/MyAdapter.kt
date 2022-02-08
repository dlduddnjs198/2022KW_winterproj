package com.example.a2022kw_winterproj.selection

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.a2022kw_winterproj.R
import com.example.a2022kw_winterproj.WordActivity

class MyAdapter(private val context: Context) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    var datas = mutableListOf<MyData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.layout_recycler_list,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = datas.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(datas[position])
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val txtName: TextView = itemView.findViewById(R.id.theme_name)
        private val imgProfile: ImageView = itemView.findViewById(R.id.profile_img)

        fun bind(item: MyData) {
            txtName.text = item.theme
            Glide.with(itemView).load(item.img).into(imgProfile)

            itemView.setOnClickListener {
                Intent(context, WordActivity::class.java).apply {
                    putExtra("theme", item.theme.toString())
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                }.run { context.startActivity(this) }
            }
        }
    }


}