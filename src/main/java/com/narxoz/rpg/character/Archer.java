package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public class Archer implements Character {

    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;

    private Weapon weapon;
    private Armor armor;

    public Archer(String name) {
        this.name = name;
        // Archer stats: Balanced
        this.health = 100;
        this.mana = 60;
        this.strength = 70;
        this.intelligence = 40;
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
            System.out.print(name + " (Archer) fires a shot with " + weapon.getName() + ": ");
            weapon.attack();
        } else {
            System.out.println(name + " throws a stone! (Damage: 5)");
        }
    }

    @Override
    public void defend() {
        if (armor != null) {
            System.out.print(name + " uses " + armor.getName() + " for cover: ");
            armor.defend();
        } else {
            System.out.println(name + " performs a tactical roll to dodge.");
        }
    }

    @Override
    public void displayStats() {
        System.out.println("=== " + name + " (Archer) ===");
        System.out.println("Health: " + health + " | Mana: " + mana);
        System.out.println("Strength: " + strength + " | Intelligence: " + intelligence);
        System.out.println("Weapon: " + (weapon != null ? weapon.getName() : "None"));
        System.out.println("Armor: " + (armor != null ? armor.getName() : "None"));
    }

    @Override
    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
        System.out.println(name + " readies weapon: " + weapon.getName());
    }

    @Override
    public void equipArmor(Armor armor) {
        this.armor = armor;
        System.out.println(name + " puts on armor: " + armor.getName());
    }
}