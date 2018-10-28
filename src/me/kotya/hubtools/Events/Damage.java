package me.kotya.hubtools.Events;

import me.kotya.hubtools.hubtool;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.util.Vector;

public class Damage implements Listener {
    private static hubtool plugin = hubtool.getInstance();


    @EventHandler
    public void onDamage(EntityDamageEvent e)
    {

        if (e.getCause() == EntityDamageEvent.DamageCause.VOID){
            plugin.getServer().dispatchCommand(plugin.getServer().getConsoleSender(), "tp " + e.getEntity().getName() + " 0 36 0");
        }
        e.setCancelled(true);
    }


}
