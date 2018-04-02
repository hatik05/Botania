package vazkii.botania.common.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import vazkii.botania.api.BotaniaAPI;
import vazkii.botania.api.recipe.RecipeElvenTrade;
import vazkii.botania.common.block.ModBlocks;
import vazkii.botania.common.item.ModItems;
import vazkii.botania.common.lib.LibBlockNames;
import vazkii.botania.common.lib.LibMisc;
import vazkii.botania.common.lib.LibOreDict;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = LibMisc.MOD_ID)
@GameRegistry.ObjectHolder(LibMisc.MOD_ID)
public class ModElvenTradeRecipes {
	@GameRegistry.ObjectHolder("dreamwood")
	public static RecipeElvenTrade dreamwoodRecipe;
	
	@GameRegistry.ObjectHolder("pixie_dust")
	public static RecipeElvenTrade pixieDustRecipe;
	
	@GameRegistry.ObjectHolder("quartz_elven")
	public static RecipeElvenTrade elvenQuartzRecipe;
	
	@GameRegistry.ObjectHolder("elfglass")
	public static RecipeElvenTrade alfglassRecipe;
	
	@GameRegistry.ObjectHolder("elementium")
	public static RecipeElvenTrade elementiumRecipe;
	
	@GameRegistry.ObjectHolder("elementium_block")
	public static RecipeElvenTrade elementiumBlockRecipe;
	
	@GameRegistry.ObjectHolder("dragonstone")
	public static RecipeElvenTrade dragonstoneRecipe;
	
	@GameRegistry.ObjectHolder("dragonstone_block")
	public static RecipeElvenTrade dragonstoneBlockRecipe;
	
	@SubscribeEvent
	public static void register(RegistryEvent.Register<RecipeElvenTrade> evt) {
		evt.getRegistry().register(make("dreamwood", new ItemStack(ModBlocks.dreamwood), LibOreDict.LIVING_WOOD));
		evt.getRegistry().register(make("pixie_dust", new ItemStack(ModItems.pixieDust), LibOreDict.MANA_PEARL));
		evt.getRegistry().register(make("quartz_elven", new ItemStack(ModItems.elfQuartz), new ItemStack(Items.QUARTZ)));
		evt.getRegistry().register(make("elfglass", new ItemStack(ModBlocks.elfGlass), new ItemStack(ModBlocks.manaGlass)));
		evt.getRegistry().register(make("elementium", new ItemStack(ModItems.elementium), LibOreDict.MANA_STEEL, LibOreDict.MANA_STEEL));
		evt.getRegistry().register(make("elementium_block", new ItemStack(ModBlocks.elementiumBlock), new ItemStack(ModBlocks.manasteelBlock), new ItemStack(ModBlocks.manasteelBlock)));
		evt.getRegistry().register(make("dragonstone", new ItemStack(ModItems.dragonstone), LibOreDict.MANA_DIAMOND));
		evt.getRegistry().register(make("dragonstone_block", new ItemStack(ModBlocks.dragonstoneBlock), new ItemStack(ModBlocks.manaDiamondBlock)));
		evt.getRegistry().register(make("iron_ingot_dummy", new ItemStack(Items.IRON_INGOT), new ItemStack(Items.IRON_INGOT)));
		evt.getRegistry().register(make("iron_block_dummy", new ItemStack(Blocks.IRON_BLOCK), new ItemStack(Blocks.IRON_BLOCK)));
		evt.getRegistry().register(make("ender_pearl_dummy", new ItemStack(Items.ENDER_PEARL), new ItemStack(Items.ENDER_PEARL)));
		evt.getRegistry().register(make("diamond_dummy", new ItemStack(Items.DIAMOND), new ItemStack(Items.DIAMOND)));
		evt.getRegistry().register(make("diamond_block_dummy", new ItemStack(Blocks.DIAMOND_BLOCK), new ItemStack(Blocks.DIAMOND_BLOCK)));
	}
	
	private static RecipeElvenTrade make(String name, ItemStack out, Object... in) {
		return new RecipeElvenTrade(out, in).setRegistryName(LibMisc.MOD_ID, name);
	}
}
