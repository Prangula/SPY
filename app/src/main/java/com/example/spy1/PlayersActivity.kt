package com.example.spy1

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_players.*
import kotlinx.android.synthetic.main.activity_spy.*

class PlayersActivity : AppCompatActivity() {
    private lateinit var spyNumber:String
    private lateinit var timerNumber:String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_players)




        toolbar()
        playerNumber()


        spyNumber = intent.getStringExtra("spyNumber").toString()
        timerNumber = intent.getStringExtra("timerNumber").toString()



        btn_accept_players.setOnClickListener {

            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra("playerNumber",tv_players.text.toString())
            intent.putExtra("spyNumber",spyNumber)
            intent.putExtra("timerNumber",timerNumber)


            startActivity(intent)

            Toast.makeText(this,"თქვენ აირჩიეთ ${tv_players.text} მოთამაშე",Toast.LENGTH_SHORT).show()

            }







    }

    private fun playerNumber() {
        btn_plus_players.setOnClickListener {


            if (spyNumber == "1" && tv_players.text.toString().toInt()==10) {

                btn_plus_players.isEnabled = false

            }

            else if(spyNumber == "2" && tv_players.text.toString().toInt()==10){

                btn_plus_players.isEnabled = false
            }

            else if(spyNumber == "3" && tv_players.text.toString().toInt() ==10){

                btn_plus_players.isEnabled = false

            }

            else {
                tv_players.text = "${tv_players.text.toString().toInt() + 1}"
                btn_minus_players.isEnabled = true
            }

        }

        btn_minus_players.setOnClickListener {

            if (spyNumber == "1" && tv_players.text.toString().toInt()==3) {


                btn_minus_players.isEnabled = false


            }

            else if(spyNumber == "2" && tv_players.text.toString().toInt()==6){

                btn_minus_players.isEnabled = false
            }

            else if(spyNumber =="3" && tv_players.text.toString().toInt()==9){

                btn_minus_players.isEnabled = false
            }

            else {

                tv_players.text = "${tv_players.text.toString().toInt() - 1}"
                btn_plus_players.isEnabled = true
            }


        }
    }


    private fun toolbar(){

        setSupportActionBar(toolbar_players)

        toolbar_players.setNavigationIcon(R.drawable.baseline_arrow_back_24)

        toolbar_players.setNavigationOnClickListener {

            onBackPressed()

        }


    }


}