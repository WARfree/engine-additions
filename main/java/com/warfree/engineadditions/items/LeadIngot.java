package com.warfree.engineadditions.items;

import com.warfree.engineadditions.EngineAdditions;
import net.minecraft.item.Item;

public class LeadIngot extends Item {
    public LeadIngot() {
        super(new Properties()
                .maxStackSize(64)
                .group(EngineAdditions.setup.itemGroup)
        );
        setRegistryName("leadingot");
    }
}
