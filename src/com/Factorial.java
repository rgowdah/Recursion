package com;

public class Factorial {
	public static int factorial(int n){
		System.out.println(n);
		if (n==0) return 1;
		return n*factorial(n-1);
	}
	public static void main(String[] args) {
		System.out.println(Factorial.factorial(5));
	}
}
