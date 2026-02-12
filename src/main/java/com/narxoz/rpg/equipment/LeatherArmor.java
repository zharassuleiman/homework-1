package com.narxoz.rpg.equipment;

public class LeatherArmor implements Armor {
    @Override public String getName() { return "Leather Armor"; }
    @Override public int getDefense() { return 15; }
    @Override public void defend() {
        System.out.println("Dodges and absorbs impact with leather! (Defense: " + getDefense() + ")");
    }
}