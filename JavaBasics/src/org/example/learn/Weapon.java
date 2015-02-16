package org.example.learn;

public class Weapon {
	private String name;
	private int damage;
	private int durability;
	
	public Weapon(String name, int damage, int durability) {
		super();
		this.name = name;
		this.damage = damage;
		this.durability = durability;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getDurability() {
		return durability;
	}
	public void setDurability(int durability) {
		this.durability = durability;
	}

}
