package south.bison.proxy;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import south.bison.init.EntityInit;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
        EntityInit.init();
    }

}