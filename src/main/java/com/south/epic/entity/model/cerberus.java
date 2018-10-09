package cerberus;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * Cerberus - South_North
 * Created using Tabula 7.0.0
 */
public class cerberus extends ModelBase {
    public double[] modelScale = new double[] { 0.5D, 0.5D, 0.5D };
    public ModelRenderer BodyBase;
    public ModelRenderer MiddleBodyFront;
    public ModelRenderer BackBody;
    public ModelRenderer RightFrontLeg;
    public ModelRenderer LeftFrontLeg;
    public ModelRenderer RightBackLeg;
    public ModelRenderer LeftFrontLeg_1;
    public ModelRenderer LeftBodyFront;
    public ModelRenderer RightBodyFront;
    public ModelRenderer MiddleHead;
    public ModelRenderer LeftHead;
    public ModelRenderer Snout;
    public ModelRenderer REar;
    public ModelRenderer LEar;
    public ModelRenderer RightHead;
    public ModelRenderer REar_1;
    public ModelRenderer LEar_1;
    public ModelRenderer Snout_1;
    public ModelRenderer Snout_2;
    public ModelRenderer REar_2;
    public ModelRenderer LEar_2;
    public ModelRenderer Tail;
    public ModelRenderer shape;
    public ModelRenderer butt;
    public ModelRenderer Paw1;
    public ModelRenderer Paw1_1;
    public ModelRenderer Paw1_2;
    public ModelRenderer Paw1_3;

