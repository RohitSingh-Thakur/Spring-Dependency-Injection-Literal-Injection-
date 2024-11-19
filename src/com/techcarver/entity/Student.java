package com.techcarver.entity;

import java.util.List;

public class Student {

	private int id;
	private String name;

	public Student(int id) {
		super();
		this.id = id;
		System.out.println("Constructor called for id");
	}

	public Student(String name) {
		super();
		this.name = name;
		System.out.println("Constructor called for name");
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("Constructor called for id and name");
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}
