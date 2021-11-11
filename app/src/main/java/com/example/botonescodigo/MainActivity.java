package com.example.botonescodigo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.gridlayout.widget.GridLayout;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anadeHijos(18);
        recorrer();
    }


    public void recorrer() {
        GridLayout g = findViewById(R.id.gridLay);
        Button b;


        for (int i = 0; i < g.getChildCount(); i++) {
            View v = g.getChildAt(i);
            if (v.getClass().getSimpleName().equals("Button")) {
                b = (Button) v;
                b.setBackgroundColor(Color.rgb(i*10, i*50, i*30));
            }
        }
    }

    public void anadeHijos(int c){
        GridLayout g = findViewById(R.id.gridLay);
        Button b;

        for (int i=0; i<c; i++){
            b=new Button(this);
            b.setLayoutParams(new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT));

            //Identificador único:
            b.setId(View.generateViewId());
            if (i==17){
                b.setText("reset");
            } else {
                String va = "Botón " + i;
                b.setText(va);

            }
            g.addView(b, i);
            b.setOnClickListener(this); // registro en el listener el objeto del compponente b
        }
        System.out.println("Filas: " + g.getRowCount());
        System.out.println("Columnas: " + g.getColumnCount());
    }

    @Override
    public void onClick(View v) {
        System.out.println("Se ha pulsado el botón " + v.toString());

        Button b;
        if (v.getClass().getSimpleName().equals("Button")){
            b= (Button) v;
            if(b.getText().equals("reset")){
                recorrer();
            } else {
                b.setBackgroundColor(Color.rgb(255, 255, 255));
            }
        }
    }
}