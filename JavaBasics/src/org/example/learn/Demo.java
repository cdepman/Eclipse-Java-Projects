package org.example.learn;
import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		Player Me = new Player("Charlie");
		System.out.println(Me.getHandleName());
		System.out.println("Weapon: " + Me.getWeapon().getName());
		System.out.println(Me.getScore());
		System.out.println(Me.getLives());
		System.out.println(Me.getLevel());
		
		Weapon axe = new Weapon("Heavy Iron Axe", 20, 30);
		Me.setWeapon(axe);
		System.out.println(Me.getWeapon().getName());
		InventoryItem redPotion = new InventoryItem(ItemType.POTION, "Red Potion");
		Me.addInventoryItem(redPotion);
		Me.addInventoryItem(new InventoryItem(ItemType.ARMOR, "+3 Chest Plate"));
		Me.addInventoryItem(new InventoryItem(ItemType.RING, "+2 Ring of Protection"));
		Me.addInventoryItem(new InventoryItem(ItemType.ARMOR, "+1 Copper Cap"));
		
		ArrayList<InventoryItem> allItems = Me.getInventoryitems();
		for (InventoryItem item: allItems){
			System.out.println(item.getName());
		}
	}

}
