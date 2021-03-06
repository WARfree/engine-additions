package com.warfree.engineadditions;

import com.warfree.engineadditions.blocks.*;
import com.warfree.engineadditions.items.*;
import com.warfree.engineadditions.setup.ClientProxy;
import com.warfree.engineadditions.setup.IProxy;
import com.warfree.engineadditions.setup.ModSetup;
import com.warfree.engineadditions.setup.ServerProxy;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("engineadditions")
public class EngineAdditions {

    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());

    public static ModSetup setup = new ModSetup();

    private static final Logger LOGGER = LogManager.getLogger();

    public EngineAdditions() {

        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        setup.init();
        proxy.init();
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(new AluminumBlock());
            event.getRegistry().register(new CopperBlock());
            event.getRegistry().register(new LeadBlock());
            event.getRegistry().register(new NickelBlock());
            event.getRegistry().register(new SilverBlock());
            event.getRegistry().register(new TinBlock());
            event.getRegistry().register(new AluminumOre());
            event.getRegistry().register(new CopperOre());
            event.getRegistry().register(new LeadOre());
            event.getRegistry().register(new NickelOre());
            event.getRegistry().register(new SilverOre());
            event.getRegistry().register(new TinOre());
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties()
                    .group(setup.itemGroup);
            event.getRegistry().register(new BlockItem(ModBlocks.ALUMINUMBLOCK, properties).setRegistryName("aluminumblock"));
            event.getRegistry().register(new BlockItem(ModBlocks.COPPERBLOCK, properties).setRegistryName("copperblock"));
            event.getRegistry().register(new BlockItem(ModBlocks.LEADBLOCK, properties).setRegistryName("leadblock"));
            event.getRegistry().register(new BlockItem(ModBlocks.NICKELBLOCK, properties).setRegistryName("nickelblock"));
            event.getRegistry().register(new BlockItem(ModBlocks.SILVERBLOCK, properties).setRegistryName("silverblock"));
            event.getRegistry().register(new BlockItem(ModBlocks.TINBLOCK, properties).setRegistryName("tinblock"));
            event.getRegistry().register(new BlockItem(ModBlocks.ALUMINUMORE, properties).setRegistryName("aluminumore"));
            event.getRegistry().register(new BlockItem(ModBlocks.COPPERORE, properties).setRegistryName("copperore"));
            event.getRegistry().register(new BlockItem(ModBlocks.LEADORE, properties).setRegistryName("leadore"));
            event.getRegistry().register(new BlockItem(ModBlocks.NICKELORE, properties).setRegistryName("nickelore"));
            event.getRegistry().register(new BlockItem(ModBlocks.SILVERORE, properties).setRegistryName("silverore"));
            event.getRegistry().register(new BlockItem(ModBlocks.TINORE, properties).setRegistryName("tinore"));
            event.getRegistry().register(new AluminumIngot());
            event.getRegistry().register(new CopperIngot());
            event.getRegistry().register(new LeadIngot());
            event.getRegistry().register(new NickelIngot());
            event.getRegistry().register(new SilverIngot());
            event.getRegistry().register(new TinIngot());
        }
    }
}
