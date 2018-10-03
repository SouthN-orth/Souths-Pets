package net.south.bison.objects;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.south.bison.Main;
import net.south.bison.init.ItemInit;
import net.south.bison.proxy.ClientProxy;
import net.south.bison.util.IHasModel;

public class ItemBase extends Item implements IHasModel
{
    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ItemInit.ITEMS.add(this);
    }

}
