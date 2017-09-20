package com.egco428.ex03

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Activity1", "onCreate" ) //alt+enter to import automatically

        loginBtn.setOnClickListener {
            var intent = Intent(this, Page2Activity::class.java)
            intent.putExtra("username",username.text.toString()) //send the message to the 2nd page
            //<key,value>
            intent.putExtra("password",password.text.toString())
            startActivity(intent)
        }

        cancelBtn.setOnClickListener {
            username.setText("")
            password.setText("")
        }
    }
    override fun onResume(){
        super.onResume()
        Log.d("Activity1","onResume")
    }

    override fun onPause(){
        super.onPause()
        Log.d("Activity1","onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Activity1","onDestroy")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Activity1","onStop")
    }

}
