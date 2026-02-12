package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public class Mage implements Character {

    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;

    private Weapon weapon;
    private Armor armor;

    public Mage(String name) {
        this.name = name;
        this.health = 70;
        this.mana = 200;
        this.strength = 15;
        this.intelligence = 150;
    }

    @Override
    public String getName() { return name; }
    @Override
    public int getHealth() { return health; }
    @Override
    public int getMana() { return mana; }
    @Override
    public int getStrength() { return strength; }
    @Override
    public int getIntelligence() { return intelligence; }

    @Override
    public void attack() {
        if (weapon != null) {
            System.out.print(name + " (Mage) casts a spell using " + weapon.getName() + ": ");
            weapon.attack();
        } else {
            System.out.println(name + " shoots a weak magic spark! (Damage: " + (intelligence / 10) + ")");
        }
    }

    @Override
    public void defend() {
        if (armor != null) {
            System.out.print(name + " absorbs damage with " + armor.getName() + ": ");
            armor.defend();
        } else {
            System.out.println(name + " creates a weak mana shield.");
        }
    }

    @Override
    public void displayStats() {
        System.out.println("=== " + name + " (Mage) ===");
        System.out.println("Health: " + health + " | Mana: " + mana);
        System.out.println("Strength: " + strength + " | Intelligence: " + intelligence);
        System.out.println("Weapon: " + (weapon != null ? weapon.getName() : "None"));
        System.out.println("Armor: " + (armor != null ? armor.getName() : "None"));
    }

    @Override
    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
        System.out.println(name + " equipped magical weapon: " + weapon.getName());
    }

    @Override
    public void equipArmor(Armor armor) {
        this.armor = armor;
        System.out.println(name + " equipped magical armor: " + armor.getName());
    }
}