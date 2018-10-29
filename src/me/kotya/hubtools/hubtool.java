package me.kotya.hubtools;

import me.kotya.hubtools.Events.*;
import me.kotya.hubtools.Guis.Donate;
import me.kotya.hubtools.Guis.GuiClick;
import me.kotya.hubtools.Guis.SelectServerGUI;
import net.minecraft.server.v1_8_R3.EnumParticle;
import net.minecraft.server.v1_8_R3.PacketPlayOutWorldParticles;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class hubtool extends JavaPlugin {
    private static hubtool instance;
    public Events events;
    private Object Events;
    private Connection connection;
    public String host, database, username, password, table;
    public int port;



    @Override
    public void onEnable() {
        this.getLogger().info("===============\n\n\nHub Tools By kotya has been enabled\n\n\nErrors Notfound\n===============");
        setinstance(this);
        instanceClasses();
        loadConfig();
        mysqlSetup();


        this.getServer().getPluginManager().registerEvents(new me.tscoding.mysql.MysqlSetterGetter(), this);



        //particli
        for (Entity entity : Bukkit.getWorld("world").getEntities()) {
            if (entity instanceof Player) {
                final Player player = (Player) entity;

                new BukkitRunnable() {

                    @Override
                    public void run() {
                        float red = 255;
                        float green =0;
                        float blue = 0;
                        Location location = player.getLocation();

                        PacketPlayOutWorldParticles particles = new PacketPlayOutWorldParticles(EnumParticle.FLAME, true, (float) location.getX(), (float) location.getY(), (float) location.getZ(), red, green, blue, (float)255, 0, 10);
                        ((CraftPlayer) player).getHandle().playerConnection.sendPacket(particles);
                    }
                }.runTaskTimerAsynchronously(this, 0, 0);
            }
        }

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

//MYSQL



    public void loadConfig(){
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

    public void mysqlSetup() {
        host = this.getConfig().getString("host");
        port = this.getConfig().getInt("port");
        database = this.getConfig().getString("database");
        username = this.getConfig().getString("username");
        password = this.getConfig().getString("password");
        table = this.getConfig().getString("table");

        try {

            synchronized (this) {
                if (getConnection() != null && !getConnection().isClosed()) {
                    return;
                }

                Class.forName("com.mysql.jdbc.Driver");
                setConnection(
                        DriverManager.getConnection("jdbc:mysql://" + this.host + ":" + this.port + "/" + this.database,
                                this.username, this.password));

                Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "MYSQL CONNECTED");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

}
