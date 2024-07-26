package gg.quartzdev.qgpworldguard;

import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

public final class QGPWorldGuard extends JavaPlugin
{

    @Override
    public void onEnable()
    {
//        bStats.org Metrics
        int pluginId = 22751;
        Metrics metrics = new Metrics(this, pluginId);

    }

    @Override
    public void onDisable()
    {

    }
}