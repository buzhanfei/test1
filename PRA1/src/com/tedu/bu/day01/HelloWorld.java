package com.tedu.bu.day01;


public class HelloWorld {
	/**
	 **文档注释
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello World!!!");
		People p = new Papa();
		p.setName("王会勤");
		System.out.println(p.getName());
		p.play();//单行注释
		/*你好呀多行注释*/
	}
}
class People{
	private String name;
	private Integer age;
	private Integer num;
	
	public People() {
	}

	public People(String name, Integer age, Integer num) {
		super();
		this.name = name;
		this.age = age;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + ", num=" + num + "]";
	}
	
	public void play() {
		System.out.println("Playing Games One!!!");
	}
	
}
class Papa extends People{
	public void play() {
		System.out.println("Playing Games Papa!!!");
	}
}
