package com.richard.test;


/**
 * Standard FizzBuzz question. 
 * 
 * Notes:
 * The FizzBuzzReport class could easily be consider overkill, but I like to have that 
 * simple administrative work out of the core code. 
 * Having the StringBuilder is useful so that the output can be returned to JUnits testing code for checking. 
 * There's an argument for rolling the StringBuilder into the FizzBuzzReport, then each method is returning 
 * the same object - then the 'result' is in one object. 
 * 
 * @author richard
 *
 */
public class FizzBuzzer {
	
	public String step1(final int start, final int end){
		
		if(end < start){
			throw new IllegalArgumentException("End must be greater than start");
		}
		
		StringBuilder stringBuilder = new StringBuilder();
		
		for(int i = start; i <= end; i++){
			
            if (i % 15 == 0) {
            	stringBuilder.append("fizzbuzz");
            } else if (i % 3 == 0) {
            	stringBuilder.append("fizz");
            } else if (i % 5 == 0) {
            	stringBuilder.append("buzz");
            } else {
            	stringBuilder.append(i);
            }
            stringBuilder.append(" ");
		}
		
		return stringBuilder.toString().trim();
		
	}
	
	public String step2(final int start, final int end){
		
		if(end < start){
			throw new IllegalArgumentException("End must be greater than start");
		}
		
		StringBuilder stringBuilder = new StringBuilder();
		
		for(int i = start; i <= end; i++){
			
			if(String.valueOf(i).contains("3")){
				stringBuilder.append("lucky");
			} else if (i % 15 == 0) {
            	stringBuilder.append("fizzbuzz");
            } else if (i % 3 == 0) {
            	stringBuilder.append("fizz");
            } else if (i % 5 == 0) {
            	stringBuilder.append("buzz");
            } else {
            	stringBuilder.append(i);
            }
            stringBuilder.append(" ");
		}
		
		return stringBuilder.toString().trim();
	}
	
	public FizzBuzzReport step3(final int start, final int end){
		
		if(end < start){
			throw new IllegalArgumentException("End must be greater than start");
		}
		
		FizzBuzzReport report = new FizzBuzzReport();
		report.orderKeys("fizz buzz fizzbuzz lucky integer"); // optional
		
		StringBuilder stringBuilder = new StringBuilder();
		
		for(int i = start; i <= end; i++){
			
			if(String.valueOf(i).contains("3")){
				stringBuilder.append("lucky");
				report.inc("lucky");
			} else if (i % 15 == 0) {
            	stringBuilder.append("fizzbuzz");
            	report.inc("fizzbuzz");
            } else if (i % 3 == 0) {
            	stringBuilder.append("fizz");
            	report.inc("fizz");
            } else if (i % 5 == 0) {
            	stringBuilder.append("buzz");
            	report.inc("buzz");
            } else {
            	stringBuilder.append(i);
            	report.inc("integer");
            }
            stringBuilder.append(" ");
		}
		System.out.println(stringBuilder.toString().trim());
		
		System.out.println(report);
		
		return report;
	}

}