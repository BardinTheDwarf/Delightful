package net.brdle.delightful.common.item;

import net.brdle.delightful.Delightful;
import net.brdle.delightful.Util;
import net.brdle.delightful.common.block.DelightfulBlocks;
import net.brdle.delightful.common.item.food.*;
import net.brdle.delightful.common.item.knife.*;
import net.brdle.delightful.common.item.knife.allthemodium.AllthemodiumKnifeItem;
import net.brdle.delightful.common.item.knife.create_sa.ExperienceKnifeItem;
import net.brdle.delightful.common.item.knife.create_sa.GildedQuartzKnifeItem;
import net.brdle.delightful.common.item.knife.forbidden_arcanus.DracoArcanusKnifeItem;
import net.brdle.delightful.common.item.knife.lolenderite.ObsdianInfusedEnderiteKnifeItem;
import net.brdle.delightful.common.item.knife.nethers_exoticism.KiwanoKnifeItem;
import net.brdle.delightful.common.item.knife.oresabovediamonds.LargeAmethystKnifeItem;
import net.brdle.delightful.common.item.knife.rootsclassic.LivingKnifeItem;
import net.brdle.delightful.common.item.knife.seeds.LeafKnifeItem;
import net.brdle.delightful.common.item.knife.twilightforest.FieryKnifeItem;
import net.brdle.delightful.common.item.knife.twilightforest.IronwoodKnifeItem;
import net.brdle.delightful.common.item.knife.twilightforest.SteeleafKnifeItem;
import net.brdle.delightful.compat.ArsNouveauCompat;
import net.brdle.delightful.compat.BYGCompat;
import net.brdle.delightful.data.DelightfulItemTags;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.FarmersDelight;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import vectorwing.farmersdelight.common.registry.ModEffects;
import vectorwing.farmersdelight.common.registry.ModItems;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Supplier;

