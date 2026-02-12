package com.narxoz.rpg.equipment;
public class WizardStaff implements Weapon {
    public String getName() { return "Wizard Staff"; }
    public int getDamage() { return 35; }
    public void attack() { System.out.println("Releases a magical blast! (Power: " + getDamage() + ")"); }
}