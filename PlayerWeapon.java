
package com.github.newk5.vcmp.maven.weapons;
import java.util.ArrayList;
import com.maxorator.vcmp.java.plugin.integration.player.Player;


/**
 *
 * @author Robert
 */

// This class is player related
public class PlayerWeapon {
    public static ArrayList<Data> playerSlot = new ArrayList<Data>();

    //Nested Class
    class Data {
      private int playerModel[] = {0, 1, 2, 3, 4, 5, 6, 7, 8}, playerAmmo[] = {0, 1, 2, 3, 4, 5, 6, 7, 8};
      private String playerName;
      Data(String name) {
        this.playerName = name;
      }
      // I want this to be a direct call
      public void addWeapon(String player, int weaponModel, int slot, int amount ) {
          player.setWeapon(model[slot] = weaponModel , ammo[slot] = player.getAmmoAtSlot(slot) + amount );
      }
    // player weapon slot initiation
    }

    // player weapon slot initiation
      
    public void addPlayerWeaponSlots(String name) {
        playerSlot.add(new Data(name));
    }
    public static void initiatPlayerWeaponSlots(String name) {
        PlayerWeapon custom = new PlayerWeapon();
        custom.addPlayerWeaponSlots(name);
    }

      // Random lazy test
      public static void getWsIndex(String playerName, int weapon) {
        try {
          for (int i = 0; i < playerSlot.size(); i++) {
            if (playerSlot.get(i).playerName == "Motley") { 
             playerSlot.get(i).playerModel[weapon] = 266;
             playerSlot.get(i).playerAmmo[weapon] = 266;
              System.out.print( playerSlot.get(i).playerModel[weapon] + " " + playerSlot.get(i).playerAmmo[weapon] );
              System.out.println( playerSlot.get(i).playerName + " is at slot " + i);
            }
            if (playerSlot.get(i).playerName == "Pussy") { 
             playerSlot.get(i).playerModel[weapon] = 100;
             playerSlot.get(i).playerAmmo[weapon] = 66;
              System.out.print( playerSlot.get(i).playerModel[weapon] + " " + playerSlot.get(i).playerAmmo[weapon] );
              System.out.println( playerSlot.get(i).playerName + " is at slot " + i);
            }
            if (playerSlot.get(i).playerName == "Motley") { 
              System.out.print( playerSlot.get(i).playerModel[weapon] + " " + playerSlot.get(i).playerAmmo[weapon] );
              System.out.println( playerSlot.get(i).playerName + " is at slot " + i);
            }
            if (playerSlot.get(i).playerName == "Pussy") { 
              System.out.print( playerSlot.get(i).playerModel[weapon] + " " + playerSlot.get(i).playerAmmo[weapon] );
              System.out.println( playerSlot.get(i).playerName + " is at slot " + i);
            }
          }
          
        } 
        catch (Exception e) {
          System.out.println("The index does not exist");
        }
      }
}



/*        
       PlayerWeapon.initiatPlayerWeaponSlots("Motley");
        PlayerWeapon.initiatPlayerWeaponSlots("Pussy");
        PlayerWeapon.getWsIndex("Motley", 8);
        PlayerWeapon.getWsIndex("Pussy", 8);
*/
