package com.narxoz.rpg.equipment;
public class EnchantedRobes implements Armor {
    public String getName() { return "Enchanted Robes"; }
    public int getDefense() { return 10; }
    public void defend() { System.out.println("Magic barrier active! Defense: " + getDefense()); }
}