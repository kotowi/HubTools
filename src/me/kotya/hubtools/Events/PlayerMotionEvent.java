package me.kotya.hubtools.Events;

import me.kotya.hubtools.hubtool;
import me.kotya.hubtools.utils.ItemUtil;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.Inventory;

public class PlayerMotionEvent implements Listener {
    public static hubtool plugin = hubtool.getInstance();



    @EventHandler
    public void onWalk(PlayerMoveEvent e){

        if (e.getTo().getBlock().getType() == Material.STATIONARY_WATER){
            Inventory inv = plugin.getServer().createInventory(null, 9*6, "§c§lВыбор сервера");

            inv.setItem(10, ItemUtil.newItemWithLore(Material.GOLDEN_APPLE, 1, "§6§lSpeedUhc", "§c§lПривлекательный минигейм)"));
            inv.setItem(13, ItemUtil.newItemWithLore(Material.TNT, 1, "§c§lTNT tag", "§c§lну шо сказать?"));
            e.getPlayer().openInventory(inv);
        }
    }
}
