package com.example.encuesta

import android.os.Bundle
import android.widget.CompoundButton
import androidx.appcompat.app.AppCompatActivity
import com.example.encuesta.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //variables
        //Switch
        if(binding.switchAnonimo.isActivated){
            binding.PTNombre.isEnabled=false
        }else{
            binding.PTNombre.isEnabled=true
        }
        //binding.switchAnonimo.setOnCheckedChangeListener()
    }
}