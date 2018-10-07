package south.bison.objects;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import south.bison.init.ItemInit;
import south.bison.util.IHasModel;

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
