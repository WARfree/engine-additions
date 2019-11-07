package com.warfree.engineadditions.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class NickelBlock extends Block {
    public NickelBlock() {
        super(Properties.create(Material.IRON)
                .sound(SoundType.METAL)
                .lightValue(0)
                .hardnessAndResistance(2.0f)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
        );
        setRegistryName("nickelblock");
    }
}
