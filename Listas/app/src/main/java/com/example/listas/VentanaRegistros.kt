package com.example.listas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listas.databinding.ActivityVentanaRegistrosBinding

class VentanaRegistros : AppCompatActivity() {
    lateinit var binding: ActivityVentanaRegistrosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_ventana_registros)
        binding = ActivityVentanaRegistrosBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}