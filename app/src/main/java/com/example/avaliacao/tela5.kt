package com.example.avaliacao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class tela5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela5)
    }
    fun abrirNovaActivity(view: View) {
        val intent = Intent(this, tela6::class.java)
        startActivity(intent)
    }


}