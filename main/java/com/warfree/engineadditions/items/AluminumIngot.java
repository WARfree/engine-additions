package com.warfree.engineadditions.items;

import com.warfree.engineadditions.EngineAdditions;
import net.minecraft.item.Item;

public class AluminumIngot extends Item {
    public AluminumIngot() {
        super(new Item.Properties()
                .maxStackSize(64)
                .group(EngineAdditions.setup.itemGroup)
        );
        setRegistryName("aluminumingot");
    }
}
