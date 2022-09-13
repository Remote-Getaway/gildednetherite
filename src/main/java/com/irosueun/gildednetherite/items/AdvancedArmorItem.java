package com.irosueun.gildednetherite.items;

public interface AdvancedArmorItem {
    default boolean hasKnockbackResistance() {
        return false;
    }
}
