package com.example.module4intentex2kotlin_new

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.module4intentex2kotlin_new.modul.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        var  b_open_second = findViewById<Button>(R.id.b_open_second)
        b_open_second.setOnClickListener() {
            var user = User(21, "JAKHONGIR")
            openSecondActivity(user)
        }
    }

    private fun openSecondActivity(user: User) {
        var intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("user", user)
        startActivity(intent)
    }
}