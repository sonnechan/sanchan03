package com.egco428.ex03

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_page2.*

class Page2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        val bundle = intent.extras //accept the intent from the previous page

        val username: String
        val myuser: String
        val mypass: String
        username = "username"
        val password: String
        password = "password"



           /* if(bundle != null){
                mytext = bundle.getString("result")
                resultText.setText("Result: $mytext")
                Log.d(result, mytext)
            }*/
            if(bundle !=null){
                myuser = bundle.getString("username")
                mypass = bundle.getString("password")
                if(myuser == "lalita"){
                    if(mypass == "1234"){
                        userresult.setText("username: $myuser")
                        passresult.setText("password: $mypass")
                    }
                }
                else
                finish()



            }

        backBtn.setOnClickListener {
            finish() //close the current activity
        }

    }
}
