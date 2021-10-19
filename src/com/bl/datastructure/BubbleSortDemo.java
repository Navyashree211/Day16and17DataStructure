package com.bl.datastructure;

import java.util.Scanner;

public class BubbleSortDemo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");

		int n = sc.nextInt();
		System.out.println("Enter elements of array");

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();

		}

		int temp;
//		int[] a = { 36, 19, 29, 12, 5 };
		for (int i = 0; i < a.length; i++) {
			int flag = 0;
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0) {
				break;
			}
		}

		System.out.println("Bubble Sorted array is: ");
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j] + " ");
		}

	}

}