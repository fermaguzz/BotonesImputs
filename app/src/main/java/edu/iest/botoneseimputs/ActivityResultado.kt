package edu.iest.botoneseimputs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat

class ActivityResultado : AppCompatActivity() {
        private lateinit var tvMensaje: TextView
        private lateinit var btnRegresar: Button

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_resultado)

            tvMensaje = findViewById<TextView>(R.id.tv_mensaje)
            btnRegresar = findViewById<Button>(R.id.btn_regresar)

            val calificacion = intent.getStringExtra("calificacion")

            if (calificacion != null) {
                if (calificacion.toFloat() >= 6.0) {
                    tvMensaje.setTextColor(ContextCompat.getColor(this, R.color.verde))
                    tvMensaje.text = "¡Felicidades! Aprobaste la materia con $calificacion"
                } else {
                    tvMensaje.setTextColor(ContextCompat.getColor(this, R.color.rojo))
                    tvMensaje.text = "Obtuviste un $calificacion. Sigue participando."
                }
            }

            btnRegresar.setOnClickListener {
                finish()
            }
        }
    }
