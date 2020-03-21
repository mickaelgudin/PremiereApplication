package com.example.premiereapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_afficher;
    Button btn_ajout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_afficher = (Button) findViewById(R.id.affichage);
        btn_afficher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getApplicationContext(), PersonListActivtiy.class);
                startActivity(myIntent);
            }
        });

        btn_ajout = (Button) findViewById(R.id.ajout);
        btn_ajout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getApplicationContext(), AjouterPersonActivity.class);
                startActivity(myIntent);
            }
        });
    }

}
