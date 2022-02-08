package com.example.a2022kw_winterproj.selection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a2022kw_winterproj.R
import kotlinx.android.synthetic.main.activity_selection.*

class SelectionActivity : AppCompatActivity() {
    lateinit var myAdapter: MyAdapter
    val datas = mutableListOf<MyData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selection)

        initRecycler()
    }
    private fun initRecycler() {
        myAdapter = MyAdapter(this)
        rv_profile.adapter = myAdapter


        datas.apply {
            add(MyData(img = R.drawable.icons8_love_100, theme = "사랑"))
            add(MyData(img = R.drawable.icons8_life_100, theme = "인생"))
            add(MyData(img = R.drawable.icons8_study_100, theme = "공부"))
            add(MyData(img = R.drawable.icons8_victory_100, theme = "성공"))
            add(MyData(img = R.drawable.icons8_friend_100, theme = "친구"))
            add(MyData(img = R.drawable.icons8_read_100, theme = "독서"))
            add(MyData(img = R.drawable.icons8_bye_100, theme = "이별"))
            add(MyData(img = R.drawable.icons8_time_100, theme = "시간"))
            add(MyData(img = R.drawable.icons8_try_100, theme = "노력"))
            add(MyData(img = R.drawable.icons8_hope_100, theme = "희망"))
            add(MyData(img = R.drawable.icons8_challenge_100, theme = "도전"))
            add(MyData(img = R.drawable.icons8_pride_100, theme = "자신감"))

            myAdapter.datas = datas
            myAdapter.notifyDataSetChanged()

        }
    }
}