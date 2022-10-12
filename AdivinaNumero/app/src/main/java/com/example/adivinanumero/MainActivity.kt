package com.example.adivinanumero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.adivinanumero.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var numero:Int = (1..100).random()
        binding.btnComprobar.setOnClickListener {
            if(binding.etnNumero.equals(numero.toString())){
                finPartida(true)
            }
        }
    }

    private fun finPartida(b: Boolean) {
        if(b) {
            Toast.makeText(applicationContext, "¡Felicidades, has acertado!", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(applicationContext,"Has llegado al máximo de intentos. Lo sentimos.",Toast.LENGTH_SHORT).show()
        }
    }

}