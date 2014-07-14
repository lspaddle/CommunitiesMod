package com.lspaddle.cm.handler;

import com.lspaddle.cm.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean religion = false;

    public static void init(File configFile)
    {
        if(configuration == null)
            configuration = new Configuration(configFile);
        loadConfiguration();
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.modID.equals(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        religion =configuration.getBoolean("Religion", Configuration.CATEGORY_GENERAL, true, "Allows religion communities to be formed");

        if(configuration.hasChanged())
            configuration.save();
    }
}
