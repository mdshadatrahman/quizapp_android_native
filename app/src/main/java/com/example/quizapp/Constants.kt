package com.example.quizapp

object Constants {
    fun getQuestion(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Denmark",
            "Bangladesh",
            "India",
            1,
        )
        questionsList.add(que1)

        val que2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Brazil",
            "Denmark",
            "Bangladesh",
            "India",
            1,
        )
        questionsList.add(que2)

        val que3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Denmark",
            "Australia",
            "Bangladesh",
            "India",
            1,
        )
        questionsList.add(que3)

        return  questionsList
    }
}