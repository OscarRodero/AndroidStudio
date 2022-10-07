package com.example.balance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Switch

class MainActivity : AppCompatActivity() {
    lateinit var switchBuenasNotas : Switch
    lateinit var switchJugarVideojuegos : Switch
    lateinit var switchDescansoApropiado : Switch
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.switchBuenasNotas=findViewById(R.id.switchBuenasNotas)
        this.switchJugarVideojuegos=findViewById(R.id.switchJugarVideojuegos)
        this.switchDescansoApropiado=findViewById(R.id.switchDescansoApropiado)
    }
    fun cambiarBuenasNotas(v: View){
        if(switchJugarVideojuegos.isChecked && switchDescansoApropiado.isChecked){
            switchJugarVideojuegos.isChecked=false
            switchBuenasNotas.isChecked=true
        }else{
            switchBuenasNotas.isChecked=true
        }
    }
    fun cambiarJugarVideojuegos(v: View){
        if(switchBuenasNotas.isChecked && switchDescansoApropiado.isChecked){
            switchDescansoApropiado.isChecked=false
            switchJugarVideojuegos.isChecked=true
        }else{
            switchJugarVideojuegos.isChecked=true
        }
    }
    fun cambiarDescansoApropiado(v: View){
        if(switchBuenasNotas.isChecked && switchJugarVideojuegos.isChecked){
            switchBuenasNotas.isChecked=false
            switchDescansoApropiado.isChecked=true
        }else{
            switchDescansoApropiado.isChecked=true
        }
    }
}