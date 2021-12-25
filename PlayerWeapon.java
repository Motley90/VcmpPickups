package com.github.newk5.vcmp.maven.weapons;
import com.maxorator.vcmp.java.plugin.integration.player.Player;

import java.util.*;

public class PlayerWeapon {
    public static HashMap<Integer, Data> playerSlot = new HashMap<>();
    class Data {
      private int playerModel[] = {0, 1, 2, 3, 4, 5, 6, 7, 8}, playerAmmo[] = {0, 1, 2, 3, 4, 5, 6, 7, 8};
      private String playerName;
      Data(String name) {
        this.playerName = name;
      }
    }
    public void addPlayerWeaponSlots(String name, int playerID) {
      playerSlot.put(playerID, new Data(name));
    }
    public static void initiatPlayerWeaponSlots(String name, int playerID) {
      PlayerWeapon custom = new PlayerWeapon();
      custom.addPlayerWeaponSlots(name, playerID);
    }
    //---------------------------------
    public static void addWeapon(Player player, int playerID, int weaponModel, int slot, int amount ) {
      player.setWeapon(playerSlot.get(playerID).playerModel[slot] = weaponModel , playerSlot.get(playerID).playerAmmo[slot] = player.getAmmoAtSlot(slot) + amount );
    } 
    public static void addToWeapon(Player player, int playerID, int slot, int model) {
      // Mostly for changing the model manually, prefered method
      playerSlot.get(playerID).playerModel[slot] = model;
      playerSlot.get(playerID).playerAmmo[slot] = player.getAmmoAtSlot(slot);
      player.setWeapon(playerSlot.get(playerID).playerModel[slot], playerSlot.get(playerID).playerAmmo[slot]);
    }
    public static void addToAmmo(Player player, int playerID, int slot, int ammo) {
      // Mostly for updating the ammo manually, prefered method
     playerSlot.get(playerID).playerAmmo[slot] = player.getAmmoAtSlot(slot) + ammo;
     player.setWeapon(playerSlot.get(playerID).playerModel[slot], playerSlot.get(playerID).playerAmmo[slot]);

      // Test if getAmmoAtSlot is writable or only readable. If writable it can get updated here
    } 
    //---------------------------------
}

