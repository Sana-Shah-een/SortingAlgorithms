package sorting_Package;

import java.util.*;
public class Selection_Sort {

//	Worst Case Time Complexity -> O(N'2)
//	Best Case Time Complexity -> O(N'2)
	
//	Unstable
	
//	Selection Sort performs well on small lists / Array
	
	public static void main(String[] args) {
		   int[] arr={3,-2,4,1,6};
		   sortion(arr);
	        System.out.println(Arrays.toString(arr));
	        
	        int[] arr1={3,-2,40,-11,-6};
	        sortionKunalAlgo(arr1);
	        System.out.println(Arrays.toString(arr1));
	}
	
	 static void sortion(int[] arr){
//	        run the loop for n-1 passes: i<arr.length--> n-1
	        for(int i=0;i<arr.length;i++){
	            int max=i;
	            for(int j=0;j<arr.length;j++){
	                if(arr[max]<arr[j]){
	                    max=j;
	                }
	                int temp=arr[max];
		            arr[max]=arr[i];
		            arr[i]=temp;
	            }
	        }
	    }
	 
	 static void sortionKunalAlgo(int[] arr) {
		 for(int i=0;i<arr.length;i++) {
		 //find the max item in the remaining Array and swap with correct index
		 int last=arr.length-i-1;
		 
		 int maxIndex=getmaxIndex(arr,0,last);
		 swap(arr,maxIndex,last);
		}
	 }
	 static void swap(int[] arr,int first,int last) {
		 int temp=arr[first];
		 arr[first]=arr[last];
		 arr[last]=temp;
	 }
	 static int getmaxIndex(int[] arr,int start,int end) {
		 int max=start;
		 for(int i=start;i<=end;i++) {
			 if(arr[max]<arr[i]) {
				 max=i;
			 }
		 }
		 return max;
	 }
}

