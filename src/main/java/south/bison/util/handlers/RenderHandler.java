package south.bison.util.handlers;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import south.bison.entity.EntityFlyingBison;
import south.bison.entity.render.RenderFlyingBison;

public class RenderHandler
{
    public static void registerEntityRenders()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityFlyingBison.class, new IRenderFactory<EntityFlyingBison>()
        {
            @Override
            public Render<? super EntityFlyingBison> createRenderFor(RenderManager manager)
            {
                return new RenderFlyingBison(manager);
            }
        });
    }
}
