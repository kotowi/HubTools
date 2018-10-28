package me.kotya.hubtools;

import me.kotya.hubtools.Events.*;
import me.kotya.hubtools.Guis.Donate;
import me.kotya.hubtools.Guis.GuiClick;
import me.kotya.hubtools.Guis.SelectServerGUI;
import org.bukkit.plugin.java.JavaPlugin;

public class hubtool extends JavaPlugin {
    private static hubtool instance;
    public Events events;
    private Object Events;




    @Override
    public void onEnable() {
        this.getLogger().info("===============\n\n\nHub Tools By kotya has been enabled\n\n\nErrors Notfound\n===============");
        setinstance(this);
        instanceClasses();
        //регаем собитЫя
        this.getServer().getPluginManager().registerEvents(new BlockBreack(), this);
        this.getServer().getPluginManager().registerEvents(new BlockPlace(), this);
        this.getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        this.getServer().getPluginManager().registerEvents(new PlayerLeave(), this);
        this.getServer().getPluginManager().registerEvents(new OnDrop(), this);
        this.getServer().getPluginManager().registerEvents(new PlayerHunger(), this);
        this.getServer().getPluginManager().registerEvents(new onPickUp(), this);
        this.getServer().getPluginManager().registerEvents(new PlayerMotionEvent(), this);
        this.getServer().getPluginManager().registerEvents(new Damage(), this);
        this.getServer().getPluginManager().registerEvents(new Chat(), this);
        this.getServer().getPluginManager().registerEvents(new Donate(), this);


        //регаем Гуишки
        this.getServer().getPluginManager().registerEvents(new Donate(), this);
        this.getServer().getPluginManager().registerEvents(new GuiClick(), this);
        this.getServer().getPluginManager().registerEvents(new SelectServerGUI(), this);
    }

    public static hubtool getInstance() {
        return instance;
    }

   private static hubtool setinstance(hubtool instace){
       hubtool.instance = instace;
       return instace;
   }

    private void instanceClasses(){
        Events = new Events();
}
}
