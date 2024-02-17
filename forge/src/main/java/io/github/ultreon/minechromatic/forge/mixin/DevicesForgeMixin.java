package io.github.ultreon.minechromatic.forge.mixin;

import io.github.ultreon.minechromatic.MineChromaticAddon;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(targets = "com.ultreon.devices.forge.DevicesForge$1", remap = false)
public class DevicesForgeMixin {
    @Inject(method = "registerApplicationEvent", at = @At("TAIL"), remap = false)
    private void registerApplicationEvent(CallbackInfo ci) {
        MineChromaticAddon.get().registerApps();
    }
}
