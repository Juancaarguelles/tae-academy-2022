package com.company.model;

public class Calculator
{

    public static final int N1_INDEX = 0;
    public static final int N2_INDEX = 1;
    public static float sum(float n1, float n2)
    {
        return n1 + n2;
    }

    public static float substract(float n1, float n2)
    {
        return n1 - n2;
    }

    public static float multiply(float n1, float n2)
    {
        return n1 * n2;
    }

    public static float divide(float n1, float n2)
    {
        if(n1 == 0) {
            System.out.println("--ZERO CANNOT BE DIVIDED--");
            return 0;
        }
        return n1 / n2;
    }
}
