package south.bison.init;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import south.bison.Main;
import south.bison.entity.EntityFlyingBison;
import south.bison.entity.render.RenderFlyingBison;

public class EntityInit
{
    public static void init() {
        int id = 1;
        EntityRegistry.registerModEntity(EntityFlyingBison.class, "EntityFlyingBison", id++, EntityFlyingBison.class, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
    EntityRegistry.addSpawn(EntityFlyingBison.class, 100, 3, 5, EnumCreatureType.CREATURE, Biomes.EXTREME_HILLS, Biomes.EXTREME_HILLS_EDGE);

    }
@SideOnly(Side.CLIENT)
    public static void initModels() {
    RenderingRegistry.registerEntityRenderingHandler(EntityFlyingBison.class, RenderFlyingBison.FACTORY);
    }
}
