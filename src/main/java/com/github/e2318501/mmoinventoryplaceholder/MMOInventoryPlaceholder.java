package com.github.e2318501.mmoinventoryplaceholder;

import org.bukkit.plugin.java.JavaPlugin;

public final class MMOInventoryPlaceholder extends JavaPlugin {
    @Override
    public void onEnable() {
        new MMOInventoryExpansion().register();
    }

    @Override
    public void onDisable() {
    }
}
