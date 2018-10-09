package com.south.epic.entity.render;

import com.south.epic.Main;
import com.south.epic.entity.EntitySpectralRat;
import modelspectralrat.modelspectralrat;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nonnull;

public class RenderSpectralRat extends RenderLiving<EntitySpectralRat> {

private ResourceLocation mobTexture = new ResourceLocation("assets/textures/entity/spectralrat.png");

public static final Factory FACTORY = new Factory();

public RenderSpectralRat(RenderManager rendermanagerIn) {
super(rendermanagerIn, new modelspectralrat(), 0.25F);
}
@Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntitySpectralRat entity) {
    return mobTexture;
}
public static class Factory implements IRenderFactory<EntitySpectralRat> {

    @Override
    public Render<? super EntitySpectralRat> createRenderFor(RenderManager manager) {
        return new RenderSpectralRat(manager);
    }

}

}
