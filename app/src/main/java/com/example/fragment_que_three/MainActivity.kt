package com.example.fragment_que_three

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import androidx.fragment.app.DialogFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn= findViewById<Button>(R.id.btn_dialog)
        btn.setOnClickListener(){

            val newFragment: Dialog_Frag = Dialog_Frag()
            newFragment.show(supportFragmentManager.beginTransaction(),"");

        }

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame, MySettingsFragment())
            .commit()
    }


}