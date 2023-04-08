package net.vamsi.copper_works.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vamsi.copper_works.Copper_Works;
import net.vamsi.copper_works.item.custom.ModAxeItem;
import net.vamsi.copper_works.item.custom.ModHoeItem;
import net.vamsi.copper_works.item.custom.ModPickaxeItem;

public class ModItems {

    public static final Item COPPER_NUGGET = registerItem("copper_nugget", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item COPPER_SWORD = registerItem("copper_sword", new SwordItem(ModToolMaterial.COPPER, 3, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel", new ShovelItem(ModToolMaterial.COPPER, 1.5F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe", new ModPickaxeItem(ModToolMaterial.COPPER, 1, -2.8F, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item COPPER_AXE = registerItem("copper_axe", new ModAxeItem(ModToolMaterial.COPPER, 6.5F, -3.2F, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item COPPER_HOE = registerItem("copper_hoe", new ModHoeItem(ModToolMaterial.COPPER, -2, -1.5F, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item COPPER_HELMET = registerItem("copper_helmet", new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate", new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlot.CHEST, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item IRON_LEGGINGS = registerItem("copper_leggings", new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlot.LEGS, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item IRON_BOOTS = registerItem("copper_boots", new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlot.FEET, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item COPPER_HORSE_ARMOR = registerItem("copper_horse_armor", new HorseArmorItem(4, "copper", new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(Copper_Works.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod items for " + Copper_Works.MOD_ID);
    }

}
