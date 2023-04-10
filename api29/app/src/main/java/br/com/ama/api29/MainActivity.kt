package br.com.ama.api29

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val laucher = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()){ result ->
            Log.d("Teste", "Retorno")
            Log.d("Teste", result.resultCode.toString())
            if(result.resultCode == Activity.RESULT_OK){
                val bundle: Bundle? = result.data?.extras

                val txt = findViewById(R.id.textView) as TextView
                val msg = data?.getStringExtra("ActivityResult")
                txt.setText(msg)
            }
        }

        val btnNext = findViewById(R.id.btnGetValor) as Button
        btnNext.setOnClickListener{
            val intent = Intent(this, TelaValores::class.java)
            laucher.launch(intent)
        }
    }

}