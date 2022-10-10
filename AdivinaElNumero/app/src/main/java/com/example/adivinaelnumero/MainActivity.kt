package com.example.adivinaelnumero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var BotonComprobar:Button
    lateinit var BotonVolverAJugar:Button
    lateinit var NumeroJugador:EditText
    lateinit var NumeroAdivinar:Number
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.BotonComprobar=findViewById(R.id.btnComprobar)
        this.BotonVolverAJugar=findViewById(R.id.btnVolverAJugar)
        this.NumeroJugador=findViewById(R.id.txtNumber)
        jugar()
    }

    private fun jugar() {
        this.BotonComprobar.isEnabled = true
        this.BotonVolverAJugar.isEnabled = false
        this.NumeroAdivinar = (1..100).random()
    }
    fun Comprobar(v:View){
        if (this.NumeroAdivinar.equals(this.NumeroJugador)){

        }
    }
}