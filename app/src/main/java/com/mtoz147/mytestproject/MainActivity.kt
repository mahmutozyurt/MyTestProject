package com.mtoz147.mytestproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mylist= arrayListOf(10,20,30)
        for (num in mylist){
            println(num)
        }
        println("test")
    }
}