package org.example.model;

public class Bread extends  ProductForSale{

    private int piece;

    public Bread(String type, int price, String description) {
        super(type, price, description);
    }

    public Bread(String type, int price, String description, int piece) {
        super(type, price, description);
        this.piece = piece;
    }

    public int getPiece() {
        return piece;
    }

    public void setPiece(int piece) {
        this.piece = piece;
    }

    @Override
    public void showDetails() {
        System.out.println("Piece Count: "+piece);
    }
}
