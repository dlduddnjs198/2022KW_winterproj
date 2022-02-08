package com.example.a2022kw_winterproj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a2022kw_winterproj.selection.SelectionActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pick_btn.setOnClickListener{
            val intent = Intent(this@MainActivity, SelectionActivity::class.java)
            startActivity(intent)
        }
    }
}