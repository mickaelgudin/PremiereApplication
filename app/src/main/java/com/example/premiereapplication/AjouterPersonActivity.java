package com.example.premiereapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.premiereapplication.DAO.PersonDAOData;
import com.example.premiereapplication.DTO.Personne;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class AjouterPersonActivity extends AppCompatActivity {
    Button btn_ajouter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_ajouter_person);

        btn_ajouter = (Button) findViewById(R.id.button4);
        btn_ajouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PersonDAOData p = new PersonDAOData();
                String firstname = ((TextInputEditText) findViewById(R.id.prenom)).getText().toString();
                String lastname = ((TextInputEditText) findViewById(R.id.nom)).getText().toString();

                p.getPersonnes().add(new Personne(firstname,lastname,0));
                Toast.makeText(getApplicationContext(), "LA PERSONNE A ETE AJOUTEE", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        if (id == android.R.id.home)
        {
            onBackPressed();
            return true;
        }
        else
        {
            return super.onOptionsItemSelected(item);
        }
    }
}
