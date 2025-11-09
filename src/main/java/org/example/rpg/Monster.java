package org.example.rpg;

public class Monster implements  Bleedable ,Poisonable{

    private  String name ;
    private  int hitPoints;
    private  double damage;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public double getDamage() {
        return damage;
    }

    public Monster(String name, int hitPoints, double damage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }



    @Override
    public double bleed() {
        return 0;
    }

    @Override
    public double posion() {
        return 0;
    }


    public double attack(){
        return  getDamage()+bleed()+posion();
    }
}
