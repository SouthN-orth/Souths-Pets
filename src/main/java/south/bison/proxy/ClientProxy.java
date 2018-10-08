package south.bison.proxy;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import south.bison.init.EntityInit;
import south.bison.util.Reference;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent e) {

        EntityInit.initModels();

    }
}