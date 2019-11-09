package com.warfree.engineadditions.items;

import com.warfree.engineadditions.EngineAdditions;
import net.minecraft.item.Item;

public class NickelIngot extends Item {
    public NickelIngot() {
        super(new Properties()
                .maxStackSize(64)
                .group(EngineAdditions.setup.itemGroup)
        );
        setRegistryName("nickelingot");
    }
}
