package com.example.triviaapp

data class Question(
val id: Int,
val question:String,
val optionOne:String,
val optionTwo:String,
val optionThree:String,
val optionFour:String= "None of the above",
val correctAns:Int

)