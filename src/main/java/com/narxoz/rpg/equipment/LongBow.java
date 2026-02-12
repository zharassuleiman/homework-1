package com.narxoz.rpg.equipment;

public class LongBow implements Weapon {
    @Override public String getName() { return "Elven Longbow"; }
    @Override public int getDamage() { return 22; }
    @Override public void attack() {
        System.out.println("Fires a precision arrow! (Damage: " + getDamage() + ")");
    }
}