package com.modirk;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import com.modirk.registry.ModItems;

@Mod("modirk")
public class MainMod {
    public static final String MODID = "modirk";

    public MainMod() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(modBus);
    }
}
