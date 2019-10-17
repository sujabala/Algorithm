package com.algorithm.Algorithm;
import java.util.*;


public class MedianArray {

	public static void main(String[] args) {

		int [] arr = { 4,2,3,5};
		System.out.println(FindMedian(arr));
		
		

	}
	
	public static  int FindMedian(int [] num) {
		Arrays.sort(num);

		int length = num.length;
		
		if(length % 2 != 0) {
			return num[length/2];
		}
		else
		{
			
	
			return (num[length/2] + num[(length/2) -1] ) /2;
		}
		
		
	}

}
