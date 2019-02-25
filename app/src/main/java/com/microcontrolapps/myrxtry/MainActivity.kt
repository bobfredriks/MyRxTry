package com.microcontrolapps.myrxtry

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,"startup",Toast.LENGTH_LONG).show()

val MyNewCar = Vehicals("blue","Chevy","Camaro")
        val adfa = MyNewCar.mcolor

        }
    }


