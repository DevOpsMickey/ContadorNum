package com.example.contadornum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ventana__descripcion.*

class Ventana_Descripcion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventana__descripcion)

        btnRegresar.setOnClickListener{
            val atras = Intent(this, MainActivity::class.java)
            startActivity(atras)
        }
    }
}