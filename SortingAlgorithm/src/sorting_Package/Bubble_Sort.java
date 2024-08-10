package sorting_Package;

import java.util.Arrays;

// Also known as Sinking Sort or Exchange Sort
// Best Case Time Complexity O(N)
// Worst Case Time Complexity O(N'2)

// Unstable

public class Bubble_Sort {
// As the size of array is growing the number of comparisons is also growing
	
	public static void main(String[] args) {
		int[] arr= {11,2,34,-1,0,88};
		Bubble(arr);
		System.out.print(Arrays.toString(arr));
	}
	
	static void Bubble(int[] arr) {
		boolean swapped;
		//run the steps n-1 times
		for(int i=0;i<arr.length;i++) {
			swapped=false;
			// for each step , max item will come at the last respective index
			for(int j=1;j<arr.length-i;j++) {
				//swap if the item is smaller than the previous
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swapped=true;
				}			
			}
			
			//if  you did not swap for a particular value of i, it means the array is sorted,hence stop the program
			
			if(!swapped) {// !false=true
				break;
			}
		}
	}

}
