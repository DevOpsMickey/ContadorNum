package com.example.contadornum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        var contadorNum = 0

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSumar.setOnClickListener {
            contadorNum++
            txtNum.text = contadorNum.toString()
        }
        btnRestar.setOnClickListener {
            contadorNum--
            txtNum.text = contadorNum.toString()
        }

        btnAbrirVentana.setOnClickListener{
            val abrirVentana = Intent(this, Ventana_Descripcion::class.java);
            startActivity(abrirVentana)
        }

    }


}