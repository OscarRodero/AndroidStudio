package com.example.actividad4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnSumar:Button
    lateinit var btnRestar:Button
    lateinit var btnMultiplicar:Button
    lateinit var btnDividir:Button
    lateinit var Numero1:EditText
    lateinit var Numero2:EditText
    lateinit var Resul:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.btnSumar=findViewById(R.id.btnSumar)
        this.btnRestar=findViewById(R.id.btnRestar)
        this.btnMultiplicar=findViewById(R.id.btnMultiplicar)
        this.btnDividir=findViewById(R.id.btnDividir)

        this.Numero1 = findViewById(R.id.TB_PrimerNumero)
        this.Numero2 = findViewById(R.id.TB_SegundoNumero)

        this.Resul = findViewById(R.id.txtResultado)
    }
    fun Sumar(v:View){
        var x = Numero1.text.toString().toDouble()
        var y = Numero2.text.toString().toDouble()
        var z = x+y
        this.Resul.setText(z.toString())
    }
    fun Restar(v:View){
        var x = Numero1.text.toString().toDouble()
        var y = Numero2.text.toString().toDouble()
        var z = x-y
        this.Resul.setText(z.toString())
    }
    fun Multiplicar(v:View){
        var x = Numero1.text.toString().toDouble()
        var y = Numero2.text.toString().toDouble()
        var z = x*y
        this.Resul.setText(z.toString())
    }
    fun Dividir(v:View){
        var x:Double = Numero1.text.toString().toDouble()
        var y:Double = Numero2.text.toString().toDouble()
        var z:Double = 0.0
        if(y!=0.0){
            z = x/y
            this.Resul.setText(z.toString())
        }else{
            this.Resul.setText("No se puede dividir entre 0")
        }
    }
}