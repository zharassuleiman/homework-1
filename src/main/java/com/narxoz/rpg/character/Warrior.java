package com.narxoz.rpg.character;
import com.narxoz.rpg.equipment.*;

public class Warrior implements Character {
    private String name;
    private int health = 150, mana = 20, strength = 100, intelligence = 10;
    private Weapon weapon;
    private Armor armor;

    public Warrior(String name) { this.name = name; }
    @Override public String getName() { return name; }
    @Override public int getHealth() { return health; }
    @Override public int getMana() { return mana; }
    @Override public int getStrength() { return strength; }
    @Override public int getIntelligence() { return intelligence; }
    @Override public void equipWeapon(Weapon w) { this.weapon = w; }
    @Override public void equipArmor(Armor a) { this.armor = a; }
    @Override public void attack() { if (weapon != null) weapon.attack(); }
    @Override public void defend() { if (armor != null) armor.defend(); }
    @Override public void displayStats() { System.out.println(name + " (Warrior) HP: " + health); }
}