package com.example.spy1

import android.content.Context
import android.content.Intent
import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_game.*
import kotlinx.android.synthetic.main.activity_open_card.*

class GameActivity : AppCompatActivity() {

    private lateinit var playerNumber:String
    private lateinit var spyNumber:String
    private lateinit var timerNumber:String


    private var countDownTimer: CountDownTimer? = null
    private var timerDuration: Long = 60000
    private var pauseOffSet: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)


        playerNumber = intent.getStringExtra("playerNumber").toString()
        spyNumber = intent.getStringExtra("spyNumber").toString()
        timerNumber = intent.getStringExtra("timerNumber").toString()



        timer()

        btn_restart.setOnClickListener {

            val intent = Intent(this,OpenCardActivity::class.java)
            intent.putExtra("playerNumber",playerNumber)
            intent.putExtra("spyNumber",spyNumber)
            intent.putExtra("timerNumber",timerNumber)
            countDownTimer!!.cancel()
            startActivity(intent)
            finish()
        }

        btn_menu.setOnClickListener {

            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra("playerNumber",playerNumber)
            intent.putExtra("spyNumber",spyNumber)
            intent.putExtra("timerNumber",timerNumber)
            countDownTimer!!.cancel()
            startActivity(intent)
            finish()

        }


    }

    private fun timer() {
        if (timerNumber == "1") {

            tv_clock.text = "${(timerDuration / 1000).toString()}"
            startTimer(pauseOffSet)
        } else if (timerNumber == "2") {

            timerDuration = 120000
            tv_clock.text = "${(timerDuration / 1000).toString()}"
            startTimer(pauseOffSet)
        }
        else if (timerNumber == "3") {
            timerDuration = 180000
            tv_clock.text = "${(timerDuration / 1000).toString()}"
            startTimer(pauseOffSet)
        } else if (timerNumber == "4") {
            timerDuration = 240000
            tv_clock.text = "${(timerDuration / 1000).toString()}"
            startTimer(pauseOffSet)
        } else if (timerNumber == "5") {
            timerDuration = 300000
            tv_clock.text = "${(timerDuration / 1000).toString()}"
            startTimer(pauseOffSet)
        }
    }


    private fun startTimer(pauseOffSetL: Long){

        countDownTimer = object : CountDownTimer(timerDuration-pauseOffSetL,1000){

            override fun onTick(millisUntilFinished: Long) {
                val seconds = (millisUntilFinished / 1000) % 60
                val minutes = (millisUntilFinished / 1000) / 60
                val timeString = String.format("%02d:%02d", minutes, seconds)
                tv_clock.text = timeString

            }

            override fun onFinish() {
                Toast.makeText(this@GameActivity,"Timer is finished"
                    , Toast.LENGTH_LONG).show()

                tv_clock.setBackgroundColor(ContextCompat.getColor(this@GameActivity,R.color.red))

                val vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    vibrator.vibrate(
                        VibrationEffect.createOneShot(
                            1000,
                            VibrationEffect.DEFAULT_AMPLITUDE
                        )
                    )
                } else {
                    // Deprecated in API 26 (Android 8.0 Oreo)
                    vibrator.vibrate(1000)
                }
            }

        }.start()


    }




}