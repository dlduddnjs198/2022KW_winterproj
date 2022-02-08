package com.example.a2022kw_winterproj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a2022kw_winterproj.database.AppDatabase
import com.example.a2022kw_winterproj.database.MyEntity
import kotlinx.android.synthetic.main.activity_word.*

class WordActivity : AppCompatActivity() {

    val TAG = "WordActivity"
    var db : AppDatabase? = null
    var contactsList = mutableListOf<MyEntity>()
    var datas : String?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_word)

        //초기화
        db = AppDatabase.getDatabase(this)
        datas = intent.getStringExtra("theme")
        var num = (1..10).random()

        when(datas){
            "사랑" -> {wordbackground.setBackgroundResource(R.drawable.background_love)}
            "인생" -> {wordbackground.setBackgroundResource(R.drawable.background_life)}
            "공부" -> {wordbackground.setBackgroundResource(R.drawable.background_study)
                wisesaying.setTextColor(resources.getColor(R.color.black))
                author.setTextColor(resources.getColor(R.color.black))}
            "성공" -> {wordbackground.setBackgroundResource(R.drawable.background_victory)
                wisesaying.setTextColor(resources.getColor(R.color.black))
                author.setTextColor(resources.getColor(R.color.black))}
            "친구" -> {wordbackground.setBackgroundResource(R.drawable.background_friend)}
            "독서" -> {wordbackground.setBackgroundResource(R.drawable.background_read)
                wisesaying.setTextColor(resources.getColor(R.color.black))
                author.setTextColor(resources.getColor(R.color.black))}
            "이별" -> {wordbackground.setBackgroundResource(R.drawable.background_bye)}
            "시간" -> {wordbackground.setBackgroundResource(R.drawable.background_time)}
            "노력" -> {wordbackground.setBackgroundResource(R.drawable.background_try)}
            "희망" -> {wordbackground.setBackgroundResource(R.drawable.background_hope)}
            "도전" -> {wordbackground.setBackgroundResource(R.drawable.background_challenge)}
            "자신감" -> {wordbackground.setBackgroundResource(R.drawable.background_pride)}
        }

        val randomSaying = db!!.myDao().findWithThemeAndNum(datas!!, num)

        wisesaying.text= randomSaying[0].saying.toString()
        author.text= "- "+randomSaying[0].author.toString()+" -"

    }
}