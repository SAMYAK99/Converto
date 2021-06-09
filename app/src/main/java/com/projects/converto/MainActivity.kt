package com.projects.converto


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.projects.converto.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    private  lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Setting Up View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }


}