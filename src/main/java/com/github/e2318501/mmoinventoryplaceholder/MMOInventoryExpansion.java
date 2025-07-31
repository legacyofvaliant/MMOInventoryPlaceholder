package com.github.e2318501.mmoinventoryplaceholder;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MMOInventoryExpansion extends PlaceholderExpansion {
    @Override
    public @NotNull String getIdentifier() {
        return "mmoinventory";
    }

    @Override
    public @NotNull String getAuthor() {
        return "Nutchi";
    }

    @Override
    public @NotNull String getVersion() {
        return "1.0.0";
    }

    @Override
    public @Nullable String onPlaceholderRequest(Player player, @NotNull String params) {
        if (player != null) {
            String[] split = params.split("_");

            if (split[0].equals("display") && split.length == 2) {
                try {
                    ItemStack item = player.getInventory().getItem(Integer.parseInt(split[1]));

                    if (item != null) {
                        if (item.getType().equals(Material.DIAMOND_HOE)) {
                            return "NONE";
                        } else if (item.getItemMeta() != null) {
                            return item.getItemMeta().getDisplayName();
                        }
                    }
                } catch (NumberFormatException e) {
                    return null;
                }
            }
        }

        return null;
    }
}
