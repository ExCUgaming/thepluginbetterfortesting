package me.excugaming.serverplugin.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Items {

    public static ItemStack iron;
    public static ItemStack gold;
    public static ItemStack diamond;
    public static ItemStack netherite;
    public static ItemStack emerald;
    public static ItemStack lapis;
    public static ItemStack redstone;

    public static void init() {
        createIron();
        createGold();
        createDiamond();
        createNetherite();
        createEmerald();
        createLapis();
        createRedstone();
    }

    private static void createDiamond() {
        ItemStack item = new ItemStack(Material.DIAMOND, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bDiamond");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.DARK_PURPLE+"Used to buy person upgrades in the shop!");
        meta.setLore(lore);
        item.setItemMeta(meta);
        diamond = item;
    }

    private static void createIron() {
        ItemStack item = new ItemStack(Material.IRON_INGOT, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fIron");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.DARK_PURPLE+"Used to buy basic things in the shop!");
        meta.setLore(lore);
        item.setItemMeta(meta);
        iron = item;
    }
    private static void createGold() {
        ItemStack item = new ItemStack(Material.GOLD_INGOT, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§f§6Gold");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.DARK_PURPLE+"Used to buy decent things in the shop!");
        meta.setLore(lore);
        item.setItemMeta(meta);
        gold = item;
    }

    private static void createNetherite() {
        ItemStack item = new ItemStack(Material.NETHERITE_INGOT, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§f§8Netherite");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.DARK_PURPLE+"Used to buy the best things in the shop!");
        meta.setLore(lore);
        item.setItemMeta(meta);
        netherite = item;
    }

    private static void createEmerald() {
        ItemStack item = new ItemStack(Material.EMERALD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§f§aEmerald");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.DARK_PURPLE+"Used to buy things in the shop!");
        meta.setLore(lore);
        item.setItemMeta(meta);
        emerald = item;
    }
    private static void createLapis() {
        ItemStack item = new ItemStack(Material.LAPIS_LAZULI, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§1Lapis");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.DARK_PURPLE+"Used to buy team upgrades in the shop!");
        meta.setLore(lore);
        item.setItemMeta(meta);
        lapis = item;
    }
    private static void createRedstone() {
        ItemStack item = new ItemStack(Material.REDSTONE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§cRedstone");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.DARK_PURPLE+"Used to buy strong blocks in the shop");
        meta.setLore(lore);
        item.setItemMeta(meta);
        redstone = item;
    }
}
