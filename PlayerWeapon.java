
package com.github.newk5.vcmp.maven.weapons;
import java.util.ArrayList;
import com.maxorator.vcmp.java.plugin.integration.player.Player;
import com.maxorator.vcmp.java.plugin.integration.placeable.Pickup;

import java.util.*;

/**
 *
 * @author Robert
 */

// This class is player related
public class PlayerWeapon {
    //public static ArrayList<Data> playerSlot = new ArrayList<Data>();
    public static HashMap<Integer, Data> playerSlot = new HashMap<>();
    

    //Nested Class
    class Data {
      private int playerModel[] = {0, 1, 2, 3, 4, 5, 6, 7, 8}, playerAmmo[] = {0, 1, 2, 3, 4, 5, 6, 7, 8};
      private String playerName;
      Data(String name) {
        this.playerName = name;
      }
      // I want this to be a direct call
      public void addWeapon(Player player, int playerID, int weaponModel, int slot, int amount ) {
          player.setWeapon(playerSlot.get(playerID).playerModel[slot] = weaponModel , playerSlot.get(playerID).playerAmmo[slot] = player.getAmmoAtSlot(slot) + amount );
      }
    // player weapon slot initiation
    }

    // player weapon slot initiation
      
    public void addPlayerWeaponSlots(String name, int playerID) {
        playerSlot.put(playerID, new Data(name));
    }
    public static void initiatPlayerWeaponSlots(String name, int playerID) {
        PlayerWeapon custom = new PlayerWeapon();
        custom.addPlayerWeaponSlots(name, playerID);
    }

      // Random lazy test
      public static void getWsIndex(int playerID) {
        try {
            //System.out.println(playerSlot.keySet());
            System.out.println(playerSlot.get(playerID).playerName);


            }    
        catch (Exception e) {
          System.out.println("The index does not exist");
        }
      }
}



/*        
       PlayerWeapon.initiatPlayerWeaponSlots("Motley", 0);
        PlayerWeapon.initiatPlayerWeaponSlots("Pussy", 1);
        PlayerWeapon.getWsIndex(0);
        PlayerWeapon.getWsIndex(1);
*/
