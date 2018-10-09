package com.south.epic.entity.render;

import com.south.epic.Main;
import com.south.epic.entity.EntityFlyingBison;
import modelflyingbison.modelflyingbison;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nonnull;

public class RenderFlyingBison extends RenderLiving<EntityFlyingBison> {

private ResourceLocation mobTexture = new ResourceLocation("assets/textures/entity/flyingbison.png");

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
