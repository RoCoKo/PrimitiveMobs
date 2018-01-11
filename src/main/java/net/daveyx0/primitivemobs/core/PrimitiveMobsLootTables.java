package net.daveyx0.primitivemobs.core;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class PrimitiveMobsLootTables {

	//Entity drops
	public static final ResourceLocation ENTITIES_CHAMELEON = new ResourceLocation(PrimitiveMobsReference.MODID + ":" + "entities/chameleon");
	public static final ResourceLocation ENTITIES_ROCKETCREEPER = new ResourceLocation(PrimitiveMobsReference.MODID + ":" + "entities/rocket_creeper");
	public static final ResourceLocation ENTITIES_FESTIVECREEPER = new ResourceLocation(PrimitiveMobsReference.MODID + ":" + "entities/festive_creeper");
	public static final ResourceLocation ENTITIES_SUPPORTCREEPER = new ResourceLocation(PrimitiveMobsReference.MODID + ":" + "entities/support_creeper");
	public static final ResourceLocation ENTITIES_BLAZINGJUGGERNAUT = new ResourceLocation(PrimitiveMobsReference.MODID + ":" + "entities/blazing_juggernaut");
	public static final ResourceLocation ENTITIES_LILYLURKER = new ResourceLocation(PrimitiveMobsReference.MODID + ":" + "entities/lily_lurker");
	public static final ResourceLocation ENTITIES_DODO = new ResourceLocation(PrimitiveMobsReference.MODID + ":" + "entities/dodo");
	public static final ResourceLocation ENTITIES_MIMIC = new ResourceLocation(PrimitiveMobsReference.MODID + ":" + "entities/mimic");
	
	//Mimic chest loot
	public static final ResourceLocation MIMIC_TREASURE= new ResourceLocation(PrimitiveMobsReference.MODID + ":" + "chests/mimic_treasure");
	public static final ResourceLocation MIMIC_TRAP = new ResourceLocation(PrimitiveMobsReference.MODID + ":" + "chests/mimic_trap");
	
    public static void preInit() {
    	registerLootTables();
    }

    public static void registerLootTables() {
    	LootTableList.register(ENTITIES_CHAMELEON);
    	LootTableList.register(ENTITIES_ROCKETCREEPER);
    	LootTableList.register(ENTITIES_FESTIVECREEPER);
    	LootTableList.register(ENTITIES_SUPPORTCREEPER);
    	LootTableList.register(ENTITIES_BLAZINGJUGGERNAUT);
    	LootTableList.register(ENTITIES_LILYLURKER);
    	LootTableList.register(ENTITIES_DODO);
    	LootTableList.register(ENTITIES_MIMIC);
    	
    	LootTableList.register(MIMIC_TREASURE);
    	LootTableList.register(MIMIC_TRAP);
    }

}
