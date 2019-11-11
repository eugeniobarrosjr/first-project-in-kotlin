package tech.eugeniobarros.firstprojectinkotlin

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @SuppressLint("SetTextI18n")
    fun onClick(view: View) {
        val text = findViewById<TextView>(R.id.exhibitionTxt)
        text.text = "The button has Clicked"
    }
}
