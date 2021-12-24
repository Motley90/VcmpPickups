package com.github.newk5.vcmp.maven.weapons;
import com.github.newk5.vcmp.maven.controllers.MainController;
import com.maxorator.vcmp.java.plugin.integration.placeable.Pickup;

/*
  Finish the config
  Look into Java libraries after to generate respawn time back to world 0
*/

import java.util.ArrayList;
public class WeaponSlot {
    public static ArrayList<Data> list = new ArrayList<Data>();
    
    //Nested Class
    class Data {
      private int model, price, world, respawnTime;
      private float x, y, z;
      private boolean pickupPicked = false;
      Data(int model, int price, int world, int respawnTime, boolean pickupPicked, float x, float y, float z) {
        this.model = model;
        this.price = price;
        this.world = world;
        this.respawnTime = respawnTime;
        this.pickupPicked = pickupPicked;
        this.x = x;
        this.y = y;
        this.z = z;
      }
    }
    public static void main(int iModel, int iPrice, int iWorld, int iRespawnTime, boolean iPickupPicked, float fX, float fY, float fZ) {
        WeaponSlot custom = new WeaponSlot();
        custom.pickupMechanics(iModel, iPrice, iWorld, iRespawnTime, iPickupPicked, fX, fY, fZ);
    }
    public void pickupMechanics(int model, int price, int world, int respawnTime, boolean pickupPicked, float x, float y, float z) {
        list.add(new Data(model, price, world, respawnTime, pickupPicked, x, y, z));
        Pickup p = MainController.server.createPickup(model, 0, world, x, y, z, 255, true);
        int id = p.getId();
        System.out.println(id);
    }

    // Testing the slot
    public static void getIndex(int slot){
      try {
        System.out.println(list.get(slot).model + " " + list.get(slot).price + " " + list.get(slot).world + " " + list.get(slot).respawnTime+ " " + list.get(slot).pickupPicked+ " " + list.get(slot).x+ " " + list.get(slot).y+ " " + list.get(slot).z);
      } 
      catch (Exception e) {
        System.out.println("The index '" + slot + "' does not exist");
      }
    }

}

/*         WeaponSlot.main( 366, 2,  0,  0, false, 0.0f, 0.0f, 0.0f);
           WeaponSlot.getIndex(0);
           WeaponSlot.getIndex(2);

*/
