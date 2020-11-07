package com.example.navegacao_entre_telas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun navegar(view: View) {
        val valor1 = entrada1.text.toString()
        val valor2 = entrada2.text.toString()
        val intent = Intent(this, MainActivity2::class.java)
        val sharedPref = getSharedPreferences("myPref",0)

        val editor = sharedPref.edit()
        editor.putString("valor2", valor2)
        editor.apply()


        intent.putExtra("nome", valor1)
        startActivity(intent)
    }
}