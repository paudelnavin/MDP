package edu.miu.cs.tablelayout

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TableRow
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickAdd(view: View) {
        // Create a new table row.
        val tableRow = TableRow(getApplicationContext())
        // Set new table row layout parameters.
        val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
        //Set gap between different row
        tableRow.setPadding(tableRow.paddingLeft,28, tableRow.paddingRight, tableRow.paddingBottom)
        //
        tableRow.layoutParams = layoutParams
        var versionNewText = TextView(this)
        versionNewText.setText(et1.text)
        versionNewText.setBackgroundColor(Color.parseColor("#C73355"))
        var codenameNewText = TextView(this)
        codenameNewText.setText("|${et2.text}")
        codenameNewText.setBackgroundColor(Color.parseColor("#C73355"))
        // add values into row by calling addView()
        tableRow.addView(versionNewText)
        tableRow.addView(codenameNewText)
        // Finally add the created row row into layout
        tableLayout.addView(tableRow)
    }
}