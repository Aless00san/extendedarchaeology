package net.alpaca.extendedarchaeology;

import net.alpaca.extendedarchaeology.block.AncientStone;
import net.alpaca.extendedarchaeology.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {
	//TODO: Rename class to fit mod Name

	// This logger is used to write text to the console and the log file.
    public static final Logger LOGGER = LoggerFactory.getLogger("extendedarchaeology");
	public static final String MOD_ID = "extendedarchaeology";

	public static final AncientStone ancientStone = new AncientStone(Blocks.GRAVEL, FabricBlockSettings.copy(Blocks.STONE), SoundEvents.ITEM_BRUSH_BRUSHING_GENERIC,SoundEvents.ITEM_BRUSH_BRUSHING_SAND_COMPLETE);


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric! From the archaeology guild");

		//TODO: Move Item Registries to according class
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "ancient_stone"), ancientStone);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "ancient_stone"), new BlockItem(ancientStone, new Item.Settings()));

		ModItems.registerModItems();
	}
}