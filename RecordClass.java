package com.practice.records;

public record RecordClass(int id, String name) {
	
	public static final int DEFAULT_ID=0;
	
	public RecordClass(int id,String name){
		if(id<0)
			throw new IllegalArgumentException("Id cannot be less than zero...");
		this.id=id;
		this.name=name;
	}
	public String nameInUpperCase() {
		return name.toUpperCase();
	}
	
	public static void print() {
		System.out.println("Print method called....");
	}
}
