package modelflyingbison;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * airbison - South_North
 * Created using Tabula 7.0.0
 */
public class modelflyingbison extends ModelBase {
    public double[] modelScale = new double[] { 0.8D, 0.8D, 0.8D };
    public ModelRenderer legR1;
    public ModelRenderer legR2;
    public ModelRenderer legR3;
    public ModelRenderer legL1;
    public ModelRenderer legL2;
    public ModelRenderer legL3;
    public ModelRenderer body1;
    public ModelRenderer head1;
    public ModelRenderer horn2;
    public ModelRenderer horn1;
    public ModelRenderer tail1;

    public modelflyingbison() {
        this.textureWidth = 256;
        this.textureHeight = 256;
        this.head1 = new ModelRenderer(this, 128, 25);
        this.head1.setRotationPoint(4.0F, 0.7F, -27.5F);
        this.head1.addBox(-20.0F, -13.0F, -3.3000000000000016F, 27, 27, 27, 0.0F);
        this.horn1 = new ModelRenderer(this, 236, 21);
        this.horn1.setRotationPoint(-2.0F, -2.3F, 3.0F);
        this.horn1.addBox(-20.0F, -13.0F, -3.3F, 4, 10, 4, 0.0F);
        this.body1 = new ModelRenderer(this, 0, 25);
        this.body1.setRotationPoint(0.2F, -1.5F, -12.5F);
        this.body1.addBox(-19.8F, -13.0F, 0.0F, 35, 30, 58, 0.1F);
        this.legL2 = new ModelRenderer(this, 160, 0);
        this.legL2.setRotationPoint(28.0F, 18.0F, 15.0F);
        this.legL2.addBox(-20.0F, -13.0F, 0.0F, 10, 15, 10, 0.0F);
        this.tail1 = new ModelRenderer(this, 0, 113);
        this.tail1.setRotationPoint(4.0F, 5.0F, 40.0F);
        this.tail1.addBox(-20.0F, -13.0F, 0.0F, 27, 8, 35, 0.0F);
        this.legL3 = new ModelRenderer(this, 200, 0);
        this.legL3.setRotationPoint(28.0F, 18.0F, 30.0F);
        this.legL3.addBox(-20.0F, -13.0F, 0.0F, 10, 15, 10, 0.0F);
        this.legR3 = new ModelRenderer(this, 80, 0);
        this.legR3.setRotationPoint(-2.0F, 18.0F, 30.0F);
        this.legR3.addBox(-20.0F, -13.0F, 0.0F, 10, 15, 10, 0.0F);
        this.legR1 = new ModelRenderer(this, 0, 0);
        this.legR1.setRotationPoint(-2.0F, 18.0F, 0.0F);
        this.legR1.addBox(-20.0F, -13.0F, 0.0F, 10, 15, 10, 0.0F);
        this.legR2 = new ModelRenderer(this, 40, 0);
        this.legR2.setRotationPoint(-2.0F, 18.0F, 15.0F);
        this.legR2.addBox(-20.0F, -13.0F, 0.0F, 10, 15, 10, 0.0F);
        this.legL1 = new ModelRenderer(this, 120, 0);
        this.legL1.setRotationPoint(28.0F, 18.0F, 0.0F);
        this.legL1.addBox(-20.0F, -13.0F, 0.0F, 10, 15, 10, 0.0F);
        this.horn2 = new ModelRenderer(this, 0, 25);
        this.horn2.setRotationPoint(25.0F, -2.3F, 3.0F);
        this.horn2.addBox(-20.0F, -13.0F, -3.3F, 4, 10, 4, 0.0F);
        this.head1.addChild(this.horn1);
        this.head1.addChild(this.horn2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.scale(1D / modelScale[0], 1D / modelScale[1], 1D / modelScale[2]);
        this.head1.render(f5);
        this.body1.render(f5);
        this.legL2.render(f5);
        this.tail1.render(f5);
        this.legL3.render(f5);
        this.legR3.render(f5);
        this.legR1.render(f5);
        this.legR2.render(f5);
        this.legL1.render(f5);
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

