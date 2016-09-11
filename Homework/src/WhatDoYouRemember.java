
public class WhatDoYouRemember {
	
	public static int max(int[] values, int lowerbound, int upperbound) {
		
		int maximum = values[lowerbound];
		
		for(int x = lowerbound+1; x <= upperbound; x++) {
			
			if(maximum < values[x]) {
				
				maximum = values[x];
				
			}
				
		}
		
		return maximum;
		
	}
	
	
	public static int min(int[] values, int lowerbound, int upperbound) {
		
		int minimum = values[lowerbound];
		
		for(int x = lowerbound+1; x <= upperbound; x++) {
			
			if(minimum > values[x]) {
				
				minimum = values[x];
				
			}
				
		}
		
		return minimum;
		
	}
	
	
	public static int maxIndex(int[] values, int lowerbound, int upperbound) {
		
		int maximum = values[lowerbound];
		int location = lowerbound;
		
		for(int x = lowerbound+1; x <= upperbound; x++) {
			
			if(maximum < values[x]) {
				
				maximum = values[x];
				location = x;
				
			}
				
		}
		
		return location;
		
	}
	
	
	public static int minIndex(int[] values, int lowerbound, int upperbound) {
		
		int minimum = values[lowerbound];
		int location = lowerbound;
		
		for(int x = lowerbound+1; x <= upperbound; x++) {
			
			if(minimum > values[x]) {
				
				minimum = values[x];
				location = x;
				
			}
				
		}
		
		return location;
		
	}
	
	
	public static int occurrences(int[] values, int lowerbound, int upperbound, int target) {
		
		int times = 0;
		
		for(int x = lowerbound; x<= upperbound; x++) {
			
			if(values[x] == target) {
				
				times++;
				
			}
			
		}
		
		return times;
		
	}
	
	
	public static boolean contains(int[] values, int lowerbound, int upperbound, int target) {
		
		for(int x = lowerbound; x<= upperbound; x++) {
			
			if(values[x] == target) {
				
				return true;
				
			}
			
		}
		
		return false;

	}
	
	
	public static int indexOf(int[] values, int lowerbound, int upperbound, int target) {
		
		for(int x = lowerbound; x<= upperbound; x++) {
			
			if(values[x] == target) {
				
				return x;
				
			}
			
		}
		
		return -1;
		
	}
	
	
	public static void swap(int[] values, int first, int second) {
		
		int num1 = values[first];
		int num2 = values[second];
		
		values[first] = num2;
		values[second] = num1;
		
	}
	
}
