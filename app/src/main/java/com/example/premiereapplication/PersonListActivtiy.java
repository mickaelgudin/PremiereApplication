package com.example.premiereapplication;

import android.app.Person;
import android.content.Intent;
import android.os.Bundle;

import com.example.premiereapplication.DAO.PersonDAOData;
import com.example.premiereapplication.DTO.Personne;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Arrays;

public class PersonListActivtiy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.affichage);

        PersonDAOData p = new PersonDAOData();
        String affichageArray = "";
        for(Personne personne: p.getPersonnes()){
            affichageArray += personne.getLastname()+"\n"+personne.getFirstname()+"\n\n";
        }
        String [] listPersonnes = affichageArray.split("\n\n");


        ListView mListView = (ListView) findViewById(R.id.listView);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(PersonListActivtiy.this,
                android.R.layout.simple_list_item_1, listPersonnes);
        mListView.setAdapter(adapter);
    }

}
