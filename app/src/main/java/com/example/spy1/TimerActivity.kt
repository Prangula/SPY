package com.example.spy1

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_players.*
import kotlinx.android.synthetic.main.activity_spy.*
import kotlinx.android.synthetic.main.activity_timer.*

class TimerActivity : AppCompatActivity() {

    private lateinit var playerNumber:String
    private lateinit var spyNumber:String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timer)


        toolbar()
        timerNumber()

        playerNumber = intent.getStringExtra("playerNumber").toString()
        spyNumber = intent.getStringExtra("spyNumber").toString()


        btn_accept_timer.setOnClickListener {

            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra("timerNumber",tv_timer.text.toString())
            intent.putExtra("playerNumber",playerNumber)
            intent.putExtra("spyNumber",spyNumber)


            startActivity(intent)

            Toast.makeText(this,"თქვენ აირჩიეთ ${tv_timer.text} წუთი", Toast.LENGTH_SHORT).show()

        }




    }


    private fun toolbar(){

        setSupportActionBar(toolbar_timer)

        toolbar_timer.setNavigationIcon(R.drawable.baseline_arrow_back_24)

        toolbar_timer.setNavigationOnClickListener {

            onBackPressed()

        }


    }


    private fun timerNumber(){

        btn_plus_timer.setOnClickListener {

            if(tv_timer.text.toString().toInt() == 5){

                btn_plus_timer.isEnabled = false

            }
            else{

                tv_timer.text = "${tv_timer.text.toString().toInt() + 1}"
                btn_minus_timer.isEnabled =true

            }
        }


        btn_minus_timer.setOnClickListener {

            if(tv_timer.text.toString().toInt() == 1){

                btn_minus_timer.isEnabled = false
            }

            else{
                tv_timer.text = "${tv_timer.text.toString().toInt() - 1}"
                btn_plus_timer.isEnabled = true
            }

        }


    }
}