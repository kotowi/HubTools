package me.kotya.hubtools.Events;

import me.kotya.hubtools.utils.ItemUtil;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

public class PlayerJoin implements Listener {

    public Location spawn;
    public int x = 0;
    public int y = 36;
    public int z = 0;


    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        e.setJoinMessage("");
        Player p = e.getPlayer();
        p.getInventory().setItem(4, ItemUtil.newItemWithLore(Material.COMPASS, 1, "§a§lВыбор Сервера", "§e§lКляц ПКМ, в клешне!"));
        p.getInventory().setItem(1, ItemUtil.newItemWithLore(Material.EMERALD, 1, "§a§lДонатец", "§c§lа шо? мы работаем 27/7"));
        p.getInventory().setItem(8, ItemUtil.newItemWithLore(Material.BOOK, 1,"§lИнформация", "§a§lВся информация о нашем сервере!"));
    }



}
