package pie.ilikepiefoo.forge;

import dev.architectury.platform.forge.EventBuses;
import pie.ilikepiefoo.PieMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(PieMod.MOD_ID)
public class PieModForge {
    public PieModForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(PieMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        PieMod.init();
    }
}
