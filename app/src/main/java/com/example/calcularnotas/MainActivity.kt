package com.example.calcularnotas

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        
        var botao = findViewById<Button>(R.id.btn_Calcular);
        botao.setOnClickListener { 
            val nota1 = findViewById<EditText>(R.id.edt_Nota1);
            val valorNota1 = nota1.getText().toString().toDoubleOrNull()?:0.0;
            val nota2 = findViewById<EditText>(R.id.edt_Nota2);
            val valorNota2 = nota2.getText().toString().toDoubleOrNull()?:0.0;
            val nota3 = findViewById<EditText>(R.id.edt_Nota3);
            val valorNota3 = nota3.getText().toString().toDoubleOrNull()?:0.0;
            var resultado = (valorNota1+valorNota2+valorNota3)/3
            Toast.makeText(this, "Valor da media: ${resultado}", Toast.LENGTH_SHORT).show()
        }
    }
}
