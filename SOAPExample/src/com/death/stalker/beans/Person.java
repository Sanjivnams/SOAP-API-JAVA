package com.death.stalker.beans;

import java.io.Serializable;

public class Person implements Serializable {
	
	private String name;
	private int age;
	private int id;
	
	private static final long serialVersionUID = -9769430895L;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", id=" + id + "]";
	}
	
	
	

}
