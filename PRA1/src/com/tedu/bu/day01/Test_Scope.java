package com.tedu.bu.day01;

public class Test_Scope {
	private static String s;
	public static void main(String[] args) {
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		char c = 1255;
		char c1 = '��';
		char c2 = 'H';
		System.out.println(c+"|"+c1+"||"+c2);
		System.out.println(s);
		System.out.println(0020);
		StringBuilder s = new StringBuilder("�Ұ���");
		char[] ch = new char[] {'��','��','��'};
		String s1 = new String(ch);
		s.append(s1);
		System.out.println(s);
		System.out.println(1 | 3);//��λ��(���߶�������)
		System.out.println(true || false);//��·��
		int year = 1999;
		System.out.println(leapOrNoLeapYear(year));
	}
	
	private static String leapOrNoLeapYear(int year) {
		if((year%4==0 && year%100!=0) || year%400==0) {
			return year+"�������꣡����";
		}else {
			return year+"��ƽ�꣡����";
		}
	}
	
	
}
