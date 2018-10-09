package modelspectralrat;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * Spectral Rat - South_North
 * Created using Tabula 7.0.0
 */
public class modelspectralrat extends ModelBase {
    public ModelRenderer tail;
    public ModelRenderer body;
    public ModelRenderer head;
    public ModelRenderer earL;
    public ModelRenderer earR;
    public ModelRenderer nose;
    public ModelRenderer footRF;
    public ModelRenderer footRB;
    public ModelRenderer footLB;
    public ModelRenderer footLF;

    public modelspectralrat() {
        this.textureWidth = 32;
        this.textureHeight = 32;
        this.footLF = new ModelRenderer(this, 0, 0);
        this.footLF.setRotationPoint(4.0F, 23.0F, -3.0F);
        this.footLF.addBox(-2.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.footRB = new ModelRenderer(this, 0, 0);
        this.footRB.setRotationPoint(0.0F, 23.0F, 2.0F);
        this.footRB.addBox(-2.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.head = new ModelRenderer(this, 0, 19);
        this.head.setRotationPoint(0.5F, 19.5F, -7.0F);
        this.head.addBox(-2.5F, 0.0F, 0.0F, 4, 3, 4, 0.0F);
        this.body = new ModelRenderer(this, 0, 0);
        this.body.setRotationPoint(0.0F, 19.0F, -3.9F);
        this.body.addBox(-2.5F, 0.0F, 0.0F, 5, 4, 8, 0.0F);
        this.footRF = new ModelRenderer(this, 0, 0);
        this.footRF.setRotationPoint(0.0F, 23.0F, -3.0F);
        this.footRF.addBox(-2.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.earL = new ModelRenderer(this, 0, 0);
        this.earL.setRotationPoint(3.0F, -1.0F, 2.0F);
        this.earL.addBox(-2.5F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.nose = new ModelRenderer(this, 0, 0);
        this.nose.setRotationPoint(1.5F, 1.2F, -0.5F);
        this.nose.addBox(-2.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.earR = new ModelRenderer(this, 0, 0);
        this.earR.setRotationPoint(-0.8F, -1.0F, 2.0F);
        this.earR.addBox(-2.5F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.footLB = new ModelRenderer(this, 0, 0);
        this.footLB.setRotationPoint(4.0F, 23.0F, 2.0F);
        this.footLB.addBox(-2.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.tail = new ModelRenderer(this, 0, 0);
        this.tail.setRotationPoint(2.0F, 21.5F, 4.0F);
        this.tail.addBox(-2.5F, 0.0F, 0.0F, 1, 1, 6, 0.0F);
        this.head.addChild(this.earL);
        this.head.addChild(this.nose);
        this.head.addChild(this.earR);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.75F);
        this.footLF.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.75F);
        this.footRB.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.75F);
        this.head.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.75F);
        this.body.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.75F);
        this.footRF.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.75F);
        this.footLB.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.75F);
        this.tail.render(f5);
        GlStateManager.disableBlend();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
