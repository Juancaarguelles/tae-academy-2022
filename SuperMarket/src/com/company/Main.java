package com.company;

import com.company.controller.InventaryController;
import com.company.model.Product;

import java.util.Scanner;

public class Main {

    private  static Scanner input = new Scanner(System.in);
    private static  InventaryController inventaryController = InventaryController.getInstance();

    public static void main(String[] args)
    {
        executeStoreSystem();
    }

    public static void executeStoreSystem()
    {
        int option = 0;

        do {
            System.out.println("\n--WELCOME TO THE STORE--");
            System.out.println(
                    "1  . Add product\n" +
                            "2 . Sell product\n" +
                            "3 . Show all products\n"+
                            "4 . Exit"
            );
            System.out.print("Type the option :: ");
            option = input.nextInt();

            switch (option)
            {
                case 1:
                    System.out.print("Type the name of the product : ");
                    String name = input.next();
                    System.out.print("Type the price of the product : ");
                    float price = input.nextFloat();
                    Product product = new Product(name, price);
                    inventaryController.addProduct(product);
                    System.out.println("--PRODUCT IS ADDED SUCCESFULLY--");
                    break;
                case 2:
                    int index = 0;

                    if(inventaryController.getInventary().getProducts().size() > 0) {
                        do {
                            inventaryController.listAll();
                            System.out.print("Type the index : ");
                            index = input.nextInt();

                            if (index < 1 || index > inventaryController.getInventary().getProducts().size())
                                System.out.println("--TYPE A VALID INDEX--");

                        } while (index < 1 || index > inventaryController.getInventary().getProducts().size());

                        inventaryController.sellProduct(--index);
                        System.out.println("--PRODUCT SELLED SUCCESFULLY--");
                    }
                    else
                        System.out.println("--NO PRODUCTS YET--");

                    break;
                case 3:
                        inventaryController.listAll();
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
