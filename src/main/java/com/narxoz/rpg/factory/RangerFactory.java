package com.narxoz.rpg.factory;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.LeatherArmor;
import com.narxoz.rpg.equipment.LongBow;
import com.narxoz.rpg.equipment.Weapon;

public class RangerFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new LongBow();
    }
    @Override
    public Armor createArmor() {
        return new LeatherArmor();
    }
}