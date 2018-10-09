package com.south.epic.entity;

import com.south.epic.Main;
import com.south.epic.entity.render.RenderFlyingBison;
import com.south.epic.entity.render.RenderSpectralRat;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModEntities {

    public static void init() {

        int id = 1;

        EntityRegistry.registerModEntity(new ResourceLocation(Main.MODID, "SpectralRat"), EntitySpectralRat.class, "SpectralRat", id++, Main.instance, 64, 1, true, 6448639, 13159423);
        EntityRegistry.registerModEntity(new ResourceLocation(Main.MODID, "FlyingBison"), EntityFlyingBison.class, "FlyingBison", id++, Main.instance, 64, 1, true, 16777215, 13159423);
    }
        @SideOnly(Side.CLIENT)
                public static void initModels() {
            RenderingRegistry.registerEntityRenderingHandler(EntitySpectralRat.class, RenderSpectralRat.FACTORY);
            RenderingRegistry.registerEntityRenderingHandler(EntityFlyingBison.class, RenderFlyingBison.FACTORY);
        }

    }
