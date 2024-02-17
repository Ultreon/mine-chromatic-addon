package io.github.ultreon.minechromatic.forge;

import com.ultreon.devices.forge.ForgeApplicationRegistration;
import dev.architectury.platform.forge.EventBuses;
import io.github.ultreon.minechromatic.MineChromaticAddon;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MineChromaticAddon.MOD_ID)
public class MineChromaticAddonForge {
    public MineChromaticAddonForge() {
        // Submit our event bus to let architectury register our content on the right time
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        EventBuses.registerModEventBus(MineChromaticAddon.MOD_ID, modEventBus);

        modEventBus.<ForgeApplicationRegistration>addListener(event -> {
            MineChromaticAddon.get().registerApps();
        });
    }
}