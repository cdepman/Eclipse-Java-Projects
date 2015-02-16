package org.example.learn;

public class Demo {
	public static void main(String[] args) {
		Player Me = new Player("Charlie");
		System.out.println(Me.getHandleName());
		System.out.println(Me.getWeapon().getName());
		System.out.println(Me.getScore());
		System.out.println(Me.getLives());
		System.out.println(Me.getLevel());
	}

}
