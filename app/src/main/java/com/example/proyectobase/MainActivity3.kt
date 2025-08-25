package com.example.proyectobase

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)

        val edNombre: EditText = findViewById(R.id.ed_nombre3)
        val edPassword: EditText = findViewById(R.id.ed_pass3)
        val edDate: EditText = findViewById(R.id.ed_date3)

        val btnGuardar: Button = findViewById(R.id.btn_guardar)



        btnGuardar.setOnClickListener {
            val nombre = edNombre.text.toString()
            val password = edPassword.text.toString()
            val fecha = edDate.text.toString()

            Toast.makeText(
                this,
                "Nombre: $nombre\nContraseña: $password\nFecha: $fecha",
                Toast.LENGTH_SHORT
            ).show()
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}