package com.sk.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindAllDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "ilovejavaprogram";
		
		List<String> duplicateElements = 
				Arrays.stream(input.split(""))
				      .collect(Collectors.groupingBy(
				    		  Function.identity(),
				    		  Collectors.counting()))
				      .entrySet().stream()
				      .filter(x-> x.getValue()>1)
				      .map(Map.Entry:: getKey)
                      .collect(Collectors.toList());
		
		System.out.println(duplicateElements);

	}

}
