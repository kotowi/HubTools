package me.kotya.hubtools.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerLeave implements Listener {


    @EventHandler
    public void onLeave(PlayerQuitEvent e){
        e.setQuitMessage("");
        e.getPlayer().getInventory().clear();
    }




}
