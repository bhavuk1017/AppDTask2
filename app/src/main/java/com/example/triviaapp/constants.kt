package com.example.triviaapp

object Constants {
    fun getQuestions():ArrayList<Question>{
        val qList=ArrayList<Question>()
        val q1= Question(id = 1, question = "What is the capital of India?", optionOne = "Delhi", optionTwo = "Pakistan", optionThree="Bhutan", correctAns = 1)
        qList.add(q1)
        val q2= Question(id = 2, question = "What is the capital of Guwahati?", optionOne = "Delhi", optionTwo = "Pakistan", optionThree="Bhutan", correctAns = 2)
        qList.add(q2)
        val q3= Question(id = 3, question = "What is the capital of Australia?", optionOne = "Sydney", optionTwo = "London", optionThree="Melbourne", correctAns = 3)
        qList.add(q3)
        val q4= Question(id = 4, question = "What is the capital of USA?", optionOne = "Washington", optionTwo = "Pakistan", optionThree="Bhutan", correctAns = 1)
        qList.add(q4)
        val q5= Question(id = 5, question = "What is the capital of Pakistan?", optionOne = "Islamabad", optionTwo = "Pakistan", optionThree="Bhutan", correctAns = 1)
        qList.add(q5)
        val q6= Question(id = 6, question = "What is the capital of Ukraine?", optionOne = "Delhi", optionTwo = "Russia", optionThree="Bhutan", correctAns = 2)
        qList.add(q6)
        val q7= Question(id = 7, question = "What is the capital of Russia?", optionOne = "Delhi", optionTwo = "Pakistan", optionThree="Ukraine", correctAns = 3)
        qList.add(q7)
        val q8= Question(id = 8, question = "What is the capital of Bhutan?", optionOne = "Thimphu", optionTwo = "Pakistan", optionThree="Bhutan", correctAns = 1)
        qList.add(q8)
        val q9= Question(id = 9, question = "What is the capital of Assam?", optionOne = "Delhi", optionTwo = "Guwahati", optionThree="Bhutan", correctAns = 2)
        qList.add(q9)
        val q10= Question(id = 10, question = "What is the capital of IIT Guwahati?", optionOne = "New Sac", optionTwo = "Brahma", optionThree="Bhutan", correctAns = 2)
        qList.add(q10)









        return qList
    }



}