package com.narxoz.rpg.factory;
import com.narxoz.rpg.equipment.*;
public interface EquipmentFactory {
    Weapon createWeapon();
    Armor createArmor();
}