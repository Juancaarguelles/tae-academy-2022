package com.company;

import com.company.model.Calculator;

import java.util.Scanner;

public class Main
{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        executeCalculator();
    }

    public static void executeCalculator()
    {
        int option = 0;
        float[]numbers;
        do {

            System.out.println("WELCOME TO CALC TRASH");
            System.out.println("1 .Sum\n" +
                            "2 .Substraction\n" +
                            "3 . Multiplication\n" +
                            "4 .Division\n" +
                    "5. Exit");

            System.out.print("SELECT AND OPTION :: ");
            option = input.nextInt();

            switch (option)
            {
                case 1:
                    numbers = getInputs();
                    System.out.println("--SUM : "+Calculator.sum(numbers[Calculator.N1_INDEX], numbers[Calculator.N2_INDEX])+" --");
                    break;
                case 2:
                    numbers = getInputs();
                    System.out.println("--SUBSTRACTION : "+Calculator.substract(numbers[Calculator.N1_INDEX], numbers[Calculator.N2_INDEX])+" --");
                    break;
                case 3:
                    numbers = getInputs();
                    System.out.println("--MULTIPLICATION : "+Calculator.multiply(numbers[Calculator.N1_INDEX], numbers[Calculator.N2_INDEX])+" --");
                    break;
                case 4:
                    numbers = getInputs();
                    System.out.println("--DIVISION : "+Calculator.divide(numbers[Calculator.N1_INDEX], numbers[Calculator.N2_INDEX])+" --");
                    break;
                case 5:
                    System.out.println("--SEE YOU SOON--");
                    break;
                default:
                    System.out.println("--TYPE A VALID OPTION--");
            }
        }while(option != 5);
    }

    public static float[]getInputs()
    {
        float []inputs = new float[2];

        System.out.print("Type number 1 : ");
        inputs[Calculator.N1_INDEX] = input.nextFloat();

        System.out.print("Type number 2 : ");
        inputs[Calculator.N2_INDEX] = input.nextFloat();

        return inputs;
    }
}
