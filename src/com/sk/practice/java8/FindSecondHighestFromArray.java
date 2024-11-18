package com.sk.practice.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class FindSecondHighestFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {5, 9, 11, 2, 8, 21, 1};
		
		Integer secondHighest = Arrays.stream(nums).boxed()
		      .sorted(Comparator.reverseOrder())
		      .skip(1)
		      .findFirst()
		      .orElse(null);
		
		System.out.println("Second Hihest is :"+secondHighest);

	}

}
