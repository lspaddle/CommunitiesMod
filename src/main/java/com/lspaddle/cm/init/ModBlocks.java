package com.lspaddle.cm.init;

import com.lspaddle.cm.block.BlockAltar;
import com.lspaddle.cm.block.BlockCM;
import com.lspaddle.cm.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockCM altar = new BlockAltar();

    public static void init()
    {
        GameRegistry.registerBlock(altar, "Altar");
    }
}
