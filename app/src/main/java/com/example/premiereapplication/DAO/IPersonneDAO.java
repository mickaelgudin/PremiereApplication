package com.example.premiereapplication.DAO;

import com.example.premiereapplication.DTO.Personne;

import java.util.List;

public interface IPersonneDAO {
    public List<Personne> getPersonnes();
    public void ajoutPersonne(Personne personne);
    public void removePersonne(Personne personne);
}
