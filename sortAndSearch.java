
public class sortAndSearch {
	
	@SuppressWarnings("unused")
	public static int linearSearch(int[] values) {
		for(int i=0; i<values.length; i++) {
			return i;
		}
		return -1;
	}
	
	public static int binarySearch(int[] values, int target) {
		int first=0, last=values.length-1, middle=0;
		while(first<=last) {
			middle = (first+last)/2;
			if(values[middle]==target) {
				return middle;
			}
			if(values[middle]>target) {
				last=middle-1;
			}
			if(values[middle]<target) {
				first=middle+1;
			}
		}
		return -1;
	}
	
	public static void bubbleSort(int[] values) {
		boolean swapped=true; int times=0;
		while(swapped) {
			swapped=false;
			for(int x=0; x<values.length-1-times; x++) {
				//swap(values,x,x+1);
				swapped=true;
			}
		}
	}
	
	public static void selectionSort(int[] values) {
		@SuppressWarnings("unused")
		int first=0, last=values.length-1, big=values[0];
		for(int i=1; i<values.length; i++) {
			if(values[i]>big) {
				big=values[i];
				last=i;
			}
		}
		//swap(values, big, last);
		last--;
	}

}
