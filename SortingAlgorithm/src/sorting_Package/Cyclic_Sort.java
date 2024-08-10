package sorting_Package;

import java.util.Arrays;

// NOTE:
//      When given numbers given in range from 1 to N then use cyclic sort

// Time Complexity in Worst Case:  (N-1)+N 
// O(N)

// only n comparisons and in one loop
public class Cyclic_Sort {

	public static void main(String[] args) {
		int[] arr= {5,2,3,4,1};
		sort(arr);
		System.out.print(Arrays.toString(arr));
	}
	
	static void sort(int[] arr) { 
		int i=0;
		while(i<arr.length) {
			int correct_index=arr[i]-1;
			if(arr[i]!=arr[correct_index]) {
				swap(arr,i,correct_index);
			}else {
				i++;
			}
		}	
	}
	 
	static void swap(int[] arr,int first,int second) {
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}
}
