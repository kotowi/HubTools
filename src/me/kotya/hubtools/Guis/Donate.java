package me.kotya.hubtools.Guis;

import me.kotya.hubtools.hubtool;
import me.kotya.hubtools.utils.ItemUtil;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;

public class Donate implements Listener {
    private static hubtool plugin = hubtool.getInstance();

    @EventHandler
    public void onIner(InventoryClickEvent e){
        if (e.getInventory().getName().equalsIgnoreCase("§c§lДонат")){
            e.setCancelled(true);
            if (e.getCurrentItem().getType() == Material.GOLD_INGOT){
                Inventory ginv = plugin.getServer().createInventory(null, 9*3, "§e§lВозможности Gold");

                ginv.setItem(11, ItemUtil.newItemWithLore(Material.GOLDEN_APPLE, 1, "§6§lВозможности UHC", "§e§l - Множтьель коинов 1.5"));
                ginv.setItem(13, ItemUtil.newItemWithLore(Material.TNT, 1, "§c§lВозможности TNTTAG", "§e§l - Множитель коинов 1.5"));
                ginv.setItem(15, ItemUtil.newItemWithLore(Material.GRASS, 1, "§a§lВозможности Survival", "§c§lИнформация на сайте - " + "нет покачто("));
                ginv.setItem(22, ItemUtil.newItemWithLore(Material.BARRIER, 1, "§c§lВыйти", "§c§lВыход в меню донатов"));

                e.getWhoClicked().openInventory(ginv);
            }
            if (e.getInventory().getName().equalsIgnoreCase("§e§lВозможности Gold")){
                if (e.getCurrentItem().getType() == Material.GOLDEN_APPLE){
                    e.getWhoClicked().sendMessage("§6§lПокупка на сайте " + "нет покачто )");
                }
                if (e.getCurrentItem().getType() == Material.GOLDEN_APPLE){
                    e.getWhoClicked().sendMessage("§6§lПокупка на сайте " + "нет покачто )");
                }
                if (e.getCurrentItem().getType() == Material.TNT){
                    e.getWhoClicked().sendMessage("§6§lПокупка на сайте " + "нет покачто )");
                }
                if (e.getCurrentItem().getType() == Material.GRASS){
                    e.getWhoClicked().sendMessage("§6§lПокупка на сайте " + "нет покачто )");
                }
                if (e.getCurrentItem().getType() == Material.BARRIER){
                    e.getWhoClicked().closeInventory();
                }
                e.setCancelled(true);
            }

        }
        }

    }


