package io.github.ultreon.minechromatic.fabric;

import com.ultreon.devices.fabric.FabricApplicationRegistration;
import io.github.ultreon.minechromatic.MineChromaticAddon;

public class MineChromaticAppRegistration implements FabricApplicationRegistration {
    @Override
    public void registerApplications() {
        MineChromaticAddon.get().registerApps();
    }
}
