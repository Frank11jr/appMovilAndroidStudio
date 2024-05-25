package com.example.appmovil

import android.os.Bundle
import  android.os.SystemClock
import android.widget.Button
import android.widget.Chronometer
import androidx.appcompat.app.AppCompatActivity

class CronometroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cronometro)

        val chronometer = findViewById<Chronometer>(R.id.chronometer)
        chronometer.base = SystemClock.elapsedRealtime()
        chronometer.start()

        val buttonBack = findViewById<Button>(R.id.button_back)
        buttonBack.setOnClickListener {
            finish() // Cierra la actividad actual y regresa a la anterior
        }
    }
}