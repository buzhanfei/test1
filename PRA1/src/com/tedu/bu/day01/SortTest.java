package com.tedu.bu.day01;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;

public class SortTest {
	
	@Test
	public void arraysTest() {
		int[] a = {9,4,2,6,0,2};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		System.out.println(Arrays.toString(Arrays.copyOf(a, 10)));
	}
	@Test
	public void bubbleSort() {
		while(true) {
			System.out.println("请输入数组长度：");
			int le = new Scanner(System.in).nextInt();
			int[] arr = new int[le];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = (int) (Math.random()*100)+1;
			}
			System.out.println("原数组为："+Arrays.toString(arr));
			for(int i = 1; i <= arr.length-1; i++) {
				for(int j = 0; j < arr.length-i; j++) {
					if(arr[j] > arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
			System.out.println("冒泡排序后的结果为："+Arrays.toString(arr));
		}
	}
	
	/**
	 **二分法求目标位置
	 */
	@SuppressWarnings("resource")
	@Test
	public void binarySort() {
		int key = 0;
		while(true) {
			System.out.println("请输入数组长度：");
			int le = new Scanner(System.in).nextInt();
			int[] arr = new int[le];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = (int) (Math.random()*1000)+1;
				if(i == 0) {
					continue;
				}else {
					for(int j = 0; j < i; j++){
						if(arr[j] == arr[i]) {
							i--;//数组中出现重复数据,重新赋值
						}
					}
				}
			}
			System.out.println("原数组为："+Arrays.toString(arr));
			Arrays.sort(arr);
			System.out.println("升序排序后的结果为："+Arrays.toString(arr));
			System.out.println("请输入要查找的数：");
			int target = new Scanner(System.in).nextInt();
			System.out.println("二分法查 "+target+" 所在位置为下标为：");
			while(true) {
				int mid = bSearchWithoutRecursion(arr,target);
				if(arr[mid] == target) {
					key = mid;
					break;
				}else {
					continue;
				}
			}
			System.out.println(target+"所在下标为："+key);
		}
	}
	/**
	 **二分法求中间位置并返回
	 * @param a
	 * @param target
	 * @return
	 */
	private int bSearchWithoutRecursion(int[] a, int target) {
		int low = 0;
	    int high = a.length - 1;
	    while (low <= high) {
	        int mid = low + (high - low) / 2;
	        if (a[mid] > target)
	            high = mid - 1;
	        else if (a[mid] < target)
	            low = mid + 1;
	        else
	            return mid;
	    }
	    return -1;
	}
}
