package com.aadesh.quizapp

import java.util.ArrayList

object constants
{
    const val USERNAME:String ="username"
    const val TOTALQUESTIONS:String ="totalquestions"
    const val CORRECTANSWERS:String ="correctanswers"


    fun getquestion(): ArrayList<questions>{
        val questionlist = ArrayList<questions>()
        val question1 = questions(1,"What Country does this flag belong to",R.drawable.ic_flag_of_india,
            "Argentina", "Australia","India","Japan",3)
        questionlist.add(question1)
        val question2 = questions(2,"What Country does this flag belong to",R.drawable.ic_flag_of_argentina,
            "Maldives", "New Zealand","Bhutan","Japan",1)
        questionlist.add(question2)
        val question3 = questions(3,"What Country does this flag belong to",R.drawable.ic_flag_of_australia,
            "Armenia", "Australia","Canada","Japan",2)
        questionlist.add(question3)
        val question4 = questions(4,"What Country does this flag belong to",R.drawable.ic_flag_of_belgium,
            "Mexico", "Australia","Belgium","Japan",3)
        questionlist.add(question4)
        val question5 = questions(5,"What Country does this flag belong to",R.drawable.ic_flag_of_brazil,
            "China", "Australia","Brazil","Japan",3)
        questionlist.add(question5)
        val question6 = questions(6,"What Country does this flag belong to",R.drawable.ic_flag_of_denmark,
            "Malaysia", "Sri Lanka","Russia","Denmark",4)
        questionlist.add(question6)
        val question7 = questions(7,"What Country does this flag belong to",R.drawable.ic_flag_of_fiji,
            "Fiji", "Madagascar","Nigeria","Japan",1)
        questionlist.add(question7)
        val question8 = questions(8,"What Country does this flag belong to",R.drawable.ic_flag_of_germany,
            "Italy", "Germany","Nepal","France",2)
        questionlist.add(question8)
        return questionlist
    }

}