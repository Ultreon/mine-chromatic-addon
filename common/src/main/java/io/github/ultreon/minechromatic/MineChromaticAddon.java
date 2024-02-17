package io.github.ultreon.minechromatic;

import com.ultreon.devices.Reference;
import com.ultreon.devices.api.ApplicationManager;
import io.github.ultreon.minechromatic.programs.browser.WebBrowser;
import net.minecraft.resources.ResourceLocation;

public class MineChromaticAddon {
    public static final String MOD_ID = "mine_chromatic";

    private static MineChromaticAddon instance;

    public void init() {

    }

    public static synchronized MineChromaticAddon get() {
        if (instance == null)
            instance = new MineChromaticAddon();

        return instance;
    }

    public void registerApps() {
        ApplicationManager.registerApplication(new ResourceLocation(MOD_ID, "browser"), () -> WebBrowser::new, false);
    }
}
