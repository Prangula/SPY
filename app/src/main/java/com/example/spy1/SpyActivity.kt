package com.example.spy1

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_players.*
import kotlinx.android.synthetic.main.activity_spy.*

class SpyActivity : AppCompatActivity() {

    private lateinit var playerNumber:String
    private lateinit var timerNumber:String




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spy)




        spyNumber()
        toolbar()




        playerNumber = intent.getStringExtra("playerNumber").toString()
        timerNumber = intent.getStringExtra("timerNumber").toString()



        btn_accept_spys.setOnClickListener {

           val intent = Intent(this,MainActivity::class.java)
            intent.putExtra("spyNumber",tv_spys.text.toString())
            intent.putExtra("playerNumber",playerNumber)
            intent.putExtra("timerNumber",timerNumber)


            startActivity(intent)
            Toast.makeText(this,"თქვენ აირჩიეთ ${tv_spys.text} ჯაშუში",Toast.LENGTH_SHORT).show()





        }



    }

    private fun spyNumber() {


        btn_plus_spys.setOnClickListener {

            if(playerNumber == "3" || playerNumber == "4" || playerNumber =="5"){

                tv_spys.text = "1"
                btn_plus_spys.isEnabled = false

            }
            else if((playerNumber =="6" || playerNumber =="7" || playerNumber == "8") && tv_spys.text.toString().toInt()==2){

                btn_plus_spys.isEnabled=false


            }
            else if((playerNumber=="9"||playerNumber=="10")&&tv_spys.text.toString().toInt()==3){
                btn_plus_spys.isEnabled=false


            }


            else{
                tv_spys.text = "${tv_spys.text.toString().toInt() + 1}"
                btn_minus_spys.isEnabled=true
            }

        }

        btn_minus_spys.setOnClickListener {

            if(playerNumber == "3" || playerNumber == "4" || playerNumber =="5"){

                tv_spys.text = "1"
                btn_minus_spys.isEnabled = false

            }

            else if((playerNumber =="6" || playerNumber =="7" || playerNumber == "8") && tv_spys.text.toString().toInt()==1){

                btn_minus_spys.isEnabled=false

            }

            else if((playerNumber=="9"||playerNumber=="10")&&tv_spys.text.toString().toInt()==1){
                btn_minus_spys.isEnabled=false
            }




            else{

                tv_spys.text = "${tv_spys.text.toString().toInt() - 1}"
                btn_plus_spys.isEnabled=true
            }

        }


    }

        private fun toolbar() {

            setSupportActionBar(toolbar_spys)

            toolbar_spys.setNavigationIcon(R.drawable.baseline_arrow_back_24)

            toolbar_spys.setNavigationOnClickListener {

                onBackPressed()

            }


        }
    }
