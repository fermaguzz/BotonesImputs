package edu.iest.botoneseimputs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var etCalificacion: EditText
    private lateinit var btnEnviar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etCalificacion = findViewById(R.id.et_calificacion)
        btnEnviar = findViewById(R.id.btn_enviar)

        btnEnviar.setOnClickListener {
            val calificacion = etCalificacion.text.toString()

            val intent = Intent(this, ActivityResultado::class.java)
            intent.putExtra("calificacion", calificacion)
            startActivity(intent)
        }
    }
}