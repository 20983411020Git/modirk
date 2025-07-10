package com.modirk.registry;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import com.modirk.MainMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MainMod.MODID);

    public static final RegistryObject<Item> REDSTONE_RUHU = ITEMS.register("redstone_ruhu",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.EPIC)
            ));
    public static final RegistryObject<Item> BUILDER_RUHU = ITEMS.register("builder_ruhu",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.EPIC)
            ));
    public static final RegistryObject<Item> PVP_RUHU = ITEMS.register("pvp_ruhu",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.EPIC)
            ));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
