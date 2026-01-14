package xyz.shockinteractive.betterpaintings.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import xyz.shockinteractive.betterpaintings.BetterPaintings;

public class ModItems {
    public static final Item MISSINGTEXTURE = registerItem("missingtexture", new Item(new FabricItemSettings()));
    public static final Item BETTERPAINTING = registerItem("betterpainting", new Item(new FabricItemSettings()));

    private static void addItemsToIndgredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(MISSINGTEXTURE);
        entries.add(BETTERPAINTING);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BetterPaintings.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BetterPaintings.LOGGER.info("Registering Items");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIndgredientTabItemGroup);
    }
}
