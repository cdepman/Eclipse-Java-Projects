package org.example.learn;

public class PlayerInventory {
	enum ItemType { POTION, RING, ARMOR, WEAPON };
	
	private ItemType type;
	private String name;
	
	public PlayerInventory(ItemType type, String name){
		super();
		this.type = type;
		this.name = name;
	}
}
