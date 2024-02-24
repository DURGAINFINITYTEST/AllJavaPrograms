package tests;

import java.util.Random;

public class Fibonacci {

	public static void main(String[] args) {

		int[] fib = new int[10];
		fib[0] = 0;
		fib[1] = 1;

		

		System.out.print(fib[0] + " " + fib[1] + " ");

		for (int i = 2; i < 10; i++) {

			fib[i] = fib[i - 1] + fib[i - 2];

			System.out.print(fib[i] + " ");
		}

		System.out.println(Math.random());

	}

}
