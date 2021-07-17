package com.aadesh.quizapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.Typeface.*
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.widget.TintableCompoundDrawablesView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_quiz.*


class quiz : AppCompatActivity(), View.OnClickListener {

    var mquestionslist: ArrayList<questions>? = null
    var mselectedoptionpos: Int = 0
    var mcurrentpos: Int = 1
    var correctcount:Int = 0
    var musername:String?=null
    var mtotal:String?=null
    var mcorrect:String?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        musername = intent.getStringExtra(constants.USERNAME)

        mquestionslist = constants.getquestion()
        setquestion()
        tv_option_one.setOnClickListener(this)
        tv_option_two.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)
        submit.setOnClickListener(this)

    }

    fun setquestion() {
        val question = mquestionslist!![mcurrentpos - 1]
        defaultview()
        submit.text="Submit"
        image.setImageResource(question.image)
        progressBar.progress = mcurrentpos
        tv_progress.text = "$mcurrentpos" + "/" + progressBar.max
        question1.text = question!!.question
        tv_option_one.text = question.option1
        tv_option_two.text = question.option2
        tv_option_three.text = question.option3
        tv_option_four.text = question.option4
    }

    private fun defaultview() {
        val options = ArrayList<TextView>()
        options.add(0, tv_option_one)
        options.add(1, tv_option_two)
        options.add(2, tv_option_three)
        options.add(3, tv_option_four)
        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = DEFAULT
            option.background = ContextCompat.getDrawable(this,R.drawable.default_option_border_bg)
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.tv_option_one -> {
                selectedoptionview(tv_option_one, 1)
            }
            R.id.tv_option_two -> {
                selectedoptionview(tv_option_two, 2)
            }
            R.id.tv_option_three -> {
                selectedoptionview(tv_option_three, 3)
            }
            R.id.tv_option_four -> {
                selectedoptionview(tv_option_four, 4)
            }
            R.id.submit -> {
                if (mselectedoptionpos == 0) {
                    mcurrentpos++
                    when {
                        mcurrentpos <= mquestionslist!!.size -> {
                            setquestion()
                        }
                        else -> {
                            val intent = Intent(this, result::class.java)
                            intent.putExtra(constants.USERNAME,musername)
                            intent.putExtra(constants.TOTALQUESTIONS,mquestionslist!!.size)
                            intent.putExtra(constants.CORRECTANSWERS,correctcount)
                            startActivity(intent)
                        }

                    }

                }
                else
                {
                    val question = mquestionslist?.get(mcurrentpos-1)
                    if(question!!.correctanswer!=mselectedoptionpos)
                    {
                        answerview(mselectedoptionpos, R.drawable.wronganswer)
                        answerview(question!!.correctanswer,R.drawable.correctanswer)
                    }
                    else {
                        answerview(question!!.correctanswer, R.drawable.correctanswer)
                        correctcount++
                    }
                    if ( mcurrentpos == mquestionslist!!.size)
                    {
                        submit.text="finish"
                    }
                    else
                    {
                        submit.setText("Go to Next Question")
                    }
                    mselectedoptionpos = 0
                }
            }
        }
    }
    private fun answerview(answer:Int, drawableview:Int)
    {
        when(answer){
            1->{
                tv_option_one.background=ContextCompat.getDrawable(this,drawableview)
            }
            2->{
                tv_option_two.background=ContextCompat.getDrawable(this,drawableview)
            }
            3->{
                tv_option_three.background=ContextCompat.getDrawable(this,drawableview)
            }
            4->{
                tv_option_four.background=ContextCompat.getDrawable(this,drawableview)
            }
        }

    }
    private fun selectedoptionview(tv : TextView, selectedoptionnum:Int )
    {
        defaultview()
        mselectedoptionpos = selectedoptionnum
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.background = ContextCompat.getDrawable(this,R.drawable.selected_option_border_bg)
    }

}
