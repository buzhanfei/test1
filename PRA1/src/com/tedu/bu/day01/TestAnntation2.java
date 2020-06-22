package com.tedu.bu.day01;

import java.lang.annotation.Annotation;

public class TestAnntation2 {
	public static void main(String[] args) throws Exception {
		Class<?> forName = Class.forName("com.tedu.bu.day01.TestAnntation1");
		Annotation[] annotations = forName.getAnnotations();
		if(annotations.length > 0) {
			for(int i=0; i<annotations.length; i++) {
				System.out.println(annotations[i].annotationType().getSimpleName()
						.equals("TestAnnotation"));
			}
		}
		
	}
}
