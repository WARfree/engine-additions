package com.warfree.engineadditions.items;

import com.warfree.engineadditions.EngineAdditions;
import net.minecraft.item.Item;

public class CopperIngot extends Item {
    public CopperIngot() {
        super(new Properties()
                .maxStackSize(64)
                .group(EngineAdditions.setup.itemGroup)
        );
        setRegistryName("copperingot");
    }
}
