package com.example.meuappnativo.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meuappnativo.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)
        setTitle("@Cotatinhos")

        val botao = findViewById<FloatingActionButton>(R.id.fabAdiciona)
        botao.setOnClickListener {
            val intent =Intent(this, CadastroActivity::class.java)
            startActivity(intent)
        }
    }
}