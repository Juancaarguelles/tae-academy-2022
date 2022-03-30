package com.company;

import com.company.model.BankAccount;

import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        BankAccount bankAccount = new BankAccount(100, "Juan Camilo Argüelles");

        executeBank(bankAccount);
    }

    public static void executeBank(BankAccount bankAccount)
    {
        int option = 0;

        do {
            System.out.println("--WELCOME TO TRASH BANK--");
            System.out.println("1. Add money\n" +
                    "2. Retrieve cash\n" +
                    "3. See account details\n" +
                    "4. Exit");

            System.out.print("::");
            option = input.nextInt();

            switch (option)
            {
                case 1:
                    System.out.print("TYPE THE AMOUNT :: ");
                    float cash = input.nextFloat();
                    bankAccount.setAmount(cash);
                    System.out.println("--YOU HAVE ADDED "+cash+ "$ --");
                    break;
                case 2:
                    System.out.print("TYPE THE AMOUNT:: ");
                    float amount = input.nextFloat();

                    if(amount > bankAccount.getAmount()) {
                        System.out.println("--YOU DON'T HAVE THAT BALANCE--");
                        System.out.println("--CURRENT BALANCE : "+bankAccount.getAmount()+"$ --");
                    }
                    else
                        System.out.println("--YOU RETRIEVED "+amount+"$ --");
                    break;
                case 3:
                    System.out.println(bankAccount.getData());
                    break;
                case 4:
                    System.out.println("--SEE YOU SOON--");
                    break;
                default:
                    System.out.println("--SELECT A VALID OPTION--");
                    break;
            }
        }while(option != 4);
    }
}
