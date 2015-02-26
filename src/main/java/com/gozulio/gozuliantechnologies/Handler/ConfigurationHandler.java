package com.gozulio.gozuliantechnologies.Handler;


import com.gozulio.gozuliantechnologies.Utility.LogHelper;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configfile)
    {
        Configuration configuration = new Configuration(configfile);

        boolean testvalue = false;
        try
        {
            configuration.load();

            testvalue = configuration.get("general", "testvalue", true, "I am a test value. maybe if im lucky, then one day i will become a real config value!").getBoolean(true);
        }
        catch (Exception a)
        {
            LogHelper.info("Configuration not found...");
        }
        finally
        {
            configuration.save();
        }
    }
}
