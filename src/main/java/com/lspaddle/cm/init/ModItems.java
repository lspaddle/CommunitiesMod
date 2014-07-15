package com.lspaddle.cm.init;

import com.lspaddle.cm.item.ItemCM;
import com.lspaddle.cm.item.ItemHolyBook;
import com.lspaddle.cm.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemCM HOLYBOOK = new ItemHolyBook();

    public static void init()
    {
        GameRegistry.registerItem(HOLYBOOK, "HolyBook");
    }
}
