package com.richard.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;


/**
 * FizzBuzz questions for an interview. 
 * Step 1: Standard FizzBuzz
 * Step 2: Standard plus if the integer has a '3' in it then print 'lucky' instead
 * Step 3: Same as step two but count the number of occurrences of each word
 */
public class FizzBuzzTester {
	
	private static String newline = System.getProperty("line.separator");

	@Test
	public void test() {
		FizzBuzzer fizzbuzzer = new FizzBuzzer();
		
		String output = fizzbuzzer.step1(1, 20);
		
		String expected = "1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz";
		System.out.println("Expected: " + expected);
		System.out.println("Output  : " + output);
		
		assertTrue("Output for step1 is incorrect. Expected " + expected + ", got " + output, expected.equals(output));

	}
	
	@Test
	public void testStep2() {
		FizzBuzzer fizzbuzzer = new FizzBuzzer();
		
		String output = fizzbuzzer.step2(1, 20);
		
		String expected = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz";
		System.out.println("Expected: " + expected);
		System.out.println("Output  : " + output);
		
		assertTrue("Output for step2 is incorrect. Expected " + expected + ", got " + output, expected.equals(output));

	}
	
	@Test
	public void testStep3() {
		FizzBuzzer fizzbuzzer = new FizzBuzzer();

		FizzBuzzReport report = fizzbuzzer.step3(1, 20);
		
		System.out.println("Test 3");
		System.out.println("Output:" + newline + report);
		
		Map<String, Integer> expectedMap = new LinkedHashMap<String, Integer>();
		expectedMap.put("lucky", 2);
		expectedMap.put("fizz", 4);
		expectedMap.put("buzz", 3);
		expectedMap.put("fizzbuzz", 1);
		expectedMap.put("integer", 10);
		for(String key: expectedMap.keySet()){
			assertTrue("The count for " + key + " is wrong, expected" + expectedMap.get(key) + " got " + report.get(key), 
					report.get(key) == expectedMap.get(key));
		}
	}

}