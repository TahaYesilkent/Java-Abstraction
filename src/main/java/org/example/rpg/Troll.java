package org.example.rpg;

public class Troll extends Monster implements  Bleedable ,Poisonable  {

    private  double criticalChance = Math.random( );

    // Düzeltilmiş Super Constructor Çağrısı
    public Troll(String name, int hitPoints, double damage) { // SIRA DEĞİŞTİ
        super(name, hitPoints, damage);
    }

    public Troll(String name, int hitPoints, double damage, double criticalChance) { // SIRA DEĞİŞTİ
        super(name, hitPoints, damage);
        this.criticalChance = criticalChance;
    }

    @Override
    public double bleed() {

        if(criticalChance>0.5)
        {
            return  getDamage()*0.25;
        }
        else return 0;
    }
    @Override
    public  double posion(){
        if(criticalChance>0.5){
            return getDamage()*0.30;
        }
        else return  0;

    }

    public double getCriticalChance() {
        return criticalChance;
    }

    public void setCriticalChance(double criticalChance) {
        this.criticalChance = criticalChance;
    }




}
