package me.kotya.hubtools.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPickupItemEvent;

public class onPickUp implements Listener {


    @EventHandler
    public void onPick(PlayerPickupItemEvent e){
        e.setCancelled(true);
    }
}
