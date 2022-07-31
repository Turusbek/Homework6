package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Boss boss = new Boss();
        boss.setAttackType("attack");
        boss.setDamage(50);
        boss.setHealth(200);
        System.out.println(boss.info());

    }
}
