package com.example.meuappnativo.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.meuappnativo.R

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)
        setTitle("Novo Contato")

        val intent = intent()
        intent.getCharsequenceExtra("id")

        val botao = findViewById<Button>(R.id.btnCancelar)
        botao.setOnClickListener{
            finish()
        }
    }
}