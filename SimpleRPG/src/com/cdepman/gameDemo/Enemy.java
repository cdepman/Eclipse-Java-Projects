package com.cdepman.gameDemo;

public class Enemy {
	private int hitPoints;
	private int lives;
	private int damagePotential;
	
	public Enemy(int hitPoints, int lives, int damagePotential){
		this.hitPoints = hitPoints;
		this.lives = lives;
		this.damagePotential = damagePotential;
	}
	
	public int getDamagePotential() {
		return damagePotential;
	}

	public void setDamagePotential(int damagePotential) {
		this.damagePotential = damagePotential;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}
	
	public void takeDamage(int damage){
		int remainingHitPoints = getHitPoints() - damage;
		setHitPoints(remainingHitPoints);
		System.out.println("I took " + damage + " points damage and have " + remainingHitPoints + " left");
	}

}
