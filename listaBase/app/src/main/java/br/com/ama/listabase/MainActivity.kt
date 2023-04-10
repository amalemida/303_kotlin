package br.com.ama.listabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayAdapter : ArrayAdapter<*>
        var usuarios = arrayOf("São Paulo", "Minas Gerais", "Rio de Janeiro", "Paraná",
                                "Espírio Santo", "Bahia").sorted()

        //acessa a lista apartir de um arquivo xml

      var mListView = findViewById<ListView>(R.id.userList)

       // cria o adapter
      arrayAdapter = ArrayAdapter(this,
                android.R.layout.simple_list_item_1, usuarios)
      mListView.adapter = arrayAdapter

    }
}