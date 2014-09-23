package com.richard.fizzbuzz;

import java.util.LinkedHashMap;
import java.util.Map;

public class FizzBuzzReport {

	private final Map<String, Integer> counts = new LinkedHashMap<String, Integer>();
	private final static String newline = System.getProperty("line.separator");

	public void inc(String key){

		if(!counts.containsKey(key)){
			counts.put(key, 0);
		}
		counts.put(key, counts.get(key) + 1);
	}
	
	public int get(String key){
		return counts.get(key);
	}

	public void orderKeys(String ordering) {
		
		if(ordering == null || ordering.isEmpty()){
			return;
		}
		
		String[] keys = ordering.split(" ");
		for(String key: keys){
			counts.put(key, 0);
		}
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		
		for(String key: counts.keySet()){
			buffer.append(key).append(":").append(counts.get(key)).append(newline);
		}
		return buffer.toString();
	}

}