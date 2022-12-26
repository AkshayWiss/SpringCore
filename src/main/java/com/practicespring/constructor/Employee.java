package com.practicespring.constructor;
public class Employee {  
	private int id;   

	public Employee() {System.out.println("def cons");}  

	public Employee(int id) {this.id = id;}  

	void show(){  
		System.out.println(id);  
	}  

} 