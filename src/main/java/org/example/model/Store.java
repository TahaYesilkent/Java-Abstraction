package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale [] products = new ProductForSale[3];

        products[0] = new Chocolate("Milk",10,"Yummy","Nut");
        products[1] = new Coke("Zero",5,"No Sugar",false);
        products[2] = new Bread("Baget",2,"İtalian",5);

        System.out.println("--- Mağazadaki Ürün Detayları ---");
        listProducts(products);


    }

    public static void listProducts(ProductForSale[] products) {

        for (ProductForSale product : products) {

            product.showDetails();
        }





    }
}