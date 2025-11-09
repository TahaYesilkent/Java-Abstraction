package org.example.model;

public class Coke extends  ProductForSale{


    private  boolean containSugar;
    public Coke(String type, int price, String description) {
        super(type, price, description);
    }

    public Coke(String type, int price, String description, boolean containSugar) {
        super(type, price, description);
        this.containSugar = containSugar;
    }

    public void setContainSugar(boolean containSugar) {
        this.containSugar = containSugar;
    }

    public boolean isContainSugar() {
        return containSugar;
    }

    @Override
   public  void showDetails() {
        System.out.println("Contains Sugar ? "+containSugar);
    }
}
