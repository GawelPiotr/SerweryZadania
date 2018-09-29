package com.example.pgawel.SerweryZadania.user;

import java.io.Serializable;

public class User implements Serializable {

    private String imię;
    private String nazwisko;

    public User(String imię, String nazwisko) {
        this.imię = imię;
        this.nazwisko = nazwisko;
    }

    public String getImię() {
        return imię;
    }

    public void setImię(String imię) {
        this.imię = imię;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}
