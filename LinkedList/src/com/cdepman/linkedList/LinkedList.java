package com.cdepman.linkedList;

public class LinkedList {
	Node head;
	Node tail;
	int size = 0;
	
	public void addToTail(Node nodeToAdd){
		if (this.head == null){
			this.head = nodeToAdd;
		}
		if (this.tail != null){
			Node oldTail = this.tail;
			nodeToAdd.setNext(oldTail);
		}
		this.tail = nodeToAdd;
		this.size++;
	}
	
	public boolean contains(int target){
		Node currentNode = this.tail;
		
		while (currentNode != null) {
			if (currentNode.getValue() == target){
				return true;
			}
			currentNode = currentNode.getNext();
		};
		
		return false;
	}
	
	public int size(){
		return this.size;
	}
	
	public LinkedList(){
		this.head = null;
		this.tail = null;
	}
}
