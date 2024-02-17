package io.github.ultreon.minechromatic.fabric;

import com.ultreon.devices.fabric.FabricApplicationRegistration;
import io.github.ultreon.minechromatic.MineChromaticAddon;
import net.fabricmc.api.ModInitializer;

public class MineChromaticAddonFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        MineChromaticAddon.get().init();
    }
}