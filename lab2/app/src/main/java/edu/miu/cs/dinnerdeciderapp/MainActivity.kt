package edu.miu.cs.dinnerdeciderapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var list = mutableListOf<String>("Hamburger", "Pizza", "Mexican", "American", "Chinese")

    fun clickAdd(view: View){
        var newString: String? = ""
        btnAdd.setOnClickListener {
            newString = name.text.toString()
            list.add(newString!!)
        }
    }

    fun clickDecide(view: View) {
        var randomList:String? = ""
        btnDecide.setOnClickListener {
            randomList = list.random()
            txtView1.text = randomList
        }
    }
}
