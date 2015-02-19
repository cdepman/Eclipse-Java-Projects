package com.cdepman.tree;

import java.util.ArrayList;

public class Tree {
	private int value;
	private ArrayList<Tree> children;
	
	public void addChild(int val){
		this.children.add(new Tree(val));
	}
	
	public Tree(int val){
		this.value = val;
	}
}
