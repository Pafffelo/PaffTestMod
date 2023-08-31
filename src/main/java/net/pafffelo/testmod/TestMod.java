package net.pafffelo.testmod;

import net.fabricmc.api.ModInitializer;
import net.pafffelo.testmod.block.ModBlocks;
import net.pafffelo.testmod.item.ModItemGroups;
import net.pafffelo.testmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
	public static final String MOD_ID = "testmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing test mod shit!");
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}