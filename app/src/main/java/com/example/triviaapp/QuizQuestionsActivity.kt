package com.example.triviaapp
import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class QuizQuestionsActivity : AppCompatActivity() {
    private var ct=0
    private var optionIndex=0
    private var score=0
    private var click=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

       //declaring ids
        val finish=findViewById<Button>(R.id.finish)
        val LinearLayout=findViewById<LinearLayout>(R.id.mainLinear)
        val questionBox=findViewById<TextView>(R.id.question_box)
        val questionsList = Constants.getQuestions()
        val submit=findViewById<Button>(R.id.submit)
        val next=findViewById<Button>(R.id.next)
        val option1=findViewById<TextView>(R.id.option_1)
        val option2=findViewById<TextView>(R.id.option_2)
        val option3=findViewById<TextView>(R.id.option_3)
        val option4=findViewById<TextView>(R.id.option_4)
//        val finalBackground= getDrawable(R.drawable.pxfuel__2_)
//        val LinearLayout2=findViewById<LinearLayout>(R.id.secondLinear)
        val textReplace=findViewById<TextView>(R.id.textReplace)
        questionBox.text=getString(R.string.click_start_to_begin_the_quiz)
        next.setOnClickListener{
            setDefault()
            if(ct<questionsList.size) {
                questionBox.text = questionsList[ct].question
                option1.text = questionsList[ct].optionOne
                option2.text = questionsList[ct].optionTwo
                option3.text = questionsList[ct].optionThree
                option4.text = questionsList[ct].optionFour
                ct++
            }
            else if(ct==questionsList.size){
                textReplace.text="You scored ${score}"
            }
        }
        finish.setOnClickListener{
            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
            finish()
        }
        checkOption()
    submit.setOnClickListener{

        if(optionIndex==questionsList[ct-1].correctAns){
            showCorrect()
            score++
        }

        else{
            showIncorrect()
            showCorrect()
        }
    }



}

    private fun setDefault(){
        optionIndex=0
        val option1=findViewById<TextView>(R.id.option_1)
        val option2=findViewById<TextView>(R.id.option_2)
        val option3=findViewById<TextView>(R.id.option_3)
        val option4=findViewById<TextView>(R.id.option_4)
        option1.background=getDrawable(R.drawable.textborder)
        option2.background=getDrawable(R.drawable.textborder)
        option3.background=getDrawable(R.drawable.textborder)
        option4.background=getDrawable(R.drawable.textborder)
    }

    private fun showCorrect(){
        val option1=findViewById<TextView>(R.id.option_1)
        val option2=findViewById<TextView>(R.id.option_2)
        val option3=findViewById<TextView>(R.id.option_3)
        val option4=findViewById<TextView>(R.id.option_4)
        val questionsList = Constants.getQuestions()
            when(questionsList[ct-1].correctAns){
                1->{option1.background=getDrawable(R.drawable.optioncorrect)
                }
                2->{
                    option2.background=getDrawable(R.drawable.optioncorrect)
                }

                3->{
                    option3.background=getDrawable(R.drawable.optioncorrect)
                }

                4->{
                    option4.background=getDrawable(R.drawable.optioncorrect)
                }
            }

        }

    private fun showIncorrect(){
        val option1=findViewById<TextView>(R.id.option_1)
        val option2=findViewById<TextView>(R.id.option_2)
        val option3=findViewById<TextView>(R.id.option_3)
        val option4=findViewById<TextView>(R.id.option_4)
        when(optionIndex){
            1->{option1.background=getDrawable(R.drawable.optionincorrect)
            }
            2->{
                option2.background=getDrawable(R.drawable.optionincorrect)
            }

            3->{
                option3.background=getDrawable(R.drawable.optionincorrect)
            }

            4->{
                option4.background=getDrawable(R.drawable.optionincorrect)
            }


        }
    }

    private fun checkOption(){
        val option1=findViewById<TextView>(R.id.option_1)
        val option2=findViewById<TextView>(R.id.option_2)
        val option3=findViewById<TextView>(R.id.option_3)
        val option4=findViewById<TextView>(R.id.option_4)

        option1.setOnClickListener{
            setDefault()
            option1.background=getDrawable(R.drawable.optionselected)
            optionIndex=1
        }
        option2.setOnClickListener{
            setDefault()
            option2.background=getDrawable(R.drawable.optionselected)
            optionIndex=2
        }
        option3.setOnClickListener{
            setDefault()
            option3.background=getDrawable(R.drawable.optionselected)
            optionIndex=3
        }
        option4.setOnClickListener{
            setDefault()
            option4.background=getDrawable(R.drawable.optionselected)
            optionIndex=4
        }

    }

}


