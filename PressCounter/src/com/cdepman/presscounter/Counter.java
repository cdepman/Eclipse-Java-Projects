package com.cdepman.presscounter;

public class Counter {
	private int count = 0;
	
	public String getCount() {
		int num = this.count;
		
		if (num == 0){
			return "0";
		} else if (num % 15 == 0){
			return "FizzBuzz";
		} else if (num % 5 == 0){
			return "Fizz";
		} else if (num % 3 == 0){
			return "Buzz";
		} else {
			return Integer.toString(num); 
		}
		
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void decrement(){
		this.count--;
	}
	public void increment(){
		this.count++;
	}
	public void reset(){
		this.count = 0;
	}
}
