package com.example.ejercicio5

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btn : Button
    private lateinit var txtRespuesta : TextView
    private lateinit var textoEditable : EditText
    private lateinit var lista : Array<String>
    private lateinit var texto : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtRespuesta = findViewById(R.id.textView_respuesta)
        btn = findViewById(R.id.button_aceptar)
        lista = resources.getStringArray(R.array.respuestas)
        textoEditable = findViewById(R.id.editTextText)

        btn.setOnClickListener {
            texto = if (textoEditable.text.isEmpty()) resources.getString(R.string.no_pregunta)
            else lista.random()
            txtRespuesta.text = texto
        }
    }
}