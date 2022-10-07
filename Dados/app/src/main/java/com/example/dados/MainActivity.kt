package com.example.dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var BotonLanzar:Button
    lateinit var BotonJugarDeNuevo:Button
    lateinit var ptosJugador:TextView
    lateinit var ptosPC:TextView
    lateinit var ptsPlayer:TextView
    lateinit var ptsPC:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.BotonLanzar=findViewById(R.id.btn_lanzarDados)
        this.BotonJugarDeNuevo=findViewById(R.id.btn_VolverAJugar)
        this.ptosJugador=findViewById(R.id.txt_ptosPlayer)
        this.ptosPC=findViewById(R.id.txt_ptosPc)
        this.ptsPlayer=findViewById(R.id.txt_ptsPlayer)
    }
}