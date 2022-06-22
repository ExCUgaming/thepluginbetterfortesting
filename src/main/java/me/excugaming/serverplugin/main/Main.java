package me.excugaming.serverplugin.main;

import me.excugaming.serverplugin.items.Items;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        registerCommands();
        registerEvents();
        Items.init();
    }

    @Override
    public void onDisable() {

    }


    public void registerCommands() {

    }
    public void registerEvents() {
        PluginManager pm = getServer().getPluginManager();
    }
}
