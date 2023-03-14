package br.com.ama.duastelas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var btnGoToTela2 : Button

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGoToTela2 = findViewById(R.id.btnGoToTela1)
        btnGoToTela2.setOnClickListener{

            val intent = Intent(this, tela2::class.java)
            startActivity(intent)

        }
    }
}