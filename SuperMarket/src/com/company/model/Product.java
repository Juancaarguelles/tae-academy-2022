package com.company.model;

public class Product
{
    private static int ITERATOR = 1;
    private int id;
    private String name;
    private float price;

    public Product(String name, float price)
    {
        id = ITERATOR++;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "ID : "+this.id+"\n"+
                "NAME : "+this.name+"\n"+
                "PRICE : "+this.price+"\n";
    }
}
