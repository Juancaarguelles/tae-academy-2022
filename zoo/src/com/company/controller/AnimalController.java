package com.company.controller;

import com.company.model.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalController
{
    private static AnimalController animalController;
    private List<Animal>animals;

    private AnimalController()
    {
        this.animals = new ArrayList<>();
    }

    public static AnimalController getInstance()
    {
        if(animalController == null)
            animalController = new AnimalController();
        return animalController;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public void addAnimal(Animal animal)
    {
        this.animals.add(animal);
    }

    public void deleteAnimal(int index)
    {
        this.animals.remove(index);
    }

    public void getAnimalsInfo()
    {
        for(int i = 0; i < animals.size(); i++)
            System.out.println((i+1)+" . "+animals.get(i));
    }
}
