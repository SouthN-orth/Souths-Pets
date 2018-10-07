package south.bison.entity.render;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import south.bison.entity.EntityFlyingBison;
import south.bison.entity.model.modelflyingbison;

import javax.annotation.Nonnull;

public class RenderFlyingBison extends RenderLiving<EntityFlyingBison> {

private ResourceLocation mobTexture = new ResourceLocation("assets/textures/entity/EntityAirbison.png");

public static final Factory FACTORY = new Factory();

public RenderFlyingBison (RenderManager rendermanagerIn) {
    super(rendermanagerIn, new modelflyingbison(), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityFlyingBison entity) {
    return mobTexture;
    }

    public static class Factory implements IRenderFactory<EntityFlyingBison> {

    @Override
        public Render<? super EntityFlyingBison> createRenderFor(RenderManager manager) {
        return new RenderFlyingBison(manager);
    }
    }

}
