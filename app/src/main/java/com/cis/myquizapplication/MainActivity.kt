package com.cis.myquizapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.buttonadun
import kotlinx.android.synthetic.main.activity_main.buttonguy
import kotlinx.android.synthetic.main.activity_main.buttonjames
import kotlinx.android.synthetic.main.activity_main.buttonjunior
import kotlinx.android.synthetic.main.activity_main.buttonmark
import kotlinx.android.synthetic.main.activity_main.buttonoil

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonoil.setOnClickListener{
            val i = Intent(this,Main2Activity::class.java)
            startActivity(i)
        }

        buttonadun.setOnClickListener{
            val i = Intent(this,Main2Activity::class.java)
            startActivity(i)
        }

        buttonjames.setOnClickListener{
            val i = Intent(this,Main2Activity::class.java)
            startActivity(i)
        }

        buttonmark.setOnClickListener{
            val i = Intent(this,Main2Activity::class.java)
            startActivity(i)
        }

        buttonguy.setOnClickListener{
            val i = Intent(this,Main2Activity::class.java)
            startActivity(i)
        }

        buttonjunior.setOnClickListener{
            val i = Intent(this,Main2Activity::class.java)
            startActivity(i)
        }
    }

}
