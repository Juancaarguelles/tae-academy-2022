package com.company.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Menu
{
    private static Menu menu;
    private static final String ERROR_MSG = "--SOMETHING HAS GONE WRONG--";

    private List<Recipe>recipes;

    private Menu(){
        this.recipes = new ArrayList<>();
    }

    public static Menu getInstance()
    {
        if(menu == null)
            menu = new Menu();
        return menu;
    }

    public boolean add(Recipe recipe)
    {
        try {
            this.recipes.add(recipe);
            return true;
        }catch (Exception e)
        {
            System.out.println(ERROR_MSG);
            return false;
        }
    }

    public boolean delete(int index)
    {
        try
        {
            this.recipes.remove(index);
            return true;
        }catch (Exception e)
        {
            System.out.println(ERROR_MSG);
            return false;
        }
    }

    public boolean update(int index, String name, float price)
    {
        try
        {
            Recipe recipe = this.recipes.get(index);
            recipe.setName(name);
            recipe.setPrice(price);
            return true;
        }catch (Exception e)
        {
            System.out.println(ERROR_MSG);
            return false;
        }
    }

    public String list()
    {
        if(this.recipes.size()>0) {
            String list = "";
            for (int i = 0; i < this.recipes.size(); i++)
                list += (i + 1) + " " + this.recipes.get(i).getData() + "\n";
            return list;
        }
        return "--NO RECIPES REGISTERED YET--";
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }
}
