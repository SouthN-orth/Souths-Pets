package modelratking;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * RatKing - South_North
 * Created using Tabula 7.0.0
 */
public class modelratking extends ModelBase {
    public double[] modelScale = new double[] { 0.7D, 0.7D, 0.7D };
    public ModelRenderer bodyBottom;
    public ModelRenderer bodyTop;
    public ModelRenderer RLegBase;
    public ModelRenderer LLegBase;
    public ModelRenderer Tail;
    public ModelRenderer UpperArmR;
    public ModelRenderer UpperArmL;
    public ModelRenderer HeadBase;
    public ModelRenderer LowerArmR;
    public ModelRenderer RHand;
    public ModelRenderer LowerArmL;
    public ModelRenderer LHand;
    public ModelRenderer snout;
    public ModelRenderer REar;
    public ModelRenderer LEar;
    public ModelRenderer CrownVelvet;
    public ModelRenderer REye;
    public ModelRenderer LEye;
    public ModelRenderer CrownGoldBase;
    public ModelRenderer shape30;
    public ModelRenderer shape31;
    public ModelRenderer shape32;
    public ModelRenderer RFoot;
    public ModelRenderer RFoot_1;

    public modelratking() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.RLegBase = new ModelRenderer(this, 80, 0);
        this.RLegBase.setRotationPoint(-2.5F, 6.0F, 5.0F);
        this.RLegBase.addBox(0.0F, 0.0F, 0.0F, 3, 12, 12, 0.0F);
        this.snout = new ModelRenderer(this, 113, 31);
        this.snout.setRotationPoint(2.5F, 4.5F, -1.0F);
        this.snout.addBox(0.0F, 0.0F, 0.0F, 6, 6, 1, 0.0F);
        this.REar = new ModelRenderer(this, 72, 48);
        this.REar.setRotationPoint(-4.0F, -4.0F, 12.5F);
        this.REar.addBox(0.0F, 0.0F, 0.0F, 8, 8, 2, 0.0F);
        this.RFoot_1 = new ModelRenderer(this, 0, 100);
        this.RFoot_1.setRotationPoint(1.0F, 11.5F, -8.0F);
        this.RFoot_1.addBox(0.0F, 0.0F, 0.0F, 3, 4, 20, 0.0F);
        this.LLegBase = new ModelRenderer(this, 80, 24);
        this.LLegBase.setRotationPoint(18.5F, 6.0F, 5.0F);
        this.LLegBase.addBox(0.0F, 0.0F, 0.0F, 3, 12, 12, 0.0F);
        this.LowerArmR = new ModelRenderer(this, 110, 0);
        this.LowerArmR.setRotationPoint(0.0F, 6.5F, 2.5F);
        this.LowerArmR.addBox(0.0F, 0.0F, 0.0F, 3, 9, 4, 0.0F);
        this.setRotateAngle(LowerArmR, -1.2292353921796064F, 0.0F, 0.0F);
        this.shape32 = new ModelRenderer(this, 0, 0);
        this.shape32.setRotationPoint(3.5F, -2.0F, 3.5F);
        this.shape32.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.CrownGoldBase = new ModelRenderer(this, 40, 76);
        this.CrownGoldBase.setRotationPoint(-1.0F, 7.0F, -1.0F);
        this.CrownGoldBase.addBox(0.0F, 0.0F, 0.0F, 10, 1, 10, 0.0F);
        this.UpperArmL = new ModelRenderer(this, 60, 0);
        this.UpperArmL.setRotationPoint(13.8F, 5.0F, 6.5F);
        this.UpperArmL.addBox(0.0F, 0.0F, 0.0F, 3, 10, 4, 0.0F);
        this.setRotateAngle(UpperArmL, 0.0F, 0.0F, -0.6373942428283291F);
        this.Tail = new ModelRenderer(this, 40, 48);
        this.Tail.setRotationPoint(8.0F, 12.0F, 20.0F);
        this.Tail.addBox(0.0F, 0.0F, 0.0F, 4, 4, 24, 0.0F);
        this.HeadBase = new ModelRenderer(this, 0, 72);
        this.HeadBase.setRotationPoint(2.0F, -12.0F, -2.0F);
        this.HeadBase.addBox(0.0F, 0.0F, 0.0F, 12, 12, 16, 0.0F);
        this.bodyTop = new ModelRenderer(this, 0, 40);
        this.bodyTop.setRotationPoint(2.0F, -16.0F, 3.0F);
        this.bodyTop.addBox(0.0F, 0.0F, 0.0F, 16, 16, 16, 0.0F);
        this.RFoot = new ModelRenderer(this, 60, 76);
        this.RFoot.setRotationPoint(-0.4F, 11.5F, -8.0F);
        this.RFoot.addBox(0.0F, 0.0F, 0.0F, 3, 4, 20, 0.0F);
        this.LowerArmL = new ModelRenderer(this, 110, 13);
        this.LowerArmL.setRotationPoint(0.0F, 6.5F, 2.5F);
        this.LowerArmL.addBox(0.0F, 0.0F, 0.0F, 3, 9, 4, 0.0F);
        this.setRotateAngle(LowerArmL, -1.2292353921796064F, 0.0F, 0.0F);
        this.LEye = new ModelRenderer(this, 70, 0);
        this.LEye.setRotationPoint(11.5F, 2.0F, 6.0F);
        this.LEye.addBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
        this.LHand = new ModelRenderer(this, 98, 24);
        this.LHand.setRotationPoint(-0.5F, 9.0F, 0.0F);
        this.LHand.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
        this.UpperArmR = new ModelRenderer(this, 0, 0);
        this.UpperArmR.setRotationPoint(0.0F, 3.1F, 6.5F);
        this.UpperArmR.addBox(0.0F, 0.0F, 0.0F, 3, 10, 4, 0.0F);
        this.setRotateAngle(UpperArmR, 0.0F, 0.0F, 0.6373942428283291F);
        this.RHand = new ModelRenderer(this, 74, 0);
        this.RHand.setRotationPoint(-0.5F, 9.0F, 0.0F);
        this.RHand.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
        this.LEar = new ModelRenderer(this, 92, 48);
        this.LEar.setRotationPoint(8.0F, -4.0F, 12.5F);
        this.LEar.addBox(0.0F, 0.0F, 0.0F, 8, 8, 2, 0.0F);
        this.REye = new ModelRenderer(this, 10, 0);
        this.REye.setRotationPoint(-0.5F, 2.0F, 6.0F);
        this.REye.addBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
        this.shape31 = new ModelRenderer(this, 102, 48);
        this.shape31.setRotationPoint(3.5F, -1.0F, -1.0F);
        this.shape31.addBox(0.0F, 0.0F, 0.0F, 1, 10, 10, 0.0F);
        this.bodyBottom = new ModelRenderer(this, 0, 0);
        this.bodyBottom.setRotationPoint(-10.0F, -4.1F, -10.0F);
        this.bodyBottom.addBox(0.0F, 0.0F, 0.0F, 20, 20, 20, 0.0F);
        this.shape30 = new ModelRenderer(this, 72, 58);
        this.shape30.setRotationPoint(-1.0F, -1.0F, 3.5F);
        this.shape30.addBox(0.0F, 0.0F, 0.0F, 10, 10, 1, 0.0F);
        this.CrownVelvet = new ModelRenderer(this, 88, 68);
        this.CrownVelvet.setRotationPoint(2.0F, -8.0F, 3.0F);
        this.CrownVelvet.addBox(0.0F, 0.0F, 0.0F, 8, 8, 8, 0.0F);
        this.bodyBottom.addChild(this.RLegBase);
        this.HeadBase.addChild(this.snout);
        this.HeadBase.addChild(this.REar);
        this.LLegBase.addChild(this.RFoot_1);
        this.bodyBottom.addChild(this.LLegBase);
        this.UpperArmR.addChild(this.LowerArmR);
        this.CrownVelvet.addChild(this.shape32);
        this.CrownVelvet.addChild(this.CrownGoldBase);
        this.bodyTop.addChild(this.UpperArmL);
        this.bodyBottom.addChild(this.Tail);
        this.bodyTop.addChild(this.HeadBase);
        this.bodyBottom.addChild(this.bodyTop);
        this.RLegBase.addChild(this.RFoot);
        this.UpperArmL.addChild(this.LowerArmL);
        this.HeadBase.addChild(this.LEye);
        this.LowerArmL.addChild(this.LHand);
        this.bodyTop.addChild(this.UpperArmR);
        this.LowerArmR.addChild(this.RHand);
        this.HeadBase.addChild(this.LEar);
        this.HeadBase.addChild(this.REye);
        this.CrownVelvet.addChild(this.shape31);
        this.CrownVelvet.addChild(this.shape30);
        this.HeadBase.addChild(this.CrownVelvet);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.scale(1D / modelScale[0], 1D / modelScale[1], 1D / modelScale[2]);
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.8F);
        this.bodyBottom.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
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
