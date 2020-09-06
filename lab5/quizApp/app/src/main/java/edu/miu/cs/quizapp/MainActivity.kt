package edu.miu.cs.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onResetClick(view : View) {
        radioGroup.clearCheck()

        if(checkBox.isChecked) {
            checkBox.isChecked = false
        }
        if(checkBox2.isChecked) {
            checkBox2.isChecked = false
        }
        if(checkBox3.isChecked) {
            checkBox3.isChecked = false
        }
        if(checkBox4.isChecked) {
            checkBox4.isChecked = false
        }
    }

    fun onSubmitClick(view : View) {
        var score = 0

        if(radioButton3.isChecked) {
            score += 50;
        }

        if((checkBox.isChecked) && (checkBox3.isChecked) && !(checkBox2.isChecked) && !(checkBox4.isChecked)) {
            score += 50
        }

        var message = ""

        if(score == 0) {
            message = "Oops! Keep studying Kotlin."
        }
        else if (score == 50) {
            message = "Not bad! You need little more attention."
        }
        else {
            message = "Congratulations! You got it."
        }

        var currentTime = Calendar.getInstance().getTime()


        // 1. Create an object for AlertDialog by passing the current context object
        val builder = AlertDialog.Builder(this@MainActivity)

        // 2. Set the basic information for the builder object
        builder.setTitle("Quiz Result")
        builder.setMessage("$message \nYou achieved $score% \n"+
                "Submitted on $currentTime \n")

        builder.setNeutralButton("Okay"){ dialogInterface, which ->
        }

        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    fun onCloseClick(view: View) {
        finish()
//        System.exit(0)
    }
}