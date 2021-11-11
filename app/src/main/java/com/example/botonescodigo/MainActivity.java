package com.example.botonescodigo;

import androidx.appcompat.app.AppCompatActivity;

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
    }


    public void recorrer() {
        GridLayout g = findViewById(R.id.gridLay);
        Button b;


        for (int i = 0; i < g.getChildCount(); i++) {

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
                String va = "Botón" + i;
                b.setText(va);
                g.addView(b, i);
            }
        }
        System.out.println("Filas: " + g.getRowCount());
        System.out.println("Columnas: " + g.getColumnCount());
    }

    @Override
    public void onClick(View v) {

    }
}