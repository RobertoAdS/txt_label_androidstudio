package com.example.definevariveis

import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val num1 = findViewById<EditText>(R.id.txt1)
        val num2 = findViewById<EditText>(R.id.txt2)
        val botao = findViewById<Button>(R.id.botao)

        botao.setOnClickListener() {
            val valor1 = num1.text.toString()
            val valor2 = num2.text.toString()

            if(TextUtils.isEmpty(valor1) || valor2 == ""){
            Toast.makeText(applicationContext, "algum valor nulo", Toast.LENGTH_SHORT).show()
            }else{
                valor1.toInt();
                valor2.toInt();
                if (valor1 == valor2) {
                    Toast.makeText(applicationContext, "valores iguais", Toast.LENGTH_SHORT).show()
                } else if (valor1 > valor2) {
                    Toast.makeText(applicationContext, "Valor1 é Maior", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(applicationContext, "Valor2 é Maior", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    }