public class DelightfulItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Delightful.MODID);

    // Crafting Items (can be food)
    public static final RegistryObject<Item> ANIMAL_FAT = registerFood("animal_fat", FoodValues.ANIMAL_FAT);
    public static final RegistryObject<Item> ANIMAL_OIL_BOTTLE = registerItem("animal_oil_bottle", () -> new FurnaceFuelItem((new Item.Properties()).craftRemainder(Items.GLASS_BOTTLE).tab(FarmersDelight.CREATIVE_TAB), 3200));
    public static final RegistryObject<Item> ACORN = registerFood("acorn",
        FoodValues.ACORN);
    public static final RegistryObject<Item> SALMONBERRIES = registerFood("salmonberries",
        FoodValues.SALMONBERRIES);
    public static final RegistryObject<Item> SALMONBERRY_PIPS = registerItem("salmonberry_pips", () -> new ItemNameBlockItem(DelightfulBlocks.SALMONBERRY_BUSH.get(), (new Item.Properties()).tab(FarmersDelight.CREATIVE_TAB)));
    public static final RegistryObject<Item> SALMONBERRY_PIE = registerItem("salmonberry_pie", () -> new BlockItem(DelightfulBlocks.SALMONBERRY_PIE.get(), (new Item.Properties()).tab(FarmersDelight.CREATIVE_TAB)));
    public static final RegistryObject<Item> SALMONBERRY_PIE_SLICE = registerFood("salmonberry_pie_slice",
        vectorwing.farmersdelight.common.FoodValues.PIE_SLICE);
    public static final RegistryObject<Item> PUMPKIN_PIE_SLICE = registerFood("pumpkin_pie_slice",
        vectorwing.farmersdelight.common.FoodValues.PIE_SLICE);
    public static final RegistryObject<Item> SOURCE_BERRY_PIE_SLICE = registerCompatFood(ArsNouveauCompat.slice, ArsNouveauCompat.modid,
        ArsNouveauCompat.getPieSlice().get());
    public static final RegistryObject<Item> BLUEBERRY_PIE_SLICE = registerCompatFood(BYGCompat.blueberry_pie_slice, BYGCompat.modid,
        BYGCompat.BLUEBERRY_PIE_SLICE.get());
    public static final RegistryObject<Item> GREEN_APPLE_PIE_SLICE = registerCompatFood(BYGCompat.green_apple_pie_slice, BYGCompat.modid,
        BYGCompat.GREEN_APPLE_PIE_SLICE.get());
    public static final RegistryObject<Item> NIGHTSHADE_BERRY_PIE_SLICE = registerCompatFood(BYGCompat.nightshade_berry_pie_slice, BYGCompat.modid,
        BYGCompat.NIGHTSHADE_BERRY_PIE_SLICE.get());
    public static final RegistryObject<Item> CRIMSON_BERRY_PIE_SLICE = registerCompatFood(BYGCompat.crimson_berry_pie_slice, BYGCompat.modid,
        BYGCompat.CRIMSON_BERRY_PIE_SLICE.get());
    public static final RegistryObject<Item> GREEN_TEA_LEAF = registerFood("green_tea_leaf",
        FoodValues.GREEN_TEA_LEAF);
    public static final RegistryObject<Item> MATCHA = registerItem("matcha", () -> new DescriptItem((new Item.Properties()).tab(FarmersDelight.CREATIVE_TAB), Component.translatable("delightful.matcha.desc").withStyle(ChatFormatting.GRAY)));
    public static final RegistryObject<Item> MATCHA_ICE_CREAM = registerItem("matcha_ice_cream", () -> new BowlFoodItem((new Item.Properties()).food(FoodValues.MATCHA_ICE_CREAM).craftRemainder(Items.BOWL).stacksTo(1).tab(FarmersDelight.CREATIVE_TAB)));
    public static final RegistryObject<Item> SALMONBERRY_ICE_CREAM = registerItem("salmonberry_ice_cream", () -> new BowlFoodItem((new Item.Properties()).food(FoodValues.SALMONBERRY_ICE_CREAM).craftRemainder(Items.BOWL).stacksTo(1).tab(FarmersDelight.CREATIVE_TAB)));
    public static final RegistryObject<Item> COCONUT_CURRY = registerCompatItem("coconut_curry", "ecologics",
        () -> new BowlFoodItem((new Item.Properties()).food(FoodValues.COCONUT_CURRY).stacksTo(16).craftRemainder(Items.BOWL).tab(FarmersDelight.CREATIVE_TAB)),
        () -> new BowlFoodItem((new Item.Properties()).food(FoodValues.COCONUT_CURRY).stacksTo(16).craftRemainder(Items.BOWL)));
    public static final RegistryObject<Item> SINIGANG = registerItem("sinigang",
        () -> new BowlFoodItem((new Item.Properties()).food(FoodValues.COCONUT_CURRY).craftRemainder(Items.BOWL).tab(FarmersDelight.CREATIVE_TAB)));
    public static final RegistryObject<Item> CHOPPED_CLOVER = registerFood("chopped_clover", FoodValues.CHOPPED_CLOVER);
    public static final RegistryObject<Item> CACTUS_FLESH = registerFood("cactus_flesh", FoodValues.CACTUS_FLESH);
    public static final RegistryObject<Item> CACTUS_STEAK = registerFood("cactus_steak", FoodValues.CACTUS_STEAK);
    public static final RegistryObject<Item> FIELD_SALAD = registerFood("field_salad", FoodValues.FIELD_SALAD, Items.BOWL);
    public static final RegistryObject<Item> AZALEA_TEA = registerCompatItem("azalea_tea", "ecologics",
      () -> new CaffeinatedItem((new Item.Properties()).craftRemainder(Items.GLASS_BOTTLE).stacksTo(16).tab(FarmersDelight.CREATIVE_TAB), () -> MobEffects.SATURATION, 100, 1, 2.0F, 1),
      () -> new CaffeinatedItem((new Item.Properties()).craftRemainder(Items.GLASS_BOTTLE).stacksTo(16), () -> MobEffects.SATURATION, 100, 1, 2.0F, 1));
    public static final RegistryObject<Item> LAVENDER_TEA = registerCompatItem("lavender_tea", "biomesoplenty",
      () -> new CaffeinatedItem((new Item.Properties()).craftRemainder(Items.GLASS_BOTTLE).stacksTo(16).tab(FarmersDelight.CREATIVE_TAB), () -> MobEffects.REGENERATION, 100, 1, 2.0F, 1),
      () -> new CaffeinatedItem((new Item.Properties()).craftRemainder(Items.GLASS_BOTTLE).stacksTo(16), () -> MobEffects.SATURATION, 100, 1, 2.0F, 1));
    public static final RegistryObject<Item> PRICKLY_PEAR_JUICE = registerCompatItem("prickly_pear_juice", "ecologics",
      () -> new DrinkItem((new Item.Properties()).craftRemainder(Items.GLASS_BOTTLE).stacksTo(16).tab(FarmersDelight.CREATIVE_TAB), () -> MobEffects.SATURATION, 400, 1),
      () -> new DrinkItem((new Item.Properties()).craftRemainder(Items.GLASS_BOTTLE).stacksTo(16), () -> MobEffects.SATURATION, 400, 1));
    public static final RegistryObject<Item> ENDER_NECTAR = registerItem("ender_nectar",
      () -> new EnderNectarItem((new Item.Properties()).craftRemainder(Items.GLASS_BOTTLE).stacksTo(16).tab(FarmersDelight.CREATIVE_TAB)));
    public static final RegistryObject<Item> MATCHA_LATTE = registerItem("matcha_latte",
      () -> new CaffeinatedItem((new Item.Properties()).craftRemainder(Items.GLASS_BOTTLE).stacksTo(16).tab(FarmersDelight.CREATIVE_TAB), ModEffects.COMFORT, 1200, 1, 2.0F, 7));
    public static final RegistryObject<Item> BERRY_MATCHA_LATTE = registerItem("berry_matcha_latte",
      () -> new CaffeinatedItem((new Item.Properties()).craftRemainder(Items.GLASS_BOTTLE).stacksTo(16).tab(FarmersDelight.CREATIVE_TAB), ModEffects.COMFORT, 1800, 1, 2.0F, 9));
    public static final RegistryObject<Item> JELLY_BOTTLE = registerItem("jelly_bottle",
      () -> new ConsumableItem((new Item.Properties())
        .food(FoodValues.JELLY_BOTTLE).craftRemainder(Items.GLASS_BOTTLE).tab(FarmersDelight.CREATIVE_TAB)));
    public static final RegistryObject<Item> GLOW_JELLY_BOTTLE = registerItem("glow_jelly_bottle",
      () -> new ConsumableItem((new Item.Properties())
        .food(FoodValues.GLOW_JELLY_BOTTLE).craftRemainder(Items.GLASS_BOTTLE).tab(FarmersDelight.CREATIVE_TAB)));
    public static final RegistryObject<Item> NUT_BUTTER_BOTTLE = registerItem("nut_butter_bottle",
      () -> new ConsumableItem((new Item.Properties())
        .food(FoodValues.NUT_BUTTER_BOTTLE).craftRemainder(Items.GLASS_BOTTLE).tab(FarmersDelight.CREATIVE_TAB)));
    public static final RegistryObject<Item> NUT_BUTTER_AND_JELLY_SANDWICH = registerItem("nut_butter_and_jelly_sandwich",
      () -> new ConsumableItem((new Item.Properties()).food(FoodValues.NUT_BUTTER_AND_JELLY_SANDWICH).tab(FarmersDelight.CREATIVE_TAB), true));
    public static final RegistryObject<Item> CHEESEBURGER = registerItem("cheeseburger",
      () -> new ConsumableItem((new Item.Properties()).food(FoodValues.CHEESEBURGER).tab(FarmersDelight.CREATIVE_TAB), true));
    public static final RegistryObject<Item> DELUXE_CHEESEBURGER = registerItem("deluxe_cheeseburger",
      () -> new ConsumableItem((new Item.Properties()).food(FoodValues.DELUXE_CHEESEBURGER).tab(FarmersDelight.CREATIVE_TAB), true));
    public static final RegistryObject<Item> CHUNKWICH = registerCompatFood("chunkwich", "rottenleather",
        FoodValues.CHUNKWICH);
    public static final RegistryObject<Item> CHUNK_NUGGET = registerFood("chunk_nugget",
        FoodValues.CHUNK_NUGGET);
    public static final RegistryObject<Item> ROCK_CANDY = registerFood("rock_candy", FoodValues.ROCK_CANDY, Items.STICK);
    public static final RegistryObject<Item> MARSHMALLOW_STICK = registerFood("marshmallow_stick",
        FoodValues.MARSHMALLOW_STICK, Items.STICK);
    public static final RegistryObject<Item> COOKED_MARSHMALLOW_STICK = registerFood("cooked_marshmallow_stick",
        FoodValues.COOKED_MARSHMALLOW_STICK, Items.STICK);
    public static final RegistryObject<Item> SMORE = registerFood("smore",
        FoodValues.SMORE);
    public static final RegistryObject<Item> CRAB_RANGOON = registerFood("crab_rangoon",
        FoodValues.CRAB_RANGOON);
    public static final RegistryObject<Item> HONEY_GLAZED_WALNUT = registerFood("honey_glazed_walnut",
        FoodValues.HONEY_GLAZED_WALNUT);
    public static final RegistryObject<Item> VENISON_CHOPS = registerFood("venison_chops",
        FoodValues.VENISON_CHOPS);
    public static final RegistryObject<Item> COOKED_VENISON_CHOPS = registerFood("cooked_venison_chops",
        FoodValues.COOKED_VENISON_CHOPS);
    public static final RegistryObject<Item> RAW_GOAT = registerFood("raw_goat",
        FoodValues.RAW_GOAT);
    public static final RegistryObject<Item> COOKED_GOAT = registerFood("cooked_goat",
        FoodValues.COOKED_GOAT);
    public static final RegistryObject<Item> CANTALOUPE_SLICE = registerFood("cantaloupe_slice",
        FoodValues.CANTALOUPE_SLICE);
    public static final RegistryObject<Item> CANTALOUPE = registerItem("cantaloupe", () ->
        new BlockItem(DelightfulBlocks.CANTALOUPE.get(), (new Item.Properties()).tab(FarmersDelight.CREATIVE_TAB)));
    public static final RegistryObject<Item> MINI_MELON = registerItem("mini_melon", () ->
        new BlockItem(DelightfulBlocks.MINI_MELON.get(), (new Item.Properties()).tab(FarmersDelight.CREATIVE_TAB)));
    public static final RegistryObject<Item> SALMONBERRY_SACK = registerItem("salmonberry_sack", () ->
        new BlockItem(DelightfulBlocks.SALMONBERRY_SACK.get(), (new Item.Properties()).tab(FarmersDelight.CREATIVE_TAB)));
    public static final RegistryObject<Item> ACORN_SACK = registerItem("acorn_sack", () ->
        new BlockItem(DelightfulBlocks.ACORN_SACK.get(), (new Item.Properties()).tab(FarmersDelight.CREATIVE_TAB)));

    // Cabinets
    public static final RegistryObject<Item> QUARTZ_CABINET = registerItem("quartz_cabinet",
            () -> new BlockItem(DelightfulBlocks.QUARTZ_CABINET.get(), (new Item.Properties()).tab(FarmersDelight.CREATIVE_TAB)));
    public static final RegistryObject<Item> BASALT_CABINET = registerItem("basalt_cabinet",
            () -> new BlockItem(DelightfulBlocks.BASALT_CABINET.get(), (new Item.Properties()).tab(FarmersDelight.CREATIVE_TAB)));

    // Knives
    public static final RegistryObject<Item> BONE_KNIFE = registerKnife("bone", Tags.Items.BONES);
    public static final RegistryObject<Item> AMETHYST_KNIFE = registerGemKnife("amethyst");
    public static final RegistryObject<Item> EMERALD_KNIFE = registerGemKnife("emerald");
    public static final RegistryObject<Item> COPPER_KNIFE = registerIngotKnife("copper");
    public static final RegistryObject<Item> LAPIS_LAZULI_KNIFE = registerKnife("lapis_lazuli", Tags.Items.GEMS_LAPIS);

    public static final RegistryObject<Item> BLACK_OPAL_KNIFE = registerGemKnife("black_opal");
    public static final RegistryObject<Item> TIN_KNIFE = registerIngotKnife("tin");
    public static final RegistryObject<Item> STEEL_KNIFE = registerIngotKnife("steel");
    public static final RegistryObject<Item> SILVER_KNIFE = registerIngotKnife("silver");
    public static final RegistryObject<Item> BRASS_KNIFE = registerIngotKnife("brass");
    public static final RegistryObject<Item> BRONZE_KNIFE = registerIngotKnife("bronze");
    public static final RegistryObject<Item> CONSTANTAN_KNIFE = registerIngotKnife("constantan");
    public static final RegistryObject<Item> ELECTRUM_KNIFE = registerIngotKnife("electrum");
    public static final RegistryObject<Item> INVAR_KNIFE = registerIngotKnife("invar");
    public static final RegistryObject<Item> LEAD_KNIFE = registerIngotKnife("lead");
    public static final RegistryObject<Item> NICKEL_KNIFE = registerIngotKnife("nickel");
    public static final RegistryObject<Item> ZINC_KNIFE = registerIngotKnife("zinc");

    public static final RegistryObject<Item> MYTHRIL_KNIFE = registerCompatKnife("mythril", "simpleores", ingot("mythril"));
    public static final RegistryObject<Item> ADAMANTIUM_KNIFE = registerCompatKnife("adamantium", "simpleores", ingot("adamantium"));
    public static final RegistryObject<Item> ONYX_KNIFE = registerCompatKnife("onyx", "simpleores", gem("onyx"));
    public static final RegistryObject<Item> THYRIUM_KNIFE = registerCompatKnife("thyrium", "fusion", ingot("thyrium"));
    public static final RegistryObject<Item> SINISITE_KNIFE = registerCompatKnife("sinisite", "fusion", ingot("sinisite"));
    public static final RegistryObject<Item> ALLTHEMODIUM_KNIFE = registerItem("allthemodium_knife", () -> new AllthemodiumKnifeItem((new Item.Properties()).tab(FarmersDelight.CREATIVE_TAB)));
    public static final RegistryObject<Item> ENDERITE_KNIFE = registerSmithedKnife("enderite",
        Util.ing(ModItems.NETHERITE_KNIFE), ingot("enderite"));
    public static final RegistryObject<Item> DEORUM_KNIFE = registerCompatKnife("deorum", "forbidden_arcanus", ingot("deorum"));
    public static final RegistryObject<Item> REINFORCED_DEORUM_KNIFE = registerSmithedKnife("reinforced_deorum", Util.ing(DEORUM_KNIFE), DelightfulItemTags.STELLARITE_PIECE, "forbidden_arcanus");
    public static final RegistryObject<Item> DRACO_ARCANUS_KNIFE = registerItem("draco_arcanus_knife", () -> new DracoArcanusKnifeItem((new Item.Properties()).tab(FarmersDelight.CREATIVE_TAB)));
    public static final RegistryObject<Item> OSMIUM_KNIFE = registerCompatKnife("osmium", "mekanismtools", ingot("osmium"));
    public static final RegistryObject<Item> REFINED_GLOWSTONE_KNIFE = registerCompatKnife("refined_glowstone", "mekanismtools", ingot("refined_glowstone"));
    public static final RegistryObject<Item> REFINED_OBSIDIAN_KNIFE = registerCompatKnife("refined_obsidian", "mekanismtools", ingot("refined_obsidian"));
    public static final RegistryObject<Item> OBSIDIAN_INFUSED_ENDERITE_KNIFE = registerItem("obsidian_infused_enderite_knife", () -> new ObsdianInfusedEnderiteKnifeItem((new Item.Properties()).tab(FarmersDelight.CREATIVE_TAB)));
    public static final RegistryObject<Item> NETHERITE_OPAL_KNIFE = registerSmithedKnife("netherite_opal",
        Util.ing(BLACK_OPAL_KNIFE), Tags.Items.INGOTS_NETHERITE, "oresabovediamonds");
    public static final RegistryObject<Item> LARGE_AMETHYST_KNIFE = registerItem("large_amethyst_knife", () -> new LargeAmethystKnifeItem((new Item.Properties()).tab(FarmersDelight.CREATIVE_TAB)));
    public static final RegistryObject<Item> FIERY_KNIFE = registerItem("fiery_knife", () -> new FieryKnifeItem((new Item.Properties()).tab(FarmersDelight.CREATIVE_TAB)));
    public static final RegistryObject<Item> IRONWOOD_KNIFE = registerItem("ironwood_knife", () -> new IronwoodKnifeItem((new Item.Properties()).tab(FarmersDelight.CREATIVE_TAB)));
    public static final RegistryObject<Item> KNIGHTMETAL_KNIFE = registerCompatKnife("knightmetal", "twilightforest", ingot("knightmetal"), Component.translatable("item.twilightforest.knightmetal_sword.tooltip").withStyle(ChatFormatting.GRAY));
    public static final RegistryObject<Item> STEELEAF_KNIFE = registerItem("steeleaf_knife", () -> new SteeleafKnifeItem((new Item.Properties()).tab(FarmersDelight.CREATIVE_TAB)));
    public static final RegistryObject<Item> LIVING_KNIFE = registerItem("living_knife", () -> new LivingKnifeItem((new Item.Properties()).tab(FarmersDelight.CREATIVE_TAB)));
    public static final RegistryObject<Item> PENDORITE_KNIFE = registerSmithedKnife("pendorite", Util.ing(ModItems.NETHERITE_KNIFE), ingot("pendorite"), BYGCompat.modid);
    public static final RegistryObject<Item> WARDEN_KNIFE = registerItem("warden_knife", () -> new CompatKnifeItem("deeperdarker", DelightfulItemTags.REINFORCED_ECHO_SHARD, DelightfulTiers.WARDEN, (new Item.Properties()).tab(FarmersDelight.CREATIVE_TAB), Util.ing(ModItems.NETHERITE_KNIFE::get), ChatFormatting.LIGHT_PURPLE));
    public static final RegistryObject<Item> EXPERIENCE_KNIFE = registerItem("experience_knife", () -> new ExperienceKnifeItem((new Item.Properties()).tab(FarmersDelight.CREATIVE_TAB)));
    public static final RegistryObject<Item> GILDED_QUARTZ_KNIFE = registerItem("gilded_quartz_knife", () -> new GildedQuartzKnifeItem((new Item.Properties()).tab(FarmersDelight.CREATIVE_TAB)));
    public static final RegistryObject<Item> LEAF_KNIFE = registerItem("leaf_knife", () -> new LeafKnifeItem((new Item.Properties()).tab(FarmersDelight.CREATIVE_TAB)));
    public static final RegistryObject<Item> KIWANO_KNIFE = registerItem("kiwano_knife", () -> new KiwanoKnifeItem((new Item.Properties()).tab(FarmersDelight.CREATIVE_TAB)));

    // Registers a knife to Farmer's Delight tab, requiring modid
    public static RegistryObject<Item> registerCompatKnife(String name, String modid, TagKey<Item> tag, Component... tool) {
        if (tool.length > 0) {
            return registerItem(name + "_knife", () -> new CompatKnifeItem(modid, tag, DelightfulTiers.valueOf(name.toUpperCase(Locale.ROOT)), (new Item.Properties()).tab(FarmersDelight.CREATIVE_TAB), tool[0], null));
        } else {
            return registerItem(name + "_knife", () -> new CompatKnifeItem(modid, tag, DelightfulTiers.valueOf(name.toUpperCase(Locale.ROOT)), (new Item.Properties()).tab(FarmersDelight.CREATIVE_TAB), null));
        }
    }

    // Registers a knife to Farmer's Delight tab, requiring non-empty ingot tag
    public static RegistryObject<Item> registerIngotKnife(String name) {
        return registerItem(name + "_knife", () -> new DelightfulKnifeItem(ingot(name), DelightfulTiers.valueOf(name.toUpperCase(Locale.ROOT)), (new Item.Properties()).tab(FarmersDelight.CREATIVE_TAB), null));
    }

    // Registers a knife to Farmer's Delight tab, requiring non-empty gem tag
    public static RegistryObject<Item> registerGemKnife(String name) {
        return registerItem(name + "_knife", () -> new DelightfulKnifeItem(gem(name), DelightfulTiers.valueOf(name.toUpperCase(Locale.ROOT)), (new Item.Properties()).tab(FarmersDelight.CREATIVE_TAB), null));
    }

    // Registers a knife to Farmer's Delight tab, requiring non-empty ingot tag
    public static RegistryObject<Item> registerSmithedKnife(String name, Supplier<Ingredient> base, TagKey<Item> addition, String... modid) {
        if (modid.length > 0) {
            return registerItem(name + "_knife", () -> new CompatKnifeItem(modid[0], addition, DelightfulTiers.valueOf(name.toUpperCase(Locale.ROOT)), (new Item.Properties()).tab(FarmersDelight.CREATIVE_TAB), base));
        } else {
            return registerItem(name + "_knife", () -> new DelightfulKnifeItem(addition, DelightfulTiers.valueOf(name.toUpperCase(Locale.ROOT)), (new Item.Properties()).tab(FarmersDelight.CREATIVE_TAB), base));
        }
    }

    // Registers a knife to Farmer's Delight tab
    public static RegistryObject<Item> registerKnife(String name, TagKey<Item> tag) {
        return registerItem(name + "_knife", () -> new DelightfulKnifeItem(tag, DelightfulTiers.valueOf(name.toUpperCase(Locale.ROOT)), (new Item.Properties()).tab(FarmersDelight.CREATIVE_TAB), null));
    }

    // Registers a food to Farmer's Delight tab, optional craftRemainder
    public static RegistryObject<Item> registerFood(String name, FoodProperties food, Item... remainder) {
        if (remainder.length > 0) {
            if (remainder[0].equals(Items.BOWL)) {
                return registerItem(name,
                    () -> new BowlFoodItem((new Item.Properties()).food(food).craftRemainder(Items.BOWL).tab(FarmersDelight.CREATIVE_TAB)));
            }
            return registerItem(name,
                () -> new ConsumableItem((new Item.Properties()).food(food).craftRemainder(remainder[0]).tab(FarmersDelight.CREATIVE_TAB)));
        }
        return registerItem(name, (new Item.Properties()).food(food).tab(FarmersDelight.CREATIVE_TAB));
    }

    // Sets creative tab to Farmer's Delight
    public static RegistryObject<Item> registerItem(String name, Item.Properties props) {
        return registerItem(name, () -> new Item(props.tab(FarmersDelight.CREATIVE_TAB)));
    }

    // Sets no creative tab
    public static RegistryObject<Item> registerCompatFood(String name, String modid, FoodProperties food) {
        if (ModList.get().isLoaded(modid)) {
            return registerItem(name, () -> new Item((new Item.Properties().food(food).tab(FarmersDelight.CREATIVE_TAB))));
        }
        return registerItem(name, () -> new Item((new Item.Properties().food(food))));
    }

    // Sets no creative tab
    public static RegistryObject<Item> registerCompatItem(String name, String modid, Supplier<Item> loaded, Supplier<Item> notLoaded) {
        if (ModList.get().isLoaded(modid)) {
            return registerItem(name, loaded);
        }
        return registerItem(name, notLoaded);
    }

    // Creative tab should be set before calling this function
    public static RegistryObject<Item> registerItem(String name, Supplier<Item> item) {
        return ITEMS.register(name, item);
    }

    public static TagKey<Item> ingot(String name) {
        return Util.it("forge", "ingots/" + name);
    }

    public static TagKey<Item> gem(String name) {
        return Util.it("forge", "gems/" + name);
    }

    public static Supplier<Ingredient> getIngot(String name) {
        return Util.ing(ingot(name));
    }

    public static Supplier<Ingredient> getGem(String name) {
        return Util.ing(gem(name));
    }

    public static void create(IEventBus bus) {
        ITEMS.register(bus);
    }
}