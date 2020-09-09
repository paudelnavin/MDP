package edu.miu.cs.ecommerce

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_shopping_category.*

class ShoppingCategoryActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_category)
        welcomeUser.text = "welcome ${intent.getStringExtra("username")}"
    }

    fun onClothingClick(view: View) {
        var intent = Intent(applicationContext, ClothingActivity::class.java)
        startActivity(intent)
    }

    fun onElectronicClick(view: View) {
        var intent = Intent(applicationContext, ElectronicActivity::class.java)
        startActivity(intent)
    }
    fun onBeautyClick(view: View) {}
    fun onFoodClick(view: View) {}
}
