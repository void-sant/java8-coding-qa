package com.sk.practice.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccuranceOfEachCharacter_InString {
	
	public static void main(String[] args) {
		String input = "ilovejava";
		
		Map<String,Long> occurance = Arrays.stream(input.split(""))
		      .collect(Collectors.groupingBy(
		    		                   Function.identity(),
		    		                   Collectors.counting()));
		System.out.println("Character count"+ occurance);
	}

}
