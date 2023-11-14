package com.example.tugasretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugasretrofit.databinding.ActivityMain2Binding
import com.squareup.picasso.Picasso

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val imgTxt = intent.extras?.getString("image")
        val judulTxt = intent.extras?.getString("judul")
        with(binding){
            Picasso.get().load(imgTxt).into(img)
            judul.text = judulTxt
        }
    }
}