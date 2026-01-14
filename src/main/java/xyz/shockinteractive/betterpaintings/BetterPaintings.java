package xyz.shockinteractive.betterpaintings;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.shockinteractive.betterpaintings.item.ModItems;

public class BetterPaintings implements ModInitializer {
	public static final String MOD_ID = "better-paintings";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}