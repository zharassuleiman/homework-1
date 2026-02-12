package com.narxoz.rpg.equipment;
public class IronSword implements Weapon {
    public String getName() { return "Iron Sword"; }
    public int getDamage() { return 25; }
    public void attack() { System.out.println("Strikes with physical force! (Damage: " + getDamage() + ")"); }
}