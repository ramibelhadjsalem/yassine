package com.yassine.yassine.Controllers;

public class Personne {
    private  String  name;

    public Personne() {
        this.name="";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Personne(String name) {
        this.name = name;
    }
}
