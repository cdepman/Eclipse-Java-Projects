package com.cdepman.linkedList;

public class Demo {
	
	public static void main(String[] args){
		LinkedList myLL = new LinkedList();
		
		int[] vals = {55,35,15,5,42};
		
		for (int num: vals){
			Node newNode = new Node(num);
			myLL.addToTail(newNode);
		}
		
		System.out.println(myLL.contains(55));
		System.out.println(myLL.contains(35));
		System.out.println(myLL.contains(15));
		System.out.println(myLL.contains(5));
		System.out.println(myLL.contains(7));
		System.out.println(myLL.contains(42));
		System.out.println(myLL.size());
		System.out.println(myLL.removeHead());
		System.out.println(myLL.size());
		System.out.println(myLL.contains(55));
		
		
		
	}

}
