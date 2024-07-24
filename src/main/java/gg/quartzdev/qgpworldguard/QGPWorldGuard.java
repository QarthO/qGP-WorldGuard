package gg.quartzdev.qgpcontexts;

import gg.quartzdev.qgpcontexts.calculators.GPCalculator;
import gg.quartzdev.qgpcontexts.calculators.HuskCalculator;
import net.kyori.adventure.text.Component;
import net.luckperms.api.LuckPerms;
import net.luckperms.api.context.ContextCalculator;
import net.luckperms.api.context.ContextManager;
import org.bstats.bukkit.Metrics;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public final class QGPContexts extends JavaPlugin
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