package com.remotegetaway.gildednetherite.items;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;


public class GildedNetheriteItem extends ArmorItem implements AdvancedArmorItem{
    public GildedNetheriteItem(ArmorMaterial material, ArmorSlot slot, Item.Settings settings) {
        super(material, slot, settings);
    }

    @Override
    public boolean isFireproof() {
        return true;
    }

    @Override
    public boolean hasKnockbackResistance() {
        return getMaterial().getKnockbackResistance() > 0;
    }
}
