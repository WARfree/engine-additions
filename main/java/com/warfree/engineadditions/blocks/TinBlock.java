package com.warfree.engineadditions.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class TinBlock extends Block {
    public TinBlock() {
        super(Properties.create(Material.IRON)
                .sound(SoundType.METAL)
                .hardnessAndResistance(2.0f)
                .lightValue(0)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
        );
        setRegistryName("tinblock");
    }
}
