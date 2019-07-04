package com.app.java;

public class Example {

	void m() {
		System.out.println("anudeep");
	}

	void m1() {
		System.out.println("anudeep rachamalla");
		m();
	}

	public static void main(String[] args) {

		Example e = new Example();
		e.m1();
	}
}
