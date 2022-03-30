package com.company.controller;

import com.company.model.Inventary;
import com.company.model.Product;
import com.sun.security.jgss.GSSUtil;

public class InventaryController
{
    private static InventaryController inventaryController;
    private Inventary inventary;

    private InventaryController()
    {
        this.inventary = new Inventary();
    }

    public static InventaryController getInstance()
    {
        if(inventaryController == null)
            inventaryController = new InventaryController();
        return inventaryController;
    }

    public void addProduct(Product product)
    {
        this.inventary.addProduct(product);
    }

    public void sellProduct(int index)
    {
        this.inventary.delete(index);
    }

    public void listAll()
    {
        this.inventary.listProducts();
    }

    public Inventary getInventary()
    {
        return this.inventary;
    }
}
