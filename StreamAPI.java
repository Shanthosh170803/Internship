package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		
		//Stream Creations
		//Using Collections.stream()
		List<String> names=Arrays.asList("Arun","Balaji","Shanthosh","Raja");
		names.stream().forEach(System.out::println);
		System.out.println("---------------");
		//Using Arrays.stream()
		int[] numbers= {17,8,20,3};
		IntStream numStream=Arrays.stream(numbers);
		numStream.forEach(System.out::println);
		System.out.println("---------------");
		//Using Stream.of()
		Stream<String> indStream=Stream.of("Africa","America","Asia");
		indStream.forEach(System.out::println);
		System.out.println("---------------");
		//Using Stream.generate()
		Stream<String> genStream=Stream.generate(()->"Shanthosh").limit(5);
		genStream.forEach(System.out::println);
		System.out.println("---------------");
		//Using Stream.iterate()
		Stream<Integer> iteStream=Stream.iterate(5, n-> n+1).limit(5);
		iteStream.forEach(System.out::println);
		System.out.println("---------------");
		//Intermediate and Terminal Operations
		//filter()
		List<String> filtername=names.stream().filter(name -> name.startsWith("S")).collect(Collectors.toList());
		System.out.println(filtername);
		System.out.println("---------------");
		//map()
		List<String> mapname=names.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(mapname);
		System.out.println("---------------");
		//sorted()
		List<Integer> array=Arrays.asList(17,8,20,3,17);
		List<Integer> sortnum=array.stream().sorted().collect(Collectors.toList());
		System.out.println(sortnum);
		System.out.println("---------------");
		//distinct()
		List<Integer> distnum=array.stream().distinct().collect(Collectors.toList());
		System.out.println(distnum);
		System.out.println("---------------");
		//Count()
		long count=array.stream().count();
		System.out.println(count);
		System.out.println("---------------");
		//reduce()
		int sumarray=array.stream().reduce(0, Integer::sum);
		System.out.println(sumarray);
		
		
		
		
		
	}

}
