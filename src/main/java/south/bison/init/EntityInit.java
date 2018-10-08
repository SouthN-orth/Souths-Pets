package south.bison.init;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import south.bison.Main;
import south.bison.entity.EntityFlyingBison;
import south.bison.entity.render.RenderFlyingBison;
import south.bison.util.Reference;

public class EntityInit
{
    public static void init() {
        int id = 1;
    EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "FlyingBison"), EntityFlyingBison.class,"FlyingBison", id++, Main.instance, 64, 1, true, 0x996600, 0x00ff00);

    EntityRegistry.addSpawn(EntityFlyingBison.class, 100, 3, 5, EnumCreatureType.CREATURE, Biomes.EXTREME_HILLS, Biomes.EXTREME_HILLS_EDGE);

        EntityRegistry.registerEgg(new ResourceLocation (Reference.MODID, "FlyingBison"), 0x996600, 0x00ff00);

    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
    RenderingRegistry.registerEntityRenderingHandler(EntityFlyingBison.class, RenderFlyingBison.FACTORY);
    }
}
