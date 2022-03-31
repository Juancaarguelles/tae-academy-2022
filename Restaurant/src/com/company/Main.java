package com.company;

import com.company.controller.MenuController;
import com.company.model.Recipe;

import java.util.Scanner;

public class Main
{

    private static Scanner input = new Scanner(System.in);
    private static MenuController menuController = MenuController.getInstance();

    public static void main(String[] args)
    {
        executeRestaurant();
    }

    public static void executeRestaurant()
    {
        int option = 0;
        int index = 0;

        do {
            System.out.println("\n--WELCOME ADMIN--");
            System.out.println("1 .Add recipe\n" +
                    "2. Delete recipe\n" +
                    "3. Change recipe\n" +
                    "4. Amount of recipes registered\n" +
                    "5. Show recipes\n" +
                    "6. Exit");

            System.out.print("Type the option:: ");
            option = input.nextInt();

            switch (option)
            {
                case 1:
                    System.out.print("Type the recipe´s name : ");
                    String name = input.next();
                    System.out.print("Type the recipe's price : ");
                    float price = input.nextFloat();
                    System.out.println(menuController.addRecipe(new Recipe(name, price)));
                    break;
                case 2:
                    index = getSelectedIndex();
                    System.out.println(menuController.deleteRecipe(index));
                    break;
                case 3:
                    index = getSelectedIndex();
                    System.out.print("Type the recipe´s name : ");
                    name = input.next();
                    System.out.print("Type the recipe's price : ");
                    price = input.nextFloat();
                    System.out.println(menuController.updateRecipe(index, name, price));
                    break;
                case 4:
                    System.out.println("-THE AMOUNT OF RECIPES IS "+menuController.getMenu().getRecipes().size()+" --");
                    break;
                case 5:
                    System.out.println(menuController.listAll());
                    break;
                case 6:
                    System.out.println("--SEE YOU SOON--");
                    break;
                default:
                    System.out.println("--TYPE A VALID OPTION--");
            }


        }while (option != 6);
    }

    private static int getSelectedIndex()
    {
        int index = 0;

        do {
            System.out.println("\n"+menuController.listAll());
            System.out.print("Type the index you want to delete : ");
            index = input.nextInt();

            if(index < 1 || index > menuController.getMenu().getRecipes().size())
                System.out.println("--TYPE A VALID INDEX--");

        }while (index < 1 || index > menuController.getMenu().getRecipes().size());
        return --index;
    }
}
