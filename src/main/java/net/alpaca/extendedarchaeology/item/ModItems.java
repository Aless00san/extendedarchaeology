package net.alpaca.extendedarchaeology.item;

import net.alpaca.extendedarchaeology.ExampleMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.ArrayList;

public class ModItems {
    //The registry of items is done here
    public static final Item ANCIENT_WEAPON = registerItem("ancient_weapon", new SwordItem(ModToolMaterials.ANCIENT, 8, 0.5F, new FabricItemSettings()));
    public static final Item ANCIENT_WEAPON_PART_1 = registerItem("ancient_weapon_part_1", new Item(new Item.Settings()));
    public static final Item ANCIENT_WEAPON_PART_2 = registerItem("ancient_weapon_part_2", new Item(new Item.Settings()));
    public static final Item ANCIENT_SMITHING_TEMPLATE = registerItem("ancient_smithing_template", new ModSmithingTemplate());

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(ExampleMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        ExampleMod.LOGGER.info("Performing mod item registration");
    }
}
