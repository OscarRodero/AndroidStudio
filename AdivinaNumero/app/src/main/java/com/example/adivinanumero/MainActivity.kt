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


        //Variables
        var numero:Int = (1..100).random()
        var numeroJugador:Int=0
        var intentos:Int=0

        //Barra Progreso
        binding.progressBar.max=5
        binding.progressBar.progress=0

        //Boton Comprobar
        binding.btnComprobar.setOnClickListener {
            if(!binding.etnNumero.text.isEmpty()){
                numeroJugador=Integer.parseInt(binding.etnNumero.text.toString())
                if(numero==numeroJugador){
                    finPartida(true)
                }else{
                    if(!binding.chkIntentos.isChecked){
                        intentos++
                        //binding.BarraIntentos
                    }
                    if(intentos == 5){
                        finPartida(false)
                        binding.btnComprobar.isEnabled=false
                        binding.btnVolverAJugar.isEnabled=true
                    }else{
                        if(!binding.chkPistas.isChecked){
                            comprobarNumero(numeroJugador,numero)
                            binding.progressBar.progress++
                        }else{
                            Toast.makeText(this,"Intento gastado", Toast.LENGTH_LONG).show()
                        }
                    }
                }
            }

        }
        //Boton Volver a jugar
        binding.btnVolverAJugar.setOnClickListener {
            binding.btnComprobar.isEnabled=true
            binding.btnVolverAJugar.isEnabled=false
            intentos=0
            numeroJugador=0
            binding.progressBar.progress=0
            numero=(1..100).random()
        }
    }

    private fun comprobarNumero(x: Int, numero: Int) {
        if(numero<x){
            binding.imageView.setImageResource(R.drawable.flechaabajo)
        }else{
            binding.imageView.setImageResource(R.drawable.flechaarriba)
        }
    }


    private fun finPartida(b: Boolean) {
        if(b) {
            Toast.makeText(this, "¡Felicidades, has acertado!", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this,"Has llegado al máximo de intentos. Lo sentimos.",Toast.LENGTH_SHORT).show()
        }
    }

}