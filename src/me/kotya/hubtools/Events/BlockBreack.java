package me.kotya.hubtools.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreack implements Listener {

    @EventHandler
    public void onBreak(BlockBreakEvent e){
        e.setCancelled(true);
    }


}
