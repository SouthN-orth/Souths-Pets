package south.bison.entity.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import south.bison.entity.EntityFlyingBison;
import south.bison.entity.model.ModelFlyingBison;
import south.bison.util.Reference;

public class RenderFlyingBison extends RenderLiving<EntityFlyingBison>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/FlyingBison.png");
    public RenderFlyingBison(RenderManager manager)
    {
        super(manager, new ModelFlyingBison(), 0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityFlyingBison entity)
    {
        return TEXTURES;
    }
}
