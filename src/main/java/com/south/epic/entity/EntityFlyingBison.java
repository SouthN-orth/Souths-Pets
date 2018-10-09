package com.south.epic.entity;

import com.south.epic.Main;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.passive.AbstractChestHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityFlyingBison extends AbstractChestHorse
{

    public EntityFlyingBison(World worldIn)
    {
        super(worldIn);
        this.setSize(0.9F, 1.4F);
    }

    @Override
    protected void initEntityAI()
    {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 1.2D));
        this.tasks.addTask(1, new EntityAIRunAroundLikeCrazy(this, 1.2D));
        this.tasks.addTask(2, new EntityAIMate(this, 1.0D, EntityFlyingBison.class));
        this.tasks.addTask(4, new EntityAIFollowParent(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWanderAvoidWater(this, 0.7D));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
    }
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(80);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2);
//add once flying is implemented
        //        this.getEntityAttribute(SharedMonsterAttributes.FLYING_SPEED).setBaseValue(0.2);
    }

    @Override
    public float getEyeHeight() {
        return 1.2F;
    }

    @Override
    public AbstractChestHorse createChild(EntityAgeable ageable)
    {
        return new EntityFlyingBison(world);
    }

}
