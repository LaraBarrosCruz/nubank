package com.example.avaliacao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class tela7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela7)
    }
    fun abrirNovaActivity(view: View) {
        val intent = Intent(this, tela8::class.java)
        startActivity(intent)
    }


}