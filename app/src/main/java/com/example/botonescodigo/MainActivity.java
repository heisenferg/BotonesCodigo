package com.example.botonescodigo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anadirHijos(18);
    }

    public void anadirHijos(int c){
        GridLayout gridLayout = (GridLayout) findViewById(R.id.gridLay);
        Button b;

        for (int i=0; i<c-1; i++){
            b=new Button(this);
            b.setLayoutParams(new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT));

            //Identificador único:
           b.setId(View.generateViewId());
            b.setText("Botón " + i);
            gridLayout.addView(b, i);
        }
    }
}