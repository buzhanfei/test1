package com.tedu.bu.day01;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = new int[] {12,34,67,89,11,34,55,4,7,1};
		int[] arr1 = sort(arr);
		System.out.println(Arrays.toString(arr1));
	}

	private static int[] sort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
}
