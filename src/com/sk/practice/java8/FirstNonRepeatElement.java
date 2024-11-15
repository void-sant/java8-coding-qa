package com.sk.practice.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatElement {

	public static void main(String[] args) {
		String input = "ilovejavaprogram";
		
		String firstNonRepeatElement = 
		Arrays.stream(input.split(""))
		      .collect(Collectors.groupingBy(
		    	Function.identity(), LinkedHashMap::new, Collectors.counting()))
		      .entrySet().stream()
		      .filter(x-> x.getValue() == 1)
		      .findFirst().get().getKey();
		
		System.out.println("First non repeat element of "+input+" is :"+firstNonRepeatElement);

	}

}
