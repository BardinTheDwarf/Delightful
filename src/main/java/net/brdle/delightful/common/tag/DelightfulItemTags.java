package net.brdle.delightful.common.tag;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import vectorwing.farmersdelight.FarmersDelight;
import vectorwing.farmersdelight.common.tag.ForgeTags;

public class DelightfulItemTags {

	// Delightful

	// FarmersDelight
	public static final TagKey<Item> CABINETS = bind(FarmersDelight.MODID, "cabinets");
	public static final TagKey<Item> CABINETS_WOODEN = bind(FarmersDelight.MODID, "cabinets/wooden");
	public static final TagKey<Item> CABINETS_STONE = bind(FarmersDelight.MODID, "cabinets/stone");

	// Ecologics
	public static final TagKey<Item> COOKED_PRICKLY_PEAR = bind("ecologics", "cooked_prickly_pear");

	// Forge
	public static final TagKey<Item> FRUITS = forge( "fruits");
	public static final TagKey<Item> FRUITS_APPLE = forge( "fruits/apple");
	public static final TagKey<Item> FRUITS_KIWI = forge( "fruits/kiwi");
	public static final TagKey<Item> FRUITS_MELON = forge( "fruits/melon");
	public static final TagKey<Item> FRUITS_CHORUS = forge( "fruits/chorus");
	public static final TagKey<Item> FRUITS_SWEET_BERRIES = forge( "fruits/sweet_berries");
	public static final TagKey<Item> FRUITS_GLOW_BERRIES = forge( "fruits/glow_berries");
	public static final TagKey<Item> FRUITS_SALMONBERRIES = forge( "fruits/salmonberries");
	public static final TagKey<Item> FRUITS_STRAWBERRIES = forge( "fruits/strawberries");
	public static final TagKey<Item> FRUITS_BANANA = forge( "fruits/banana");
	public static final TagKey<Item> FRUITS_SWEET = forge( "fruits/sweet");
	public static final TagKey<Item> FRUITS_PRICKLY_PEAR = forge( "fruits/prickly_pear");
	public static final TagKey<Item> FRUITS_BERRIES = forge( "fruits/berries");
	public static final TagKey<Item> CHEESE = forge( "cheese");
	public static final TagKey<Item> CHEESE_OR_MILK = forge( "cheese_or_milk");
	public static final TagKey<Item> COOKED_CRAB = forge( "cooked_crab");
	public static final TagKey<Item> NUTS = forge( "nuts");
	public static final TagKey<Item> NUTS_WALNUT = forge( "nuts/walnut");
	public static final TagKey<Item> NUTS_PEANUT = forge( "nuts/peanut");
	public static final TagKey<Item> SUGAR = forge( "sugar");
	public static final TagKey<Item> WATER = forge( "water");
	public static final TagKey<Item> INGOTS_STEEL = forge( "ingots/steel");
	public static final TagKey<Item> TEA_LEAVES_GREEN = forge( "tea_leaves/green");
	public static final TagKey<Item> JELLY = forge( "jelly");
	public static final TagKey<Item> RAW_FISHES_KOI = forge("raw_fishes/koi");
	public static final TagKey<Item> RAW_FISHES_GLOWFISH = forge("raw_fishes/glowfish");
	public static final TagKey<Item> CATTAIL = forge( "cattail");
	public static final TagKey<Item> GEMS_ROSE_QUARTZ = forge("gems/rose_quartz");

	// Minecraft

	private static TagKey<Item> forge(String name) {
		return bind("forge", name);
	}

	private static TagKey<Item> bind(String modid, String name) {
		return ItemTags.create(new ResourceLocation(modid, name));
	}
}
