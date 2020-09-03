package edu.miu.cs.ecommerce

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun forgotPasswordClicked(view: View) {
        var toast = Toast.makeText(
            this,
            "In next hoework we will work about it",
            Toast.LENGTH_SHORT
        )
        toast.setGravity(Gravity.CENTER, 0, 0)
        toast.show()
    }

    fun signInClicked(view: View) {
        var toast = Toast.makeText(
            this,
            "In next hoework we will work about it",
            Toast.LENGTH_SHORT
        )
        toast.setGravity(Gravity.CENTER, 0, 0)
        toast.show()
    }

    fun signUpClicked(view: View) {
        var toast = Toast.makeText(
            this,
            "In next hoework we will work about it",
            Toast.LENGTH_SHORT
        )
        toast.setGravity(Gravity.CENTER, 0, 0)
        toast.show()
    }
}