package com.aadesh.quizapp
//result activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_result.*

class result : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        var finalname = intent.getStringExtra(constants.USERNAME)
        var finalcorrect = intent.getIntExtra(constants.CORRECTANSWERS,0)
        var finaltotal = intent.getIntExtra(constants.TOTALQUESTIONS,0)

        tv_name.text=finalname
        tv_score.text = "Your Score is $finalcorrect out of $finaltotal"
        btn_finish.setOnClickListener {
          val goback =  Intent(this,MainActivity::class.java)
            startActivity(goback)
        }
    }
}
