package com.example.avaliacao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class area_transferindo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.area_transferindo)
    }
    fun abrirNovaActivity(view: View) {
        val intent = Intent(this, tela5::class.java)
        startActivity(intent)
    }
}