package me.kotya.hubtools.Events;

import me.kotya.hubtools.hubtool;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Chat implements Listener {
    private static hubtool plugin = hubtool.getInstance();



    @EventHandler
    public void onChat(AsyncPlayerChatEvent e){
        if (e.getPlayer().isOp()) {
                e.setCancelled(true);
                plugin.getServer().broadcastMessage("§a§l[Admin] " + e.getPlayer().getName() + " >> " + e.getMessage());
        }else {

        e.setCancelled(true);
        plugin.getServer().broadcastMessage("§6§l[Player] " + e.getPlayer().getName() + " >> " + e.getMessage());
        }
    }
}
