package com.example.spy1

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_spy.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    private lateinit var playerNumber:String
    private lateinit var spyNumber:String
    private lateinit var timerNumber:String




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        playerNumber = intent.getStringExtra("playerNumber")?:"3"
        spyNumber = intent.getStringExtra("spyNumber")?:"1"
        timerNumber = intent.getStringExtra("timerNumber")?:"1"




        btnPlayer()
        btnSpys()
        btnTimer()
        btnInfo()


        btn_start.setOnClickListener {


            val intent = Intent(this,OpenCardActivity::class.java)
            intent.putExtra("playerNumber",playerNumber)
            intent.putExtra("spyNumber",spyNumber)
            intent.putExtra("timerNumber",timerNumber)
            startActivity(intent)

        }
        Log.d("luka","playerNumber: $playerNumber")
    }

    private fun btnPlayer(){

        btn_players.setOnClickListener {

            val intent = Intent(this,PlayersActivity::class.java)
            intent.putExtra("spyNumber",spyNumber)
            intent.putExtra("timerNumber",timerNumber)
            startActivity(intent)

        }

    }

    private fun btnSpys(){

        btn_spys.setOnClickListener {

            val intent = Intent(this,SpyActivity::class.java)
            intent.putExtra("playerNumber",playerNumber)
            intent.putExtra("timerNumber",timerNumber)
            startActivity(intent)
        }


    }

    private fun btnTimer(){

        btn_timer.setOnClickListener {

            val intent = Intent(this,TimerActivity::class.java)
            intent.putExtra("playerNumber",playerNumber)
            intent.putExtra("spyNumber",spyNumber)
            startActivity(intent)

        }


    }

    private fun btnInfo(){

        btn_info.setOnClickListener {

      val intent = Intent(this,InfoActivity::class.java)
            startActivity(intent)


        }


    }



}