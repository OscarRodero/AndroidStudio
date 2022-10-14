package com.example.juegodados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.juegodados.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.ImagenDadoJugador.setImageResource(R.drawable.dado1)
        binding.ImagenDadoPC.setImageResource(R.drawable.dado1)


        var contador=0
        var ptsJugador:Int=0
        var ptsPC:Int=0
        ajustarPuntos(ptsJugador, ptsPC)
        binding.btnVolverAJugar.isEnabled=false

        binding.btnLanzarDados.setOnClickListener{
            contador=contador+1
            var x = (1..6).random()
            cambiarImagenJugador(x)
            ptsJugador=ptsJugador+x
            x = (1..6).random()
            cambiarImagenPC(x)
            ptsPC=ptsPC+x
            ajustarPuntos(ptsJugador, ptsPC)

            if(contador==5){
                contador=0
                if(ptsJugador>ptsPC){
                    Toast.makeText(this, "Ganador: Jugador", Toast.LENGTH_LONG).show()
                }else if(ptsJugador<ptsPC){
                    Toast.makeText(this, "Ganador: PC", Toast.LENGTH_LONG).show()
                }else{
                    Toast.makeText(this, "Empate", Toast.LENGTH_LONG).show()
                }
                binding.btnVolverAJugar.isEnabled=true
                binding.btnLanzarDados.isEnabled=false
            }
        }

        binding.btnVolverAJugar.setOnClickListener {
            contador=0
            ptsJugador=0
            ptsPC=0
            ajustarPuntos(ptsJugador, ptsPC)
            binding.btnLanzarDados.isEnabled=true
            binding.btnVolverAJugar.isEnabled=false
        }

    }

    private fun ajustarPuntos(ptsJugador: Int, ptsPC: Int) {
        binding.PuntosJugador.setText(ptsJugador.toString())
        binding.puntosPC.setText(ptsPC.toString())
    }


    private fun cambiarImagenPC(x: Int) {
        when (x){
            1-> binding.ImagenDadoPC.setImageResource(R.drawable.dado1)
            2-> binding.ImagenDadoPC.setImageResource(R.drawable.dado2)
            3-> binding.ImagenDadoPC.setImageResource(R.drawable.dado3)
            4-> binding.ImagenDadoPC.setImageResource(R.drawable.dado4)
            5-> binding.ImagenDadoPC.setImageResource(R.drawable.dado5)
            6-> binding.ImagenDadoPC.setImageResource(R.drawable.dado6)
        }
    }

    private fun cambiarImagenJugador(x: Int){
        when (x){
            1-> binding.ImagenDadoJugador.setImageResource(R.drawable.dado1)
            2-> binding.ImagenDadoJugador.setImageResource(R.drawable.dado2)
            3-> binding.ImagenDadoJugador.setImageResource(R.drawable.dado3)
            4-> binding.ImagenDadoJugador.setImageResource(R.drawable.dado4)
            5-> binding.ImagenDadoJugador.setImageResource(R.drawable.dado5)
            6-> binding.ImagenDadoJugador.setImageResource(R.drawable.dado6)
        }
    }
}