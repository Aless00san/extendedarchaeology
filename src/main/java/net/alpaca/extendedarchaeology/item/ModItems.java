package net.alpaca.extendedarchaeology.item;

import net.alpaca.extendedarchaeology.ExampleMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //TODO: Do the registry of items here
    public static final Item ANCIENT_WEAPON = registerItem("ancient_weapon", new SwordItem(ModToolMaterials.ANCIENT, 8, 0.5F, new FabricItemSettings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(ExampleMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        ExampleMod.LOGGER.info("Performing mod item registration");
    }
}
