import java.util.Comparator;


// Public class to hold insertion sort algorithms for the array of int and the array of strings

// Insertion sort sorts the array in multiple phases, 
// each pass successively swaps the neighboring elements, 
// if the elements are not in order.
public class InsertionSort {
	
	
	// Method to carry out insertion sort on the array of integers
	public static int[] insertionSort(int[] in) {
		
		// Make a safe copy of the array (original input array should not be mutated)
		int[] safeArrayCopy = new int[in.length];
		
		for (int i = 0; i < safeArrayCopy.length; i++)
			safeArrayCopy[i] = in[i];
				
		if (safeArrayCopy.length <= 1 ) {
			return safeArrayCopy;
		}
		
		
		// Set the default value of next pass "switcher" 
		boolean needNextPass =  true;
		
		
		// Outer loop to handle insertion progression along the array
		for (int k = 1; k < safeArrayCopy.length && needNextPass; k++) {
			
			// Set assumption that the array is already sorted, so the next pass will not be needed
			// The assumption will be changed to "true" in case a swapping case will take place within the current loop 
			needNextPass = false;
			
			
			// Inner loop to handle comparison of neighboring elements in the array
			for (int i = 0; i < safeArrayCopy.length - k; i++) {
				
				// If neighboring elements are in descending order
				if (safeArrayCopy[i] > safeArrayCopy[i + 1]) {
					
					// Swap the neighboring elements so the order is ascending
					int temp = safeArrayCopy[i];
					safeArrayCopy[i] = safeArrayCopy[i + 1];
					safeArrayCopy[i + 1] = temp;
					
					// Since the swapping took place, the next pass is needed
					needNextPass = true;
				}
			}
		}
		
		return safeArrayCopy;
	}
	
	
	
	
	// Method to carry out insertion sort on the array of strings
	public static String[] insertionSort(String[] in, Comparator<String> c) {
		
		// Make a safe copy of the array (original input array shall not be mutated)
		String[] safeArrayCopy = new String[in.length];
				
		for (int i = 0; i < safeArrayCopy.length; i++)
			safeArrayCopy[i] = in[i];
			
		
		// If the array's length is 1 or 0, return the array at this point
		if (safeArrayCopy.length <= 1)
			return safeArrayCopy;
		
		
				
		// Set the default value of next pass "switcher" 
		boolean needNextPass =  true;
				
				
		// Outer loop to handle insertion progression along the array
		for (int k = 1; k < safeArrayCopy.length && needNextPass; k++) {
					
			// Set assumption that the array is already sorted, so the next pass will not be needed
			// The assumption will be changed to "true" in case a swapping case will take place within the current loop 
			needNextPass = false;
					
					
			// Inner loop to handle comparison of neighboring elements in the array
			for (int i = 0; i < safeArrayCopy.length - k; i++) {
						
				// If neighboring elements are in descending order
				if (c.compare(safeArrayCopy[i], safeArrayCopy[i + 1]) < 0) {
							
							// Swap the neighboring elements so the order is ascending
							String temp = safeArrayCopy[i];
							safeArrayCopy[i] = safeArrayCopy[i + 1];
							safeArrayCopy[i + 1] = temp;
							
							// Since the swapping took place, the next pass is needed
							needNextPass = true;
				}
			}
		}
				
		return safeArrayCopy;
	}
	
	
	
	// Program starting point
	public static void main(String[] args) {
		
		
		// Implement insertion sort on the array of integers
		int[] originalArray = {7, 10, 9, 4, 1, -20, -7, 6, 15, 17};
		int[] insertionSortedArray = insertionSort(originalArray);
		
		
		// Print out the original array
		for (int i = 0; i < originalArray.length; i++)
			System.out.print(originalArray[i] + " ");
		 
		// Break line
		System.out.println();
		
		// Print out the sorted array
		for (int i = 0; i < insertionSortedArray.length; i++)
			System.out.print(insertionSortedArray[i] + " ");
		
		
		
		
		
	}
	
}
