package com.github.newk5.vcmp.maven.weapons;

import java.util.*;
import com.maxorator.vcmp.java.plugin.integration.placeable.Pickup;
import com.github.newk5.vcmp.maven.controllers.MainController;



public class ServerPickup {
    public static HashMap<Integer, Data> list = new HashMap<>();
    
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
    
    // Pickup creation
    public static void main(int iModel, int iPrice, int iWorld, int iRespawnTime, boolean iPickupPicked, float fX, float fY, float fZ) {
        ServerPickup custom = new ServerPickup();
        custom.pickupMechanics(iModel, iPrice, iWorld, iRespawnTime, iPickupPicked, fX, fY, fZ);
    }
    public void pickupMechanics(int model, int price, int world, int respawnTime, boolean pickupPicked, float x, float y, float z) {
      Pickup p = MainController.server.createPickup(model, 0, world, x, y, z, 255, true);
      int iD = p.getId();
      list.put(iD, new Data(model, price, world, respawnTime, pickupPicked, x, y, z));
      System.out.println(iD);
    }
    // Pickup creation
}

/*         ServerPickup.main( 366, 2,  0,  0, false, 0.0f, 0.0f, 0.0f);
*/



