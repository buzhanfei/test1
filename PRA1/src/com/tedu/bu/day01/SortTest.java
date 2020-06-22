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
			System.out.println("���������鳤�ȣ�");
			int le = new Scanner(System.in).nextInt();
			int[] arr = new int[le];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = (int) (Math.random()*100)+1;
			}
			System.out.println("ԭ����Ϊ��"+Arrays.toString(arr));
			for(int i = 1; i <= arr.length-1; i++) {
				for(int j = 0; j < arr.length-i; j++) {
					if(arr[j] > arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
			System.out.println("ð�������Ľ��Ϊ��"+Arrays.toString(arr));
		}
	}
	
	/**
	 **���ַ���Ŀ��λ��
	 */
	@SuppressWarnings("resource")
	@Test
	public void binarySort() {
		int key = 0;
		while(true) {
			System.out.println("���������鳤�ȣ�");
			int le = new Scanner(System.in).nextInt();
			int[] arr = new int[le];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = (int) (Math.random()*1000)+1;
				if(i == 0) {
					continue;
				}else {
					for(int j = 0; j < i; j++){
						if(arr[j] == arr[i]) {
							i--;//�����г����ظ�����,���¸�ֵ
						}
					}
				}
			}
			System.out.println("ԭ����Ϊ��"+Arrays.toString(arr));
			Arrays.sort(arr);
			System.out.println("���������Ľ��Ϊ��"+Arrays.toString(arr));
			System.out.println("������Ҫ���ҵ�����");
			int target = new Scanner(System.in).nextInt();
			System.out.println("���ַ��� "+target+" ����λ��Ϊ�±�Ϊ��");
			while(true) {
				int mid = bSearchWithoutRecursion(arr,target);
				if(arr[mid] == target) {
					key = mid;
					break;
				}else {
					continue;
				}
			}
			System.out.println(target+"�����±�Ϊ��"+key);
		}
	}
	/**
	 **���ַ����м�λ�ò�����
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
