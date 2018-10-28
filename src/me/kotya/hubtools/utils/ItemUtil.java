package me.kotya.hubtools.utils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class ItemUtil {




    public static ItemStack newItem(Material mat, int count, String name){

        ItemStack item = new ItemStack(mat, count);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        item.setItemMeta(meta);



        return item;
    }


    public static ItemStack newItemWithLore(Material mat, int count, String name, String s){
        ItemStack item = new ItemStack(mat, count);
        ItemMeta meta = item.getItemMeta();
        meta.setLore(Arrays.asList(s));
        meta.setDisplayName(name);
        item.setItemMeta(meta);



        return item;
    }

    /*

     */


    public static ItemStack newItemWithLore0(Material mat, int count, String name, String s, String s1, String s2, String s3){
        ItemStack item = new ItemStack(mat, count);
        ItemMeta meta = item.getItemMeta();
        meta.setLore(Arrays.asList(s));
        meta.setLore(Arrays.asList(s1));
        meta.setLore(Arrays.asList(s2));
        meta.setLore(Arrays.asList(s3));
        meta.setDisplayName(name);
        item.setItemMeta(meta);



        return item;
    }



}
