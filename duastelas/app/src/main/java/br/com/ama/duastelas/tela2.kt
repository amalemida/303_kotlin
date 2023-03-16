package br.com.ama.duastelas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.widget.TextView

class tela2 : AppCompatActivity() {

    //lateinit var btnVoltar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)
        //recebendo valores da tela que chamou

        val string: String? = intent.getStringExtra("Chave")

        val texto = findViewById(R.id.textView2) as TextView
        texto.setText(string)

        val btnVoltar = findViewById(R.id.btnVoltar) as Button
        btnVoltar.setOnClickListener {
            this.finish()
        }

        val btnNext = findViewById(R.id.btnGoTo3) as Button
        btnNext.setOnClickListener {
            val intent = Intent(this, tela3::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
        }
    }
}