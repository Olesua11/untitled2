package org.example;

public class Main {
    public static void main(String[] args) {
             Boss boss = new Boss(6000, 100, "Armor");
        System.out.println("Boss Information:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Type of protection: " + boss.getDefenseType());

                Hero hero1 = new Hero(150, 10, "Flight");
        Hero hero2 = new Hero(170, 78);

                  System.out.println("Hero information 1:");
            System.out.println("Health: " + hero1.getHealth());
        System.out.println("Damage: " + hero1.getDamage());
        System.out.println("Superpower: " + hero1.getSuperpower());

        System.out.println("Hero information 2:");
             System.out.println("Health: " + hero2.getHealth());
        System.out.println("Damage: " + hero2.getDamage());
        System.out.println("Superpower: " + hero2.getSuperpower());
    }
}
