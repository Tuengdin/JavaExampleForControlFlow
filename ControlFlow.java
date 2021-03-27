package com.aomruk.helloWorld;

public class ControlFlow {
	public static void main(String[] args) {
		int score = 30;
		boolean isHandSome = true;
		if (score >= 80 || isHandSome)
			System.out.println("Good");
		else if (score >= 50)
			System.out.println("normal");
		else
			System.out.println("fail");
				
	}
}
