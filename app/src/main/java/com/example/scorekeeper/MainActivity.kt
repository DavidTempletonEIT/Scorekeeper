package com.example.scorekeeper

import android.R
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.lang.String


class MainActivity : AppCompatActivity() {
    private var mScore1 = 0
    private var mScore2 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mScore.text = findViewById(R.id.score_1)
        mScore2 = findViewById(R.id.score_2)
    }
    fun decreaseScore(view: View) {
        // Get the ID of the button that was clicked
        when (view.id) {
            R.id.decreaseTeam1 -> {
                //Decrement the score and update the TextView
                mScore1--
                mScoreText1.setText(String.valueOf(mScore1))
            }
            R.id.decreaseTeam2 -> {
                //Decrement the score and update the TextView
                mScore2--
                mScoreText2.setText(String.valueOf(mScore2))
            }
        }
    }

    /**
     * Method that handles the onClick of both the increment buttons
     * @param view The button view that was clicked
     */
    fun increaseScore(view: View) {
        //Get the ID of the button that was clicked

        when (view.id) {
            R.id.increaseTeam1 -> {
                //Increment the score and update the TextView
                mScore1++
                mScoreText1.setText(String.valueOf(mScore1))
            }
            R.id.increaseTeam2 -> {
                //Increment the score and update the TextView
                mScore2++
                mScoreText2.setText(String.valueOf(mScore2))
            }
        }
    }
}