    public cerberus() {
        this.textureWidth = 256;
        this.textureHeight = 256;
        this.LeftFrontLeg = new ModelRenderer(this, 80, 0);
        this.LeftFrontLeg.setRotationPoint(20.5F, 14.0F, 6.0F);
        this.LeftFrontLeg.addBox(0.0F, 0.0F, 0.0F, 4, 12, 4, 0.0F);
        this.Snout = new ModelRenderer(this, 56, 32);
        this.Snout.setRotationPoint(3.0F, 6.0F, -8.0F);
        this.Snout.addBox(0.0F, 0.0F, 0.0F, 6, 6, 8, 0.0F);
        this.Tail = new ModelRenderer(this, 88, 52);
        this.Tail.setRotationPoint(10.5F, 4.3F, 20.9F);
        this.Tail.addBox(0.0F, 0.0F, 0.0F, 3, 3, 16, 0.0F);
        this.setRotateAngle(Tail, 1.0016444577195458F, 0.0F, 0.0F);
        this.shape = new ModelRenderer(this, 0, 0);
        this.shape.setRotationPoint(-2.0F, -2.0F, 0.0F);
        this.shape.addBox(0.0F, 0.0F, 0.0F, 28, 14, 2, 0.0F);
        this.Paw1_3 = new ModelRenderer(this, 128, 56);
        this.Paw1_3.setRotationPoint(-1.0F, 12.0F, -2.0F);
        this.Paw1_3.addBox(0.0F, 0.0F, 0.0F, 6, 3, 6, 0.0F);
        this.REar_1 = new ModelRenderer(this, 240, 0);
        this.REar_1.setRotationPoint(0.0F, -4.0F, 4.0F);
        this.REar_1.addBox(0.0F, 0.0F, 0.0F, 4, 4, 2, 0.0F);
        this.LEar = new ModelRenderer(this, 140, 0);
        this.LEar.setRotationPoint(8.0F, -4.0F, 4.0F);
        this.LEar.addBox(0.0F, 0.0F, 0.0F, 4, 4, 2, 0.0F);
        this.RightHead = new ModelRenderer(this, 212, 48);
        this.RightHead.setRotationPoint(2.0F, 1.0F, -6.0F);
        this.RightHead.addBox(0.0F, 0.0F, 0.0F, 12, 12, 8, 0.0F);
        this.Snout_2 = new ModelRenderer(this, 76, 52);
        this.Snout_2.setRotationPoint(3.0F, 6.0F, -8.0F);
        this.Snout_2.addBox(0.0F, 0.0F, 0.0F, 6, 6, 8, 0.0F);
        this.RightBodyFront = new ModelRenderer(this, 0, 32);
        this.RightBodyFront.setRotationPoint(-14.0F, 0.0F, 4.2F);
        this.RightBodyFront.addBox(0.0F, 0.0F, 0.0F, 16, 14, 12, 0.0F);
        this.setRotateAngle(RightBodyFront, 0.0F, 0.2617993877991494F, 0.0F);
        this.BodyBase = new ModelRenderer(this, 0, 0);
        this.BodyBase.setRotationPoint(-15.0F, -17.0F, -12.0F);
        this.BodyBase.addBox(0.0F, 0.0F, 0.0F, 32, 16, 16, 0.0F);
        this.Paw1 = new ModelRenderer(this, 128, 26);
        this.Paw1.setRotationPoint(-1.0F, 12.0F, -2.0F);
        this.Paw1.addBox(0.0F, 0.0F, 0.0F, 6, 3, 6, 0.0F);
        this.RightFrontLeg = new ModelRenderer(this, 0, 0);
        this.RightFrontLeg.setRotationPoint(5.5F, 14.0F, 6.0F);
        this.RightFrontLeg.addBox(0.0F, 0.0F, 0.0F, 4, 12, 4, 0.0F);
        this.REar = new ModelRenderer(this, 96, 0);
        this.REar.setRotationPoint(0.0F, -4.0F, 4.0F);
        this.REar.addBox(0.0F, 0.0F, 0.0F, 4, 4, 2, 0.0F);
        this.Snout_1 = new ModelRenderer(this, 56, 46);
        this.Snout_1.setRotationPoint(3.0F, 6.0F, -8.0F);
        this.Snout_1.addBox(0.0F, 0.0F, 0.0F, 6, 6, 8, 0.0F);
        this.LeftFrontLeg_1 = new ModelRenderer(this, 224, 0);
        this.LeftFrontLeg_1.setRotationPoint(20.5F, 14.0F, 32.0F);
        this.LeftFrontLeg_1.addBox(0.0F, 0.0F, 0.0F, 4, 12, 4, 0.0F);
        this.LEar_1 = new ModelRenderer(this, 96, 6);
        this.LEar_1.setRotationPoint(8.0F, -4.0F, 4.0F);
        this.LEar_1.addBox(0.0F, 0.0F, 0.0F, 4, 4, 2, 0.0F);
        this.LeftHead = new ModelRenderer(this, 180, 36);
        this.LeftHead.setRotationPoint(2.0F, 1.0F, -6.0F);
        this.LeftHead.addBox(0.0F, 0.0F, 0.0F, 12, 12, 8, 0.0F);
        this.REar_2 = new ModelRenderer(this, 140, 6);
        this.REar_2.setRotationPoint(0.0F, -4.0F, 4.0F);
        this.REar_2.addBox(0.0F, 0.0F, 0.0F, 4, 4, 2, 0.0F);
        this.Paw1_2 = new ModelRenderer(this, 186, 56);
        this.Paw1_2.setRotationPoint(-1.0F, 12.0F, -2.0F);
        this.Paw1_2.addBox(0.0F, 0.0F, 0.0F, 6, 3, 6, 0.0F);
        this.LEar_2 = new ModelRenderer(this, 240, 6);
        this.LEar_2.setRotationPoint(8.0F, -4.0F, 4.0F);
        this.LEar_2.addBox(0.0F, 0.0F, 0.0F, 4, 4, 2, 0.0F);
        this.butt = new ModelRenderer(this, 0, 0);
        this.butt.setRotationPoint(1.0F, 1.0F, 24.0F);
        this.butt.addBox(0.0F, 0.0F, 0.0F, 22, 10, 2, 0.0F);
        this.BackBody = new ModelRenderer(this, 152, 0);
        this.BackBody.setRotationPoint(4.0F, 3.0F, 16.0F);
        this.BackBody.addBox(0.0F, 0.0F, 0.0F, 24, 12, 24, 0.0F);
        this.Paw1_1 = new ModelRenderer(this, 220, 36);
        this.Paw1_1.setRotationPoint(-1.0F, 12.0F, -2.0F);
        this.Paw1_1.addBox(0.0F, 0.0F, 0.0F, 6, 3, 6, 0.0F);
        this.LeftBodyFront = new ModelRenderer(this, 84, 26);
        this.LeftBodyFront.setRotationPoint(14.0F, 0.0F, 0.0F);
        this.LeftBodyFront.addBox(0.0F, 0.0F, 0.0F, 16, 14, 12, 0.0F);
        this.setRotateAngle(LeftBodyFront, 0.0F, -0.2617993877991494F, 0.0F);
        this.MiddleHead = new ModelRenderer(this, 140, 36);
        this.MiddleHead.setRotationPoint(2.0F, 1.0F, -6.0F);
        this.MiddleHead.addBox(0.0F, 0.0F, 0.0F, 12, 12, 8, 0.0F);
        this.MiddleBodyFront = new ModelRenderer(this, 96, 0);
        this.MiddleBodyFront.setRotationPoint(8.0F, -1.0F, -4.0F);
        this.MiddleBodyFront.addBox(0.0F, 0.0F, 0.0F, 16, 14, 12, 0.0F);
        this.RightBackLeg = new ModelRenderer(this, 152, 0);
        this.RightBackLeg.setRotationPoint(5.5F, 14.0F, 32.0F);
        this.RightBackLeg.addBox(0.0F, 0.0F, 0.0F, 4, 12, 4, 0.0F);
        this.BodyBase.addChild(this.LeftFrontLeg);
        this.LeftHead.addChild(this.Snout);
        this.BackBody.addChild(this.Tail);
        this.BackBody.addChild(this.shape);
        this.LeftFrontLeg_1.addChild(this.Paw1_3);
        this.RightHead.addChild(this.REar_1);
        this.LeftHead.addChild(this.LEar);
        this.RightBodyFront.addChild(this.RightHead);
        this.MiddleHead.addChild(this.Snout_2);
        this.MiddleBodyFront.addChild(this.RightBodyFront);
        this.RightFrontLeg.addChild(this.Paw1);
        this.BodyBase.addChild(this.RightFrontLeg);
        this.LeftHead.addChild(this.REar);
        this.RightHead.addChild(this.Snout_1);
        this.BodyBase.addChild(this.LeftFrontLeg_1);
        this.RightHead.addChild(this.LEar_1);
        this.LeftBodyFront.addChild(this.LeftHead);
        this.MiddleHead.addChild(this.REar_2);
        this.RightBackLeg.addChild(this.Paw1_2);
        this.MiddleHead.addChild(this.LEar_2);
        this.BackBody.addChild(this.butt);
        this.BodyBase.addChild(this.BackBody);
        this.LeftFrontLeg.addChild(this.Paw1_1);
        this.MiddleBodyFront.addChild(this.LeftBodyFront);
        this.MiddleBodyFront.addChild(this.MiddleHead);
        this.BodyBase.addChild(this.MiddleBodyFront);
        this.BodyBase.addChild(this.RightBackLeg);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.scale(1D / modelScale[0], 1D / modelScale[1], 1D / modelScale[2]);
        this.BodyBase.render(f5);
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
