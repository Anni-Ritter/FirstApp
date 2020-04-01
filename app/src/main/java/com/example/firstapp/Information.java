package com.example.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.firstapp.MainActivity.nameFruit;

public class Information extends AppCompatActivity {

    private Button buttonBack;
    private TextView textView;
    private TextView fruitName;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information);
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        textView = (TextView)findViewById(R.id.textView);
        fruitName = (TextView)findViewById(R.id.fruitName);
        imageView = (ImageView)findViewById(R.id.imageView);
        buttonBack = (Button)findViewById(R.id.buttonBack);

        if (nameFruit == 1){
            fruitName.setText("Банан");
            imageView.setImageResource(R.drawable.banan);
            textView.setText(R.string.infoBanan);}
        if (nameFruit == 2){
            fruitName.setText("Персик");
            imageView.setImageResource(R.drawable.persik);
            textView.setText(R.string.infoPersik);}
        if (nameFruit == 3){
            fruitName.setText("Абрикос");
            imageView.setImageResource(R.drawable.abrikos);
            textView.setText(R.string.infoAbrikos); }
        if (nameFruit == 4){
            fruitName.setText("Айва");
            imageView.setImageResource(R.drawable.ayva);
            textView.setText(R.string.infoAyva); }
        if (nameFruit == 5){
            fruitName.setText("Ананас");
            imageView.setImageResource(R.drawable.ananas);
            textView.setText(R.string.infoAnanas);}
        if (nameFruit == 6){
            fruitName.setText("Черешня");
            imageView.setImageResource(R.drawable.chereshnya);
            textView.setText(R.string.infoChereshnya);
        }

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent(Information.this,MainActivity.class);
                    startActivity(intent); finish();
                }catch (Exception e){ }
            }
        });
    }

}
