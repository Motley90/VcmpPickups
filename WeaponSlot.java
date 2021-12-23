package com.github.newk5.vcmp.maven.weapons;
import java.util.ArrayList;
public class WeaponSlot {
    public static ArrayList<Data> list = new ArrayList<Data>();
    class Data {
    private int model, price, world, respawnTime;
    private boolean pickupPicked = false;
        Data(int model, int price, int world, int respawnTime, boolean pickupPicked) {
            this.model = model;
            this.price = price;
            this.world = world;
            this.respawnTime = respawnTime;
            this.pickupPicked = pickupPicked;
        }
    }
    public static void main(int iModel, int iPrice, int iWorld, int iRespawnTime, boolean iPickupPicked) {
        WeaponSlot custom = new WeaponSlot();
        custom.pickupMechanics(iModel, iPrice, iWorld, iRespawnTime, iPickupPicked);
    }
    public void pickupMechanics(int model, int price, int world, int respawnTime, boolean pickupPicked) {
        list.add(new Data(model, price, world, respawnTime, pickupPicked));
    }
    public static void getIndex(int slot){
      if (list.get(slot).model == slot) {
        System.out.println(list.get(slot).model + " " + list.get(slot).price + " " + list.get(slot).world + " " + list.get(slot).respawnTime+ " " + list.get(slot).pickupPicked);
      }
    }
}

/*
        WeaponSlot.main( 0,  2,  0,  0, false);
        WeaponSlot.main( 1,  3,  0,  0, false);
        WeaponSlot.main( 2,  0,  0,  0, false);
        WeaponSlot.main( 3,  0,  0,  0, false);        
        WeaponSlot.main( 4,  0,  0,  0, false);
        WeaponSlot.main( 5,  0,  0,  0, false);
        WeaponSlot.main( 6,  0,  0,  0, false);
        WeaponSlot.main( 7,  0,  0,  0, true);
        WeaponSlot.getIndex(1);
*/
