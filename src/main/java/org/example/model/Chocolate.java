package org.example.model;

public class Chocolate extends  ProductForSale{

    private  String sort;


    public Chocolate(String type, int price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, int price, String description, String sort) {
        super(type, price, description);
        this.sort = sort;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate Sort : "+sort);

    }
}
