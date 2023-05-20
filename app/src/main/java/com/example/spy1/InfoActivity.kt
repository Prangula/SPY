package com.example.spy1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_info.*
import kotlinx.android.synthetic.main.activity_players.*

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        toolbar()
    }

    private fun toolbar(){

        setSupportActionBar(toolbar_info)

        toolbar_info.setNavigationIcon(R.drawable.baseline_arrow_back_24)

        toolbar_info.setNavigationOnClickListener {

            onBackPressed()

        }


    }
}