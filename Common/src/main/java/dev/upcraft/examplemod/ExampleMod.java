package dev.upcraft.examplemod;

import com.google.auto.service.AutoService;
import dev.upcraft.sparkweave.api.entrypoint.MainEntryPoint;
import dev.upcraft.sparkweave.api.platform.ModContainer;
import net.minecraft.resources.ResourceLocation;

@AutoService(MainEntryPoint.class)
public class ExampleMod implements MainEntryPoint {
    public static final String MOD_ID = "examplemod";

    @Override
    public void onInitialize(ModContainer mod) {

    }

    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}
