package com.example.premiereapplication.DTO;

import java.util.Objects;

public class Personne {
    private String firstname;
    private String lastname;
    private int avatarColor;

    public Personne(String firstname, String lastname, int avatarColor) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.avatarColor = avatarColor;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", avatarColor=" + avatarColor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personne personne = (Personne) o;
        return avatarColor == personne.avatarColor &&
                Objects.equals(firstname, personne.firstname) &&
                Objects.equals(lastname, personne.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, avatarColor);
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAvatarColor(int avatarColor) {
        this.avatarColor = avatarColor;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAvatarColor() {
        return avatarColor;
    }
}
