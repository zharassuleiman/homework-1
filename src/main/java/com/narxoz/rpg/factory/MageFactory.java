package com.narxoz.rpg.factory;
import com.narxoz.rpg.character.Mage;

public class MageFactory extends CharacterFactory {
    @Override
    public com.narxoz.rpg.character.Character createCharacter(String name) {
        return new Mage(name);
    }
}