package com.bl.datastructure;

import java.util.Scanner;

public class MargeSort {
	int[] array;
	int[] tempMergeArr;
	int length;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");

		int n = sc.nextInt();
		System.out.println("Enter elements of array");

		int[] inputArr = new int[n];

		for (int i = 0; i < n; i++) {
			inputArr[i] = sc.nextInt();

		}

		System.out.println("merge sorted: ");
		MargeSort ms = new MargeSort();
		ms.sort(inputArr);
		for (int i : inputArr) {
			System.out.println(i + " ");
		}
	}

	public void sort( int inputArr[]) {
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMergeArr = new int[length];
		divideArray(0,length-1);
	}

	public void divideArray(int lowerIndex, int higherIndex) {
		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			divideArray(lowerIndex, middle);
			divideArray(middle + 1, higherIndex);
			mergeArray(lowerIndex,middle,higherIndex);
		}
	}
	public void mergeArray(int lowerIndex, int middle, int higherIndex) {
		for(int i= lowerIndex; i<= higherIndex;i++) {
			tempMergeArr[i]= array[i];
			
		}
		int i = lowerIndex;
		int j = middle+1;
		int k = lowerIndex;
		
		while(i <=middle && j<= higherIndex) {
			if(tempMergeArr[i]<= tempMergeArr[j]) {
				array[k] = tempMergeArr[i];
				
			}
			else {
				array[k] = tempMergeArr[j];
				j++;
			}
			k++;
		}
		while (i<= middle)  {
			array[k] = tempMergeArr[i];
			k++;
			i++;
		}
	}

}
