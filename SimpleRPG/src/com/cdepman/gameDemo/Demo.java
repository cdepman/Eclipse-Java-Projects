package com.cdepman.gameDemo;
import java.util.ArrayList;

public class Demo {
	
	public static void displayStats(Player player){
		System.out.println("Name: " + player.getHandleName());
		System.out.println("Score: " + player.getScore());
		System.out.println("Level: " + player.getLevel());
		System.out.println("Lives: " + player.getLives());
		System.out.println("Weapon: " + player.getWeapon().getName());

		ArrayList<InventoryItem> allItems = player.getInventoryitems();
		System.out.println("Inventory:");
		for (InventoryItem item: allItems){
			System.out.println(item.getName());
		}
	}
	
	public static void main(String[] args) {
		Player Me = new Player("Charlie");
		
		Weapon axe = new Weapon("Heavy Iron Axe", 20, 30);
		
		Me.setWeapon(axe);
		InventoryItem redPotion = new InventoryItem(ItemType.POTION, "Red Potion");
		Me.addInventoryItem(redPotion);
		Me.addInventoryItem(new InventoryItem(ItemType.ARMOR, "+3 Chest Plate"));
		Me.addInventoryItem(new InventoryItem(ItemType.RING, "+2 Ring of Protection"));
		Me.addInventoryItem(new InventoryItem(ItemType.ARMOR, "+1 Copper Cap"));
		
		displayStats(Me);
		
		Me.dropInventoryItem(redPotion);
		
		displayStats(Me);
		
		Enemy enemy1 = new Enemy(10, 3, 5);
		enemy1.takeDamage(3);
		
		Soldier soldier1 = new Soldier(25, 1, 11);
		soldier1.takeDamage(10);
	}

}
