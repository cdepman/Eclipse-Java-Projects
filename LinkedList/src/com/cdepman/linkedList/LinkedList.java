package com.cdepman.linkedList;

public class LinkedList {
	private Node head;
	private Node tail;
	private int size = 0;
	
	public void addToTail(Node nodeToAdd){
		if (this.head == null){
			this.head = nodeToAdd;
		}
		if (this.tail != null){
			this.tail.setNext(nodeToAdd); 
		}
		this.tail = nodeToAdd;
		this.size++;
	}
	
	public boolean contains(int target){
		Node currentNode = this.head;
		
		while (currentNode != null) {
			if (currentNode.getValue() == target){
				return true;
			}
			currentNode = currentNode.getNext();
		};
		
		return false;
	}
	
	public int removeHead(){
		int value = this.head.getValue();
		this.head = this.head.getNext();
		this.size--;
		return value;
	}
	
	public int size(){
		return this.size;
	}
	
	public LinkedList(){
		this.head = null;
		this.tail = null;
	}
}
