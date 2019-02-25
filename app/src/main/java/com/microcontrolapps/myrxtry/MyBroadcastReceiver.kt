package com.microcontrolapps.myrxtry

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyBroadcastReceiver : BroadcastReceiver () {

    override fun onReceive(context: Context?, intent: Intent?) {

         Toast.makeText( context?.applicationContext,  "got it",Toast.LENGTH_LONG).show()

    }

}
