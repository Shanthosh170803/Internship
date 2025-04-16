package com.practice.records;

public class Records {

	public static void main(String[] args) {
		NormalClass normalclass=new NormalClass(1,"abc");
		RecordClass recordclass=new RecordClass(2,"xyz");
		
		System.out.println(normalclass.getId());
		System.out.println(recordclass.id());
		
		System.out.println(normalclass.getName());
		System.out.println(recordclass.name());
		
		System.out.println(recordclass.nameInUpperCase());
		recordclass.print();
		
		System.out.println(RecordClass.DEFAULT_ID);

		try {
		    RecordClass invalidRecord = new RecordClass(-1, "test");
		} catch (IllegalArgumentException e) {
		    System.out.println("Caught exception: " + e.getMessage());
		}

	}

}
