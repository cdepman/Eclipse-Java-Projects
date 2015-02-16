package org.example.learn;

public class Player {
	private String handleName;
	private int lives;
	private int level;
	private int score;
	private Weapon weapon;
	
	public Player(String handleName) {
		super();
		this.handleName = handleName;
		this.lives = 5;
		this.level = 1;
		this.score = 0;
		setDefaultWeapon();
	}
	
	private void setDefaultWeapon(){
		this.weapon = new Weapon("Sword", 10, 20);
	}
	
	public String getHandleName(){
		return handleName;
	}
	
	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public void setHandleName(String name){
		this.handleName = name;
	}

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
