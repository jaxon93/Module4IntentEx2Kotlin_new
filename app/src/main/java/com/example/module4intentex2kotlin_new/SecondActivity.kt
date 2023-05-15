package com.example.module4intentex2kotlin_new

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initView()
    }

    private fun initView() {
        var tv_second = findViewById<TextView>(R.id.tv_second)

        var user = intent.getSerializableExtra("user")
        tv_second.text = user.toString()
    }
}