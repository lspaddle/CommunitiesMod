package com.lspaddle.cm.init;

import com.lspaddle.cm.item.ItemCM;
import com.lspaddle.cm.item.ItemHolyBook;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemCM HOLYBOOK = new ItemHolyBook();

    public static void init()
    {
        GameRegistry.registerItem(HOLYBOOK, "HolyBook");
    }
}
