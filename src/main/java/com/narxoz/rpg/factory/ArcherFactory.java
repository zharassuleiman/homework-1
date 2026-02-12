package com.narxoz.rpg.factory;
import com.narxoz.rpg.character.Archer;

public class ArcherFactory extends CharacterFactory {

    @Override
    public com.narxoz.rpg.character.Character createCharacter(String name) {
        return new Archer(name);
    }
}