package pie.ilikepiefoo.fabric;

import pie.ilikepiefoo.PieMod;
import net.fabricmc.api.ModInitializer;

public class PieModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        PieMod.init();
    }
}
