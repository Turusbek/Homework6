package com.company;

public class GameEntity {
    private String attackType;
    private int damage;
    private int health;

    public String getAttackType() {
        return attackType;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public String info(){
        return "Суперспособность:"+this.attackType+" "+"Урон:"+this.damage+" "+"Здоровье"+this.health;
    }

}
