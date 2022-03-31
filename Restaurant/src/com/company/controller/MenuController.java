package com.company.controller;

import com.company.model.Menu;
import com.company.model.Recipe;

public class MenuController
{
    private static MenuController menuController;
    private Menu menu;

    private MenuController()
    {
        this.menu = Menu.getInstance();
    }

    public static MenuController getInstance()
    {
        if(menuController == null)
            menuController = new MenuController();
        return menuController;
    }

    public String addRecipe(Recipe recipe)
    {
        if(this.menu.add(recipe))
            return "--RECIPE ADDED SUCCESFULLY--";
        return "--COULD NOT ADD RECIPE--";
    }

    public String deleteRecipe(int index)
    {
        if(this.menu.delete(index))
            return "--RECIPE DELETED SUCCESFULLY--";
        return "--COULD NOT DELETE RECIPE--";
    }

    public String updateRecipe(int index, String name , float price)
    {
        if(this.menu.update(index, name, price))
            return "--RECIPE CHANGED SUCCESFULLY--";
        return "--COULD NOT CHANGE RECIPE--";
    }

    public String listAll()
    {
        return this.menu.list();
    }

    public Menu getMenu()
    {
        return this.menu;
    }
}
