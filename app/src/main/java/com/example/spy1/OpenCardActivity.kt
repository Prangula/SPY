package com.example.spy1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_open_card.*
import kotlinx.android.synthetic.main.activity_players.*


class OpenCardActivity : AppCompatActivity() {
    private lateinit var playerNumber:String
    private lateinit var spyNumber:String
    private lateinit var timerNumber:String
    private var wordsList: ArrayList<WordsData>? = null
    private var words:WordsData? = null
    private var currentPosition: Int = 1
    private var btnCount:Int = 0
    private lateinit var player1:String
    private lateinit var player2:String
    private lateinit var player3:String
    private lateinit var player4:String
    private lateinit var player5:String
    private lateinit var player6:String
    private lateinit var player7:String
    private lateinit var player8:String
    private lateinit var player9:String
    private lateinit var player10:String



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_card)

        toolbar()

        playerNumber = intent.getStringExtra("playerNumber").toString()
        spyNumber = intent.getStringExtra("spyNumber").toString()
        timerNumber = intent.getStringExtra("timerNumber").toString()


        wordsList = Words.getWords()

        play_card.background = ContextCompat.getDrawable(this,R.drawable.question)
        tv_touch.text = "დააჭირეთ ბარათს, რათა იხილოთ თქვენი სიტყვა"

        game()


    }

    private fun toolbar(){

        setSupportActionBar(toolbar_card)

        toolbar_card.setNavigationIcon(R.drawable.baseline_arrow_back_24)

        toolbar_card.setNavigationOnClickListener {

            onBackPressed()

        }


    }

    private fun game() {
        if (playerNumber == "3" && spyNumber == "1") {

            logic3Player1Spy()
        } else if (playerNumber == "4" && spyNumber == "1") {

            logic4Player1Spy()

        } else if (playerNumber == "5" && spyNumber == "1") {

            logic5Player1Spy()

        } else if (playerNumber == "6" && spyNumber == "1") {

            logic6Player1Spy()

        } else if (playerNumber == "7" && spyNumber == "1") {

            logic7Player1Spy()

        } else if (playerNumber == "8" && spyNumber == "1") {

            logic8Player1Spy()

        } else if (playerNumber == "6" && spyNumber == "2") {

            logic6Player2Spy()

        } else if (playerNumber == "7" && spyNumber == "2") {

            logic7Player2Spy()

        } else if (playerNumber == "8" && spyNumber == "2") {

            logic8Player2Spy()

        } else if (playerNumber == "9" && spyNumber == "1") {

            logic9Player1Spy()

        } else if (playerNumber == "10" && spyNumber == "1") {

            logic10Player1Spy()

        } else if (playerNumber == "9" && spyNumber == "2") {

            logic9Player2Spy()

        } else if (playerNumber == "10" && spyNumber == "2") {

            logic10Player2Spy()

        } else if (playerNumber == "9" && spyNumber == "3") {

            logic9Player3Spy()

        } else if (playerNumber == "10" && spyNumber == "3") {

            logic10Player3Spy()

        }
    }

    private fun setWords(){

        words = wordsList!![currentPosition-1]
        tv_word.text = words!!.word

    }

    private fun player(player:String){

        if(player=="citizen"){

            play_card.background = ContextCompat.getDrawable(this, R.drawable.citizen)
            setWords()
            tv_touch.text = "კიდევ დააჭირეთ, რათა გაქრეს თქვენი სიტყვა ბარათიდან და გადაეცით მობილური მეგობარს."

        }
        else if(player=="spy") {
            play_card.background = ContextCompat.getDrawable(this, R.drawable.spy)
            tv_word.text = "შენ ხარ ჯაშუში"
            tv_touch.text = "კიდევ დააჭირეთ, რათა გაქრეს თქვენი სიტყვა ბარათიდან და გადაეცით მობილური მეგობარს."

        }


    }

    private fun logic3Player1Spy(){

   randomPlayer3Spy1()

        play_card.setOnClickListener {

        when(btnCount){

                0 -> {
                    player(player1)
                }
                2 ->  {
                    player(player2)
                }
                4 ->  {
                    player(player3)
                }
                5 -> {
                    val intent = Intent(this,GameActivity::class.java)
                    intent.putExtra("playerNumber",playerNumber)
                    intent.putExtra("spyNumber",spyNumber)
                    intent.putExtra("timerNumber",timerNumber)
                    startActivity(intent)
                }

                else -> {
                    play_card.background = ContextCompat.getDrawable(this,R.drawable.question)
                    tv_word.text = ""
                    tv_touch.text = "დააჭირეთ ბარათს, რათა იხილოთ თქვენი სიტყვა"
                }
            }
            btnCount++
    }

    }

    private fun logic4Player1Spy(){

        randomPlayer4Spy1()

        play_card.setOnClickListener {

            when(btnCount){

                0 -> {
                    player(player1)
                }
                2 ->  {
                    player(player2)
                }
                4 ->  {
                    player(player3)
                }

                6 -> {

                    player (player4)
                }

                7 -> {
                    val intent = Intent(this,GameActivity::class.java)
                    intent.putExtra("playerNumber",playerNumber)
                    intent.putExtra("spyNumber",spyNumber)
                    intent.putExtra("timerNumber",timerNumber)
                    startActivity(intent)
                }

                else -> {
                    play_card.background = ContextCompat.getDrawable(this,R.drawable.question)
                    tv_word.text = ""
                    tv_touch.text = "დააჭირეთ ბარათს, რათა იხილოთ თქვენი სიტყვა"
                }
            }
            btnCount++
        }

    }

    private fun logic5Player1Spy(){

        randomPlayer5Spy1()

        play_card.setOnClickListener {

            when(btnCount){

                0 -> {
                    player(player1)
                }
                2 ->  {
                    player(player2)
                }
                4 ->  {
                    player(player3)
                }

                6 -> {

                    player (player4)
                }

                8 -> {

                    player(player5)
                }

                9 -> {
                    val intent = Intent(this,GameActivity::class.java)
                    intent.putExtra("playerNumber",playerNumber)
                    intent.putExtra("spyNumber",spyNumber)
                    intent.putExtra("timerNumber",timerNumber)
                    startActivity(intent)
                }

                else -> {
                    play_card.background = ContextCompat.getDrawable(this,R.drawable.question)
                    tv_word.text = ""
                    tv_touch.text = "დააჭირეთ ბარათს, რათა იხილოთ თქვენი სიტყვა"
                }
            }
            btnCount++
        }

    }

    private fun logic6Player1Spy(){

        randomPlayer6Spy1()

        play_card.setOnClickListener {

            when(btnCount){

                0 -> {
                    player(player1)
                }
                2 ->  {
                    player(player2)
                }
                4 ->  {
                    player(player3)
                }

                6 -> {

                    player (player4)
                }

                8 -> {

                    player(player5)
                }

                10 -> {

                    player(player6)
                }

                11 -> {
                    val intent = Intent(this,GameActivity::class.java)
                    intent.putExtra("playerNumber",playerNumber)
                    intent.putExtra("spyNumber",spyNumber)
                    intent.putExtra("timerNumber",timerNumber)
                    startActivity(intent)
                }

                else -> {
                    play_card.background = ContextCompat.getDrawable(this,R.drawable.question)
                    tv_word.text = ""
                    tv_touch.text = "დააჭირეთ ბარათს, რათა იხილოთ თქვენი სიტყვა"
                }
            }
            btnCount++
        }

    }

    private fun logic7Player1Spy(){

        randomPlayer7Spy1()

        play_card.setOnClickListener {

            when(btnCount){

                0 -> {
                    player(player1)
                }
                2 ->  {
                    player(player2)
                }
                4 ->  {
                    player(player3)
                }

                6 -> {

                    player (player4)
                }

                8 -> {

                    player(player5)
                }

                10 -> {

                    player(player6)
                }

                12 -> {

                    player(player7)
                }

                13 -> {
                    val intent = Intent(this,GameActivity::class.java)
                    intent.putExtra("playerNumber",playerNumber)
                    intent.putExtra("spyNumber",spyNumber)
                    intent.putExtra("timerNumber",timerNumber)
                    startActivity(intent)
                }

                else -> {
                    play_card.background = ContextCompat.getDrawable(this,R.drawable.question)
                    tv_word.text = ""
                    tv_touch.text = "დააჭირეთ ბარათს, რათა იხილოთ თქვენი სიტყვა"
                }
            }
            btnCount++
        }

    }

    private fun logic8Player1Spy(){

        randomPlayer8Spy1()

        play_card.setOnClickListener {

            when(btnCount){

                0 -> {
                    player(player1)
                }
                2 ->  {
                    player(player2)
                }
                4 ->  {
                    player(player3)
                }

                6 -> {

                    player (player4)
                }

                8 -> {

                    player(player5)
                }

                10 -> {

                    player(player6)
                }

                12 -> {

                    player(player7)
                }

                14 -> {

                    player(player8)
                }

                15 -> {
                    val intent = Intent(this,GameActivity::class.java)
                    intent.putExtra("playerNumber",playerNumber)
                    intent.putExtra("spyNumber",spyNumber)
                    intent.putExtra("timerNumber",timerNumber)
                    startActivity(intent)
                }

                else -> {
                    play_card.background = ContextCompat.getDrawable(this,R.drawable.question)
                    tv_word.text = ""
                    tv_touch.text = "დააჭირეთ ბარათს, რათა იხილოთ თქვენი სიტყვა"
                }
            }
            btnCount++
        }

    }

    private fun logic6Player2Spy(){

        randomPlayer6Spy2()

        play_card.setOnClickListener {

            when(btnCount){

                0 -> {
                    player(player1)
                }
                2 ->  {
                    player(player2)
                }
                4 ->  {
                    player(player3)
                }

                6 -> {

                    player (player4)
                }

                8 -> {

                    player(player5)
                }

                10 -> {

                    player(player6)
                }


                11 -> {
                    val intent = Intent(this,GameActivity::class.java)
                    intent.putExtra("playerNumber",playerNumber)
                    intent.putExtra("spyNumber",spyNumber)
                    intent.putExtra("timerNumber",timerNumber)
                    startActivity(intent)
                }

                else -> {
                    play_card.background = ContextCompat.getDrawable(this,R.drawable.question)
                    tv_word.text = ""
                    tv_touch.text = "დააჭირეთ ბარათს, რათა იხილოთ თქვენი სიტყვა"
                }
            }
            btnCount++
        }

    }

    private fun logic7Player2Spy(){

        randomPlayer7Spy2()

        play_card.setOnClickListener {

            when(btnCount){

                0 -> {
                    player(player1)
                }
                2 ->  {
                    player(player2)
                }
                4 ->  {
                    player(player3)
                }

                6 -> {

                    player (player4)
                }

                8 -> {

                    player(player5)
                }

                10 -> {

                    player(player6)
                }

                12 -> {

                    player(player7)
                }


                13 -> {
                    val intent = Intent(this,GameActivity::class.java)
                    intent.putExtra("playerNumber",playerNumber)
                    intent.putExtra("spyNumber",spyNumber)
                    intent.putExtra("timerNumber",timerNumber)
                    startActivity(intent)
                }

                else -> {
                    play_card.background = ContextCompat.getDrawable(this,R.drawable.question)
                    tv_word.text = ""
                    tv_touch.text = "დააჭირეთ ბარათს, რათა იხილოთ თქვენი სიტყვა"
                }
            }
            btnCount++
        }

    }

    private fun logic8Player2Spy(){

        randomPlayer8Spy2()

        play_card.setOnClickListener {

            when(btnCount){

                0 -> {
                    player(player1)
                }
                2 ->  {
                    player(player2)
                }
                4 ->  {
                    player(player3)
                }

                6 -> {

                    player (player4)
                }

                8 -> {

                    player(player5)
                }

                10 -> {

                    player(player6)
                }

                12 -> {

                    player(player7)
                }

                14 -> {

                    player(player8)
                }


                15 -> {
                    val intent = Intent(this,GameActivity::class.java)
                    intent.putExtra("playerNumber",playerNumber)
                    intent.putExtra("spyNumber",spyNumber)
                    intent.putExtra("timerNumber",timerNumber)
                    startActivity(intent)
                }

                else -> {
                    play_card.background = ContextCompat.getDrawable(this,R.drawable.question)
                    tv_word.text = ""
                    tv_touch.text = "დააჭირეთ ბარათს, რათა იხილოთ თქვენი სიტყვა"
                }
            }
            btnCount++
        }

    }

    private fun logic9Player1Spy(){

        randomPlayer9Spy1()

        play_card.setOnClickListener {

            when(btnCount){

                0 -> {
                    player(player1)
                }
                2 ->  {
                    player(player2)
                }
                4 ->  {
                    player(player3)
                }

                6 -> {

                    player (player4)
                }

                8 -> {

                    player(player5)
                }

                10 -> {

                    player(player6)
                }

                12 -> {

                    player(player7)
                }

                14 -> {

                    player(player8)
                }


                16 -> {

                    player(player9)
                }


                17 -> {
                    val intent = Intent(this,GameActivity::class.java)
                    intent.putExtra("playerNumber",playerNumber)
                    intent.putExtra("spyNumber",spyNumber)
                    intent.putExtra("timerNumber",timerNumber)
                    startActivity(intent)
                }

                else -> {
                    play_card.background = ContextCompat.getDrawable(this,R.drawable.question)
                    tv_word.text = ""
                    tv_touch.text = "დააჭირეთ ბარათს, რათა იხილოთ თქვენი სიტყვა"
                }
            }
            btnCount++
        }

    }

    private fun logic10Player1Spy(){

        randomPlayer10Spy1()

        play_card.setOnClickListener {

            when(btnCount){

                0 -> {
                    player(player1)
                }
                2 ->  {
                    player(player2)
                }
                4 ->  {
                    player(player3)
                }

                6 -> {

                    player (player4)
                }

                8 -> {

                    player(player5)
                }

                10 -> {

                    player(player6)
                }

                12 -> {

                    player(player7)
                }

                14 -> {

                    player(player8)
                }


                16 -> {

                    player(player9)
                }

                18 -> {

                    player(player10)
                }


                19 -> {
                    val intent = Intent(this,GameActivity::class.java)
                    intent.putExtra("playerNumber",playerNumber)
                    intent.putExtra("spyNumber",spyNumber)
                    intent.putExtra("timerNumber",timerNumber)
                    startActivity(intent)
                }

                else -> {
                    play_card.background = ContextCompat.getDrawable(this,R.drawable.question)
                    tv_word.text = ""
                    tv_touch.text = "დააჭირეთ ბარათს, რათა იხილოთ თქვენი სიტყვა"
                }
            }
            btnCount++
        }

    }

    private fun logic9Player2Spy(){

        randomPlayer9Spy2()

        play_card.setOnClickListener {

            when(btnCount){

                0 -> {
                    player(player1)
                }
                2 ->  {
                    player(player2)
                }
                4 ->  {
                    player(player3)
                }

                6 -> {

                    player (player4)
                }

                8 -> {

                    player(player5)
                }

                10 -> {

                    player(player6)
                }

                12 -> {

                    player(player7)
                }

                14 -> {

                    player(player8)
                }


                16 -> {

                    player(player9)
                }



                17 -> {
                    val intent = Intent(this,GameActivity::class.java)
                    intent.putExtra("playerNumber",playerNumber)
                    intent.putExtra("spyNumber",spyNumber)
                    intent.putExtra("timerNumber",timerNumber)
                    startActivity(intent)
                }

                else -> {
                    play_card.background = ContextCompat.getDrawable(this,R.drawable.question)
                    tv_word.text = ""
                    tv_touch.text = "დააჭირეთ ბარათს, რათა იხილოთ თქვენი სიტყვა"
                }
            }
            btnCount++
        }

    }

    private fun logic10Player2Spy(){

        randomPlayer10Spy2()

        play_card.setOnClickListener {

            when(btnCount){

                0 -> {
                    player(player1)
                }
                2 ->  {
                    player(player2)
                }
                4 ->  {
                    player(player3)
                }

                6 -> {

                    player (player4)
                }

                8 -> {

                    player(player5)
                }

                10 -> {

                    player(player6)
                }

                12 -> {

                    player(player7)
                }

                14 -> {

                    player(player8)
                }


                16 -> {

                    player(player9)
                }


                18-> {

                    player(player10)
                }



                19 -> {
                    val intent = Intent(this,GameActivity::class.java)
                    intent.putExtra("playerNumber",playerNumber)
                    intent.putExtra("spyNumber",spyNumber)
                    intent.putExtra("timerNumber",timerNumber)
                    startActivity(intent)
                }

                else -> {
                    play_card.background = ContextCompat.getDrawable(this,R.drawable.question)
                    tv_word.text = ""
                    tv_touch.text = "დააჭირეთ ბარათს, რათა იხილოთ თქვენი სიტყვა"
                }
            }
            btnCount++
        }

    }

    private fun logic9Player3Spy(){

        randomPlayer9Spy3()

        play_card.setOnClickListener {

            when(btnCount){

                0 -> {
                    player(player1)
                }
                2 ->  {
                    player(player2)
                }
                4 ->  {
                    player(player3)
                }

                6 -> {

                    player (player4)
                }

                8 -> {

                    player(player5)
                }

                10 -> {

                    player(player6)
                }

                12 -> {

                    player(player7)
                }

                14 -> {

                    player(player8)
                }


                16 -> {

                    player(player9)
                }




                17 -> {
                    val intent = Intent(this,GameActivity::class.java)
                    intent.putExtra("playerNumber",playerNumber)
                    intent.putExtra("spyNumber",spyNumber)
                    intent.putExtra("timerNumber",timerNumber)
                    startActivity(intent)
                }

                else -> {
                    play_card.background = ContextCompat.getDrawable(this,R.drawable.question)
                    tv_word.text = ""
                    tv_touch.text = "დააჭირეთ ბარათს, რათა იხილოთ თქვენი სიტყვა"
                }
            }
            btnCount++
        }

    }

    private fun logic10Player3Spy(){

        randomPlayer10Spy3()

        play_card.setOnClickListener {

            when(btnCount){

                0 -> {
                    player(player1)
                }
                2 ->  {
                    player(player2)
                }
                4 ->  {
                    player(player3)
                }

                6 -> {

                    player (player4)
                }

                8 -> {

                    player(player5)
                }

                10 -> {

                    player(player6)
                }

                12 -> {

                    player(player7)
                }

                14 -> {

                    player(player8)
                }


                16 -> {

                    player(player9)
                }


                18-> {

                    player(player10)
                }




                19 -> {
                    val intent = Intent(this,GameActivity::class.java)
                    intent.putExtra("playerNumber",playerNumber)
                    intent.putExtra("spyNumber",spyNumber)
                    intent.putExtra("timerNumber",timerNumber)
                    startActivity(intent)
                }

                else -> {
                    play_card.background = ContextCompat.getDrawable(this,R.drawable.question)
                    tv_word.text = ""
                    tv_touch.text = "დააჭირეთ ბარათს, რათა იხილოთ თქვენი სიტყვა"
                }
            }
            btnCount++
        }

    }


    private fun randomPlayer3Spy1(){

        var random = mutableListOf("citizen","citizen","spy")
        random.shuffle()

        player1 = random[0]
        player2 = random[1]
        player3 = random[2]

    }
    private fun randomPlayer4Spy1(){

        var random = mutableListOf("citizen","citizen","spy","citizen")
        random.shuffle()

        player1 = random[0]
        player2 = random[1]
        player3 = random[2]
        player4 = random[3]

    }
    private fun randomPlayer5Spy1(){

        var random = mutableListOf("citizen","citizen","spy","citizen","citizen")
        random.shuffle()

        player1 = random[0]
        player2 = random[1]
        player3 = random[2]
        player4 = random[3]
        player5 = random[4]

    }
    private fun randomPlayer6Spy1(){

        var random = mutableListOf("citizen","citizen","spy","citizen","citizen","citizen")
        random.shuffle()

        player1 = random[0]
        player2 = random[1]
        player3 = random[2]
        player4 = random[3]
        player5 = random[4]
        player6 = random[5]

    }
    private fun randomPlayer7Spy1(){

        var random = mutableListOf("citizen","citizen","spy","citizen","citizen","citizen","citizen")
        random.shuffle()

        player1 = random[0]
        player2 = random[1]
        player3 = random[2]
        player4 = random[3]
        player5 = random[4]
        player6 = random[5]
        player7 = random[6]


    }
    private fun randomPlayer8Spy1(){

        var random = mutableListOf("citizen","citizen","spy","citizen","citizen","citizen","citizen","citizen")
        random.shuffle()

        player1 = random[0]
        player2 = random[1]
        player3 = random[2]
        player4 = random[3]
        player5 = random[4]
        player6 = random[5]
        player7 = random[6]
        player8 = random[7]


    }

    private fun randomPlayer6Spy2(){

        var random = mutableListOf("citizen","citizen","spy","citizen","citizen","spy")
        random.shuffle()

        player1 = random[0]
        player2 = random[1]
        player3 = random[2]
        player4 = random[3]
        player5 = random[4]
        player6 = random[5]


    }

    private fun randomPlayer7Spy2(){

        var random = mutableListOf("citizen","citizen","spy","citizen","citizen","citizen","spy")
        random.shuffle()

        player1 = random[0]
        player2 = random[1]
        player3 = random[2]
        player4 = random[3]
        player5 = random[4]
        player6 = random[5]
        player7 = random[6]


    }

    private fun randomPlayer8Spy2(){

        var random = mutableListOf("citizen","citizen","spy","citizen","citizen","citizen","citizen","spy")
        random.shuffle()

        player1 = random[0]
        player2 = random[1]
        player3 = random[2]
        player4 = random[3]
        player5 = random[4]
        player6 = random[5]
        player7 = random[6]
        player8 = random[7]


    }
    private fun randomPlayer9Spy1(){

        var random = mutableListOf("citizen","spy","citizen","citizen","citizen","citizen","citizen","citizen","citizen")
        random.shuffle()

        player1 = random[0]
        player2 = random[1]
        player3 = random[2]
        player4 = random[3]
        player5 = random[4]
        player6 = random[5]
        player7 = random[6]
        player8 = random[7]
        player9 = random[8]


    }
    private fun randomPlayer10Spy1(){

        var random = mutableListOf("citizen","spy","citizen","citizen","citizen","citizen","citizen","citizen","citizen","citizen")
        random.shuffle()

        player1 = random[0]
        player2 = random[1]
        player3 = random[2]
        player4 = random[3]
        player5 = random[4]
        player6 = random[5]
        player7 = random[6]
        player8 = random[7]
        player9 = random[8]
        player10 = random[9]


    }

    private fun randomPlayer9Spy2(){

        var random = mutableListOf("spy","citizen","citizen","citizen","citizen","citizen","citizen","citizen","spy")
        random.shuffle()

        player1 = random[0]
        player2 = random[1]
        player3 = random[2]
        player4 = random[3]
        player5 = random[4]
        player6 = random[5]
        player7 = random[6]
        player8 = random[7]
        player9 = random[8]


    }

    private fun randomPlayer10Spy2(){

        var random = mutableListOf("spy","citizen","citizen","citizen","citizen","citizen","citizen","citizen","citizen","spy")
        random.shuffle()

        player1 = random[0]
        player2 = random[1]
        player3 = random[2]
        player4 = random[3]
        player5 = random[4]
        player6 = random[5]
        player7 = random[6]
        player8 = random[7]
        player9 = random[8]
        player10 = random[9]


    }

    private fun randomPlayer9Spy3(){

        var random = mutableListOf("spy","citizen","citizen","citizen","citizen","citizen","citizen","spy","spy")
        random.shuffle()

        player1 = random[0]
        player2 = random[1]
        player3 = random[2]
        player4 = random[3]
        player5 = random[4]
        player6 = random[5]
        player7 = random[6]
        player8 = random[7]
        player9 = random[8]


    }
    private fun randomPlayer10Spy3(){

        var random = mutableListOf("spy","citizen","citizen","citizen","citizen","citizen","citizen","citizen","spy","spy")
        random.shuffle()

        player1 = random[0]
        player2 = random[1]
        player3 = random[2]
        player4 = random[3]
        player5 = random[4]
        player6 = random[5]
        player7 = random[6]
        player8 = random[7]
        player9 = random[8]
        player10 = random[9]


    }






}