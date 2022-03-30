package com.company.model;

public class BankAccount
{
    private Integer id;
    private String ownerName;
    private float amount;

    public BankAccount(Integer id, String ownerName)
    {
        this.id = id;
        this.ownerName = ownerName;
        this.amount = 0f;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getData()
    {
        return "OWNER'S NAME : "+this.ownerName+"\n"+
                "BALANCE : "+this.amount+"$";
    }

    @Override
    public String toString()
    {
        return "ID : "+this.id+"\n"+
                "OWNER'S NAME : "+this.ownerName+"\n"+
                "AMOUNT : "+this.amount;
    }
}
