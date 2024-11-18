package com.sk.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllElementsInAnArrayStartsWith1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5, 9, 11, 2, 8, 21, 1, 51, 109};
		
		List<String> startsWithOne = 
				 Arrays.stream(nums).boxed()
				       .map(s-> s+"")
				       .filter(s-> s.startsWith("1"))
				       .collect(Collectors.toList());
		
		System.out.println("Numbers which are starts with 1 is : "+startsWithOne);

	}

}
