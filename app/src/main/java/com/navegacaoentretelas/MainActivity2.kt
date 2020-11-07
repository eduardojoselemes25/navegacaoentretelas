package com.example.navegacao_entre_telas

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val intent = intent
        val valor1 = intent.getStringExtra("nome")

        val mySharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)

        val valor2 = mySharedPref.getString("valor2","valor vazio")
        campo.text = valor1
        campo2.text = valor2
    }
}