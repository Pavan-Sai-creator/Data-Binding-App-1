package com.example.databindingapp
// https://www.youtube.com/watch?v=9lCIocQ76CI&list=PLRKyZvuMYSIO0jLgj8g6sADnD0IBaWaw2&index=7
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.databindingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.nameTv.text = "Pavan"
    }
}