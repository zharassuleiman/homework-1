package com.narxoz.rpg.character;
import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public interface Character {
    String getName();
    int getHealth();
    int getMana();
    int getStrength();
    int getIntelligence();

    void attack();
    void defend();
    void displayStats();

    void equipWeapon(Weapon weapon);
    void equipArmor(Armor armor);
}