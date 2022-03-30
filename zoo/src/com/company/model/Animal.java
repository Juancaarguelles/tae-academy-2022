package com.company.model;

public class Animal
{
    private static int ITERATOR = 1;
    private int id;
    private String name;
    private String specie;
    private String feature;
    private String ownOpinion;

    public Animal(String name, String specie, String feature, String ownOpinion)
    {
        this.id = ++ITERATOR;
        this.name = name;
        this.specie = specie;
        this.feature = feature;
        this.ownOpinion = ownOpinion;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getOwnOpinion() {
        return ownOpinion;
    }

    public void setOwnOpinion(String ownOpinion) {
        this.ownOpinion = ownOpinion;
    }

    @Override
    public String toString()
    {
        return "ID : "+id+"\n"+
                "NAME : "+this.name+"\n"+
                "SPECIE : "+this.specie+"\n"+
                "FEATURE : "+this.feature+"\n"+
                "OWN OPINION : "+this.ownOpinion;
    }
}
