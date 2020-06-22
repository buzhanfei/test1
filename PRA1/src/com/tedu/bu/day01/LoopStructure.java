package com.tedu.bu.day01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

import org.junit.Test;



public class LoopStructure {	
	
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		add1(a, b);
		System.out.println(add1(a));
	}
	private static int add1(int a) {
		return a;
	}
	private static void add1(int a, int b) {
		System.out.println("�޷���ֵ");
		
	}
	@Test
	public void switchTest() {
		String s = "������";
		switch(s) {
			case "����": System.out.println(s+"����Ů");break;
			case "��	  ʩ": System.out.println(s+"����Ů");break;
			case "��   ��": System.out.println(s+"����Ů");break;
			case "���Ѿ�": System.out.println(s+"����Ů");break;
			case "������": System.out.println(s+"����Ů");break;
			default: System.out.println("û��ƥ�������");
		}
	}

	@Test
	public void singleIf() {
		while(true) {
			System.out.println("������۸񣡣���");
			Scanner scanner = new Scanner(System.in);
			double price =scanner.nextDouble();
			if(price<100 && price>=0) {
				System.out.println("��һ�׶�");
			}else if(price<=500){
				System.out.println("�ڶ��׶�");
			}else {
				System.out.println("�����׶�");
			}
		}
	}
	
	@Test
	public void TestTest() {
		System.out.println("���");
	}
	
	@Test
	public void forTest() {
		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	@Test
	public void breakAndContinue() {
		while(true) {
			int a = new Scanner(System.in).nextInt();
			if(a==88) {
				System.out.println("�¶�\n����");
				break;
			}else {
				System.out.println("����");
				continue;
			}
		}
	}
	
	@Test
	public void whileTest() {
		while(true) {
			int a = (int) (Math.random()*10)+1;
			System.out.println(a);
			UUID uuid = UUID.randomUUID();
			System.out.println(uuid);
		}
	}
	
	@Test
	public void arrayTest() {
		int[] a = {1,3,5,22,4};
		char[] c = new char[10];
		c[0] = '0';
		c[1] = '2';
		c[2] = '3';
		c[3] = '4';
		c[4] = '5';
		c[5] = '6';
		c[6] = '7';
		c[7] = '8';
		c[8] = '9';
		c[9] = '1';
		System.out.println(Arrays.toString(a));
		System.out.println(c);
		String[] s = new String[] {"123","456","789"};
		System.out.println(Arrays.toString(s));
		for(int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		System.out.println();
		int[][] i = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		for (int j = 0; j < i.length; j++) {
			for (int j2 = 0; j2 < i[j].length; j2++) {
				System.out.print(i[j][j2]+" ");
			}
			System.out.println();
		}
		
	}
}
