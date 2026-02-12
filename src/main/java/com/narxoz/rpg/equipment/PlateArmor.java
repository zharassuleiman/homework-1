package com.narxoz.rpg.equipment;
public class PlateArmor implements Armor {
    public String getName() { return "Plate Armor"; }
    public int getDefense() { return 40; }
    public void defend() { System.out.println("Blocks with heavy steel! (Defense: " + getDefense() + ")"); }
}
