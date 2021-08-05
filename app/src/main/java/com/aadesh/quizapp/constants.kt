package com.aadesh.quizapp

import java.util.ArrayList

object constants
{
    const val USERNAME:String ="username"
    const val TOTALQUESTIONS:String ="totalquestions"
    const val CORRECTANSWERS:String ="correctanswers"

    fun getquestion(): ArrayList<questions>{
        val questionlist = ArrayList<questions>()

        val question1 = questions(1,"The correct sequence of reproductive stages seen in flowering plants is",R.drawable.rbiology,
            "gametes, zygote, embryo, seedling", "zygote, gametes, embryo, seedling","seedling, embryo, zygote, gametes","gametes, embryo, zygote, seedling",1)
        questionlist.add(question1)

        val question2 = questions(2,"Keeping the potential difference constant, the resistance of the circuit is halved. The current will become:",R.drawable.rcircuit,
            "One-fourth", "four times","half","double",4)
        questionlist.add(question2)

        val question3 = questions(3,"It is necessary to balance a chemical equation in order to satisfy the law of:",R.drawable.rchem,
            "Conservation of motion", "Conservation of momentum","Conservation of energy","Conservation of mass",4)
        questionlist.add(question3)

        val question4 = questions(4,"In human males, the testes lie in the scrotum, because it helps in the",R.drawable.rbiology,
            "process of mating", "formation of sperm","easy transfer of gametes","all of these",2)
        questionlist.add(question4)

        val question5 = questions(5,"Two electric bulbs have resistances in the ratio 1:2. If they are joined in series, the energy consumed in them is in the ratio.",R.drawable.rcircuit,
            "2:1", "1:2","4:1","1:4",2)
        questionlist.add(question5)

        val question6 = questions(6,"Which of the following gases is used in the storage of fat and oil containing foods for a long time?",R.drawable.rbiology,
            "Carbondioxide gas", "Nitrogen gas","Oxygen gas","Neon gas",2)
        questionlist.add(question6)

        val question7 = questions(7,"Reproduction is essential for living organisms in order to",R.drawable.rbiology,
            "keep the individual organism alive", "fulfill their energy requirement","maintain growth","continue the species generation after generation",4)
        questionlist.add(question7)

        val question8 = questions(8,"If length of a conductor and it's radius is increased twice, how the resistance will change?",R.drawable.rcircuit,
            "Resistance will remain unchanged", "Resistance increase twice","Resistance will become half","Resistance will increase 4 times",3)
        questionlist.add(question8)

        val question9 = questions(9,"Name the gas that is evolved by the reaction of Zinc and Dilute Sulphuric Acid?",R.drawable.rchem,
            "Hydrogen", "Carbondioxide","Magnesium Oxide","None of these",1)
        questionlist.add(question9)

        val question10 = questions(10,"The process of transfer of pollen grains from the anther to the stigma of same flower or another flower of the same plant is called?",R.drawable.rbiology,
            "Fission", "Fertilization","Fragmentation","None of these",4)
        questionlist.add(question10)

        val question11 = questions(11,"The filament of bulb is made of which of the following materials?",R.drawable.rcircuit,
            "Gold", "Silver","Platinum","Tungsten",4)
        questionlist.add(question11)

        val question12 = questions(12,"The chemical reaction between sulphuric acid and barium chloride solution is characterised by the formation of?",R.drawable.rchem,
            "barium chlorite", "hydrochloric acid","sulphuric acid","Barium sulphate",4)
        questionlist.add(question12)

        val question13 = questions(13,"A feature of reproduction that is common to Amoeba, Yeast and Spirogyra is that",R.drawable.rbiology,
            "they reproduce asexually", "they are all unicellular","they are all multicellular","they reproduce only sexually",1)
        questionlist.add(question13)

        val question14 = questions(14," Two devices are connected between two points say A and B in parallel. The physical quantity that will remain the same between the two points is",R.drawable.rcircuit,
            "Current", "Voltage","resistance","None of these",2)
        questionlist.add(question14)

        val question15 = questions(15," Oxidation is a process which involves",R.drawable.rchem,
            "addition of oxygen", "addition of hydrogen","removal of oxygen","removal of hydrogen",1)
        questionlist.add(question15)

        val question16 = questions(16,"The process of the division of cell into several cells during reproduction in Plasmodium is termed as:",R.drawable.rbiology,
            "Current", "Voltage","resistance","None of these",3)
        questionlist.add(question16)

        val question17 = questions(17,"Electrical resistivity of a given metallic wire depends upon",R.drawable.rcircuit,
            "Length", "Thickness","Nature of the Material","Shape",3)
        questionlist.add(question17)


        return questionlist
    }

}