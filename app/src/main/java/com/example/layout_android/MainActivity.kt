package com.example.layout_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layout_android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // binding digunnakan sehingga tanpa harus mencari lagi id yang ingin di panggil
        binding.buttonLinear.setOnClickListener{
            startActivity(Intent(this,SecondaryActivity::class.java),)
        }
    }
}