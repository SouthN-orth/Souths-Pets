package south.bison.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import south.bison.init.EntityInit;
import south.bison.util.Reference;

public class ClientProxy extends CommonProxy
    {

    public void preInit(FMLPreInitializationEvent e) {
        EntityInit.initModels();
    }

}
