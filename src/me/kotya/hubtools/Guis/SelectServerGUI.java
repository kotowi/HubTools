package me.kotya.hubtools.Guis;

import me.kotya.hubtools.hubtool;
import me.kotya.hubtools.utils.ItemUtil;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;

public class SelectServerGUI implements Listener {
    public static hubtool plugin = hubtool.getInstance();


    @EventHandler
    public void onOpenServer(PlayerInteractEvent e) {
        if (e.getAction() == Action.RIGHT_CLICK_AIR) {
            if (e.getItem().getType() == Material.COMPASS) {
                Inventory inv = plugin.getServer().createInventory(null, 9 * 6, "§c§lВыбор сервера");

                inv.setItem(10, ItemUtil.newItemWithLore(Material.GOLDEN_APPLE, 1, "§6§lSpeedUhc", "§c§lПривлекательный минигейм)"));
                inv.setItem(13, ItemUtil.newItemWithLore(Material.TNT, 1, "§c§lTNT tag", "§c§lну шо сказать?"));


                e.getPlayer().openInventory(inv);
            }
        }
        if (e.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (e.getItem().getType() == Material.COMPASS) {
                Inventory inv = plugin.getServer().createInventory(null, 9 * 6, "§c§lВыбор сервера");

                inv.setItem(10, ItemUtil.newItemWithLore(Material.GOLDEN_APPLE, 1, "§6§lSpeedUhc", "§c§lПривлекательный минигейм)"));
                inv.setItem(13, ItemUtil.newItemWithLore(Material.TNT, 1, "§c§lTNT tag", "§c§lну шо сказать?"));


                e.getPlayer().openInventory(inv);
            }
        }
        if (e.getAction() == Action.RIGHT_CLICK_AIR) {
            if (e.getItem().getType() == Material.EMERALD) {
                Inventory inv = plugin.getServer().createInventory(null, 9 * 3, "§c§lДонат");

                inv.setItem(10, ItemUtil.newItemWithLore(Material.GOLD_INGOT, 1, "§e§lGold", "§c§bПКМ что-бы посмотреть возможности!"));
                inv.setItem(12, ItemUtil.newItemWithLore(Material.DIAMOND, 1, "§b§lDiamond", "§c§bПКМ что-бы посмотреть возможности!"));
                inv.setItem(14, ItemUtil.newItemWithLore(Material.EMERALD, 1, "§a§lEmerald", "§c§bПКМ что-бы посмотреть возможности!"));
                inv.setItem(16, ItemUtil.newItemWithLore(Material.REDSTONE, 1, "§c§lRedstone", "§c§bПКМ что-бы посмотреть возможности!"));


                e.getPlayer().openInventory(inv);
            }
        }
        if (e.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (e.getItem().getType() == Material.EMERALD) {
                Inventory inv = plugin.getServer().createInventory(null, 9 * 3, "§c§lДонат");

                inv.setItem(10, ItemUtil.newItemWithLore(Material.GOLD_INGOT, 1, "§e§lGold", "§c§bПКМ что-бы посмотреть возможности!"));
                inv.setItem(12, ItemUtil.newItemWithLore(Material.DIAMOND, 1, "§b§lDiamond", "§c§bПКМ что-бы посмотреть возможности!"));
                inv.setItem(14, ItemUtil.newItemWithLore(Material.EMERALD, 1, "§a§lEmerald", "§c§bПКМ что-бы посмотреть возможности!"));
                inv.setItem(16, ItemUtil.newItemWithLore(Material.REDSTONE, 1, "§c§lRedstone", "§c§bПКМ что-бы посмотреть возможности!"));


                e.getPlayer().openInventory(inv);
            }
        }
    }}
