package com.sk.practice.java8;

import java.util.Arrays;

public class FindLongestStringFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"java", "tech", "springboot", "microservices"};
		String longestString = 
		        Arrays.stream(str)
		              .reduce((word1, word2)-> 
		                  word1.length()> word2.length() ? word1 : word2)
		              .get();
		
		System.out.println("Longest String is : "+ longestString);

	}

}
