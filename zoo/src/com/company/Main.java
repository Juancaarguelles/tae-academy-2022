package com.company;

import com.company.controller.AnimalController;
import com.company.model.Animal;

import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);
    private static AnimalController animalController = AnimalController.getInstance();

    public static void main(String[] args)
    {
        executeProgram();
    }

    public static void executeProgram()
    {
        int option = 0;

        do {
            System.out.println("\n--ZOO SOFTWARE--");
            System.out.println("" +
                    "1. Add Animal\n" +
                    "2. Delete animal\n" +
                    "3. See animals\n" +
                    "4. Exit");

            System.out.print("Type the option::");
            option = input.nextInt();

            switch (option)
            {
                case 1:
                    System.out.print("type the name of the animal : ");
                    String name = input.next();
                    System.out.print("type the specie of the animal : ");
                    String specie = input.next();
                    System.out.print("type the feature of the animal : ");
                    String feature = input.next();
                    System.out.print("type the opinion of the animal : ");
                    String opinion = input.next();
                    animalController.addAnimal(new Animal(name, specie, feature, opinion));
                    break;
                case 2:
                        int index = 0;

                        do
                        {
                            animalController.getAnimalsInfo();
                            System.out.print("Type the index :: ");
                            index = input.nextInt();

                            if(index < 1 || index > animalController.getAnimals().size())
                                System.out.println("--SELECT A VALID INDEX--");
                        }
                        while (index < 1 || index > animalController.getAnimals().size());
                        animalController.deleteAnimal(--index);
                    break;
                case 3:
                    animalController.getAnimalsInfo();
                    break;
                case 4:
                    System.out.println("--SEE YOU SOON--");
                    break;
                default:
                    System.out.println("--TYPE A VALID OPTION--");
                    break;
            }
        }while (option != 4);
    }
}
