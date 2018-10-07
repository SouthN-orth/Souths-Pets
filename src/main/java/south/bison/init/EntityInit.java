package south.bison.init;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import south.bison.Main;
import south.bison.entity.EntityFlyingBison;
import south.bison.util.Reference;

public class EntityInit
{
    public static void registerEntities()
    {
        registerEntity("FlyingBison", EntityFlyingBison.class, Reference.ENTITY_AIRBISON, 50, 11437146, 000000);
    }

    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
    {
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
    }
}

