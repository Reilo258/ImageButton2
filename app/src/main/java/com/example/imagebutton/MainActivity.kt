package com.example.imagebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<ImageButton>(R.id.btn1);
        val btn2 = findViewById<ImageButton>(R.id.btn2);
        val btn3 = findViewById<ImageButton>(R.id.btn3);
        val btn4 = findViewById<ImageButton>(R.id.btn4);
        val btn5 = findViewById<ImageButton>(R.id.btn5);
        val length = Toast.LENGTH_SHORT;
        var a1 = 0;
        var a2 = 0;
        var a3 = 0;
        var a4 = 0;
        var a5 = 0;

        btn1.setOnClickListener {
            Toast.makeText(applicationContext, "To jest Rote Kampfliger", length).show();
            a1+=1;
            if(a1%2==0)
                btn1.alpha = 1F;
            else
                btn1.alpha = 0.5F;
        }

        btn2.setOnClickListener {
            Toast.makeText(applicationContext, "To jest Pieseł", length).show();
            a2+=1;
            if(a2%2==0)
                btn2.alpha = 1F;
            else
                btn2.alpha = 0.5F;
        }

        btn3.setOnClickListener {
            Toast.makeText(applicationContext, "To jest Flugabwehrraketensystem Roland auf Radkraftfahrzeug Ein", length).show();
            a3+=1;
            if(a3%2==0)
                btn3.alpha = 1F;
            else
                btn3.alpha = 0.5F;
        }

        btn4.setOnClickListener {
            Toast.makeText(applicationContext, "To jest Koteł", length).show();
            a4+=1;
            if(a4%2==0)
                btn4.alpha = 1F;
            else
                btn4.alpha = 0.5F;
        }

        btn5.setOnClickListener {
            Toast.makeText(applicationContext, "To jest Polski Husarz", length).show();
            a5+=1;
            if(a5%2==0)
                btn5.alpha = 1F;
            else
                btn5.alpha = 0.5F;
        }


    }
}