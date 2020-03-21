package com.example.premiereapplication.DAO;

import android.graphics.Color;

import com.example.premiereapplication.DTO.Personne;

import java.util.ArrayList;
import java.util.List;

public class PersonDAOData implements IPersonneDAO {
    private static List<Personne> personnes = new ArrayList<Personne>(){
        {
           add(new Personne("PRENOM 1", "NOM1", Color.BLACK));
            add(new Personne("PRENOM 2", "NOM2", Color.BLACK));
        }
    };

    @Override
    public List<Personne> getPersonnes() {
        return this.personnes;
    }

    @Override
    public void ajoutPersonne(Personne personne) {
        this.personnes.add(personne);
    }

    @Override
    public void removePersonne(Personne personne) {
        this.personnes.remove(personne);
    }

}
