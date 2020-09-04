package edu.miu.cs.ecommerce

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var userList = ArrayList<User>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            userList.add(User("Navin", "Paudel", "np", "121"))
            userList.add(User("Bishwash", "Mishra", "bm", "122"))
            userList.add(User("Ceaser", "Poudel", "cp", "123"))
            userList.add(User("Anup", "Dhakal", "ad", "124"))
            userList.add(User("Ayush", "Bhattarai", "ab", "125"))
        }

    fun signInClicked(view: View) {
        var isFound = false
        for (user in userList) {
            if (user.username.equals((usernameTextBox.text).toString())) {
                if (user.password.equals((passwordTextBox.text).toString())) {
                    //login succesfull
                    isFound = true
                    val intent = Intent(this, ShoppingCategoryActivity::class.java)
                    intent.putExtra("username", user.username)
                    startActivity(intent)
                }
            }
        }
        if(isFound == false) {
            var toast = Toast.makeText(
                this,
                "Wrong login information given. Correct your email address or password.",
                Toast.LENGTH_SHORT
            )
            toast.setGravity(Gravity.CENTER, 0, 0)
            toast.show()
        }
    }

    fun signUpClicked(view: View) {
        var toast = Toast.makeText(
            this,
            "In next homework we will work about it",
            Toast.LENGTH_SHORT
        )
        toast.setGravity(Gravity.CENTER, 0, 0)
        toast.show()
    }

    fun forgotPasswordClicked(view: View) {
        var toast = Toast.makeText(
            this,
            "In next homework we will work about it",
            Toast.LENGTH_SHORT
        )
        toast.setGravity(Gravity.CENTER, 0, 0)
        toast.show()
    }
}