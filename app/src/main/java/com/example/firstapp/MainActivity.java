package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageButton img;
    private TextView text;
    private Button abrikos;
    private Button ananas;
    private Button ayva;
    private Button banan;
    private Button chereshnya;
    private Button persik;
    static int nameFruit = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fruits();
        img = (ImageButton)findViewById(R.id.imageButton);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent(MainActivity.this,Information.class);
                    startActivity(intent); finish();
                }catch (Exception e){ }
            }
        });
    }

    public void fruits() {
        img = (ImageButton)findViewById(R.id.imageButton);
        text = (TextView)findViewById(R.id.text);
        ananas = (Button)findViewById(R.id.ananas);
        abrikos = (Button)findViewById(R.id.abrikos);
        ayva = (Button)findViewById(R.id.ayva);
        banan = (Button)findViewById(R.id.banan);
        chereshnya = (Button)findViewById(R.id.сhereshnya);
        persik = (Button)findViewById(R.id.persik);
        banan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.banan);
                text.setText("Банан");
                nameFruit = 1;
            }
        });
        persik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.persik);
                text.setText("Персик");
                nameFruit = 2;
            }
        });
        abrikos.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.abrikos);
                text.setText("Абрикос");
                nameFruit = 3;
            }
        });
        ayva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.ayva);
                text.setText("Айва");
                nameFruit = 4;
            }
        });
        ananas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.ananas);
                text.setText("Ананас");
                nameFruit = 5;
            }
        });
        chereshnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.chereshnya);
                text.setText("Черешня");
                nameFruit = 6;
            }
        });

    }
}
