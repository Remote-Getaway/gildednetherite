package com.remotegetaway.gildednetherite.items;

public interface AdvancedArmorItem {
    default boolean hasKnockbackResistance() {
        return false;
    }
}
