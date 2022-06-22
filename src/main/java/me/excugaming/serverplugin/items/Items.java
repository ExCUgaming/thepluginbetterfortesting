package me.excugaming.serverplugin.items;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Items {

    public static ItemStack iron;

    public static void init() {
        createIron();
    }

    private static void createIron() {
        ItemStack item = new ItemStack(Material.STICK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Iron");
        List<String> lore = new ArrayList<>();
        lore.add(Color.PURPLE+"Used to buy basic things in the shop!");
        meta.setLore(lore);
        item.setItemMeta(meta);
        iron = item;
    }
}
