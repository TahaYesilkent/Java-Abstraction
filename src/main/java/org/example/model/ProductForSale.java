package org.example.model;

public abstract class ProductForSale {

    private  final  String type;
    private  final  int price;
    private  final  String description;

    public ProductForSale(String type, int price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }



    public int getSalesPrice(int quantity){
        return quantity*price;
    }
    abstract public void showDetails();
















}