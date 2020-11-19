package me.xkwm1.multiplydrops;

import org.bukkit.plugin.java.JavaPlugin;

public class MultiplyDrops extends JavaPlugin {
    @Override
    public void onEnable() {
        CommandMultiply commandMultiply = new CommandMultiply();

        this.getCommand("drops").setExecutor(commandMultiply);
        getServer().getPluginManager().registerEvents(commandMultiply, this);
        }
    }