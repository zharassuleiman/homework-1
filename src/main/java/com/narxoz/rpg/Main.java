package com.narxoz.rpg;
import com.narxoz.rpg.character.Character;


import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.factory.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("   NARXOZ RPG SYSTEM - DESIGN PATTERNS ");
        System.out.println("\n");

        CharacterFactory warriorFactory = new WarriorFactory();
        CharacterFactory mageFactory = new MageFactory();
        CharacterFactory archerFactory = new ArcherFactory();

        EquipmentFactory medievalSet = new MedievalFactory();
        EquipmentFactory magicSet = new MagicFactory();
        EquipmentFactory rangerSet = new RangerFactory();

        List<Character> party = new ArrayList<>();

        System.out.println("[System] Creating and equipping heroes...");

        Character warrior = warriorFactory.createCharacter("Aragorn");
        warrior.equipWeapon(medievalSet.createWeapon());
        warrior.equipArmor(medievalSet.createArmor());
        party.add(warrior);

        Character mage = mageFactory.createCharacter("Gandalf");
        mage.equipWeapon(magicSet.createWeapon());
        mage.equipArmor(magicSet.createArmor());
        party.add(mage);

        Character archer = archerFactory.createCharacter("Legolas");
        archer.equipWeapon(rangerSet.createWeapon());
        archer.equipArmor(rangerSet.createArmor());
        party.add(archer);


        Character peasant = warriorFactory.createCharacter("Poor Joe");
        party.add(peasant);

        System.out.println("[System] All characters ready for battle!\n");

        for (Character hero : party) {
            System.out.println(">>> Hero Profile: " + hero.getName() + " <<<");
            hero.displayStats();

            System.out.println("Action phase:");
            hero.attack();
            hero.defend();
            System.out.println("--------------------------------------------------\n");
        }

        System.out.println("[System] Testing equipment swap: Mage puts on Plate Armor...");
        mage.equipArmor(medievalSet.createArmor());
        System.out.print("Mage updated defense: ");
        mage.defend();

        System.out.println("\n");
        System.out.println("  HW1 FINISHED");
        System.out.println("");
    }
}