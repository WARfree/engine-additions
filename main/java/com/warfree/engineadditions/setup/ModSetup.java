package com.warfree.engineadditions.setup;

import com.warfree.engineadditions.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {
    public ItemGroup itemGroup = new ItemGroup("engineadditions") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.ALUMINUMBLOCK);
        }
    };

    public void init() {

    }
}
