package com.example.simplecalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val eingabe1 : EditText by lazy { findViewById(R.id.editTextInput) }
    private val eingabe2 : EditText by lazy { findViewById(R.id.editTextInput2) }
    private val ausgabe : TextView by lazy { findViewById(R.id.textViewOutput) }
    private val btnSimple : Button by lazy { findViewById(R.id.simpleButton) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSimple.setOnClickListener {
            val message = eingabe1.text.toString()
            val message2 = eingabe2.text.toString()

            val zahl1 = message.toInt()
            val zahl2 = message2.toInt()


            val ergebnis = zahl1 + zahl2

            ausgabe.text = ergebnis.toString()
        }

    }
}