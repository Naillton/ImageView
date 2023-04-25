package com.example.imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val img: ImageView = findViewById(R.id.img)
        // podemos definir uma imagem no arquivo xml onde instanciamos a imagem
        // ou podemos definir a imagem via codigo com o setImageResource
        // lembrando que o setImageResource usa o id para setar a imagem
        // temos alguns outros metodos que usamos para setar imagem com o Bitmap e o Drawble
        img.setImageResource(R.drawable.campanha)
        // desta forma conseguimos utilizar imagens no codigo
    }
}