package com.warfree.engineadditions.items;

import com.warfree.engineadditions.EngineAdditions;
import net.minecraft.item.Item;

public class SilverIngot extends Item {
    public SilverIngot() {
        super(new Properties()
                .maxStackSize(64)
                .group(EngineAdditions.setup.itemGroup)
        );
        setRegistryName("silveringot");
    }
}
