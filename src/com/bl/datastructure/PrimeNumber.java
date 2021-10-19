package com.bl.datastructure;

import java.util.Scanner;

public class PrimeNumber {
	public static int[] isPrime() {

		int n = 1000;
		int d = 0;
		int[] a = new int[n / 2];

		for (int i = 2; i < n; i++) { // i= 2, 3, 4, 5,6

			boolean flag = true;

			for (int j = 2; j < i; j++) { //

				if (i % j == 0) { // 3 % 2 == 0, 4 % 2 == 0, 5%4==0

					flag = false;

					break;

				}
			}
			if (flag) {

				a[d] = i; // a[d]= 2, 3, 5

				d++; // d= 1,2,3,4,5

			}
		}
		return a;

	}

	public static void main(String[] args) {
		int d[] = isPrime();
		for (int k = 0; k < d.length; k++) {
			if (d[k] != 0) {
				System.out.println(d[k]);
			}
		}

	}
}
