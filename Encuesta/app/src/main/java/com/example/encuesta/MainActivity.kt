package com.example.encuesta
import com.example.encuesta.Resumen
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
        var TextoImprimir:String
        var Encuestas:ArrayList<Resumen>
        //Switch
        if(binding.switchAnonimo.isActivated){
            binding.PTNombre.isEnabled=false
        }else{
            binding.PTNombre.isEnabled=true
        }
        //binding.switchAnonimo.setOnCheckedChangeListener()
        //Boton Validar
        binding.btnValidar.setOnClickListener {
            if(binding.rgSO.checkedRadioButtonId.equals("") && comprobarSistema()==false){

            }
        }
        //Boton Resumen
        binding.btnResumen.setOnClickListener {

        }
    }

    private fun comprobarSistema():Boolean {
        var devolver:Boolean=true
        if (binding.chkASIR.isChecked==false && binding.chkDAM.isChecked==false && binding.chkDAW.isChecked==false){
            devolver = false
        }
        return devolver
    }
}