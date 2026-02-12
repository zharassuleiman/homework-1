package com.narxoz.rpg.factory;
import com.narxoz.rpg.character.Warrior;
public class WarriorFactory extends CharacterFactory {
    @Override
    public com.narxoz.rpg.character.Character createCharacter(String name) { return new Warrior(name); }
}