package com.example.avaliacao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class area_transferencia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.area_transferencia)
    }
    fun abrirNovaActivity(view: View) {
        val intent = Intent(this, area_transferindo::class.java)
        startActivity(intent)
    }
}