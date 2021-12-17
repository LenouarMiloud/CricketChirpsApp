package com.fsociety.cricketchirpsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    var chirp:Int?= 0
    var temp:Double?=0.0
    val format = DecimalFormat("#0.00")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculateButton.setOnClickListener(View.OnClickListener {
            if(EditTextTemperature.text.toString().isEmpty()){
                Toast.makeText(this,"please enter all fields",Toast.LENGTH_LONG).show()
            }else{
                chirp = Integer.parseInt(EditTextTemperature.text.toString())
                temp = (chirp!! / 3.0 ) +4
                resultText.text = "the approximate temperature outside is ${format.format(temp)} degrees Celsius"

            }
        })



    }
}