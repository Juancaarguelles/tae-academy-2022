package com.company.model;

import java.util.ArrayList;
import java.util.List;

public class Inventary
{
    private List<Product>products;

    public Inventary()
    {
        this.products = new ArrayList<>();
    }


    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product)
    {
        this.products.add(product);
    }

    public void delete(int index)
    {
        this.products.remove(index);
    }

    public void listProducts()
    {
        for(int i = 0; i < this.products.size(); i++)
            System.out.println((i+1)+" . "+this.products.get(i));
    }
}
