package com.cdepman.gameDemo;

public class SuperSoldier extends Enemy{
	public SuperSoldier(int hitPoints, int lives, int damagePotential){
		super(hitPoints, lives, damagePotential);
	}
	
	public void takeDamage(int damage){
		super.takeDamage(damage/2);
	}
}
