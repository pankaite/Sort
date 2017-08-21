package com.kate.Sort;

import java.util.Arrays;

public class ShellSort {

	public static void main(String[] args) {
		int[] array = { 1, 3, 5, 7, 9, 2, 4, 6, 8, 10 };
		shellSort(array);
		System.out.println(Arrays.toString(array));
	}

	public static void shellSort(int[] array) {
		int step = array.length / 2;
		while (step >= 1) {
			// for(int i = 0;i < arrays.length; i++){
			// for(int j = i; j < array.length - step; j += step){
			// if(array[j] > array[j+step]){
			// int temp = array[j+step];
			// array[j+step] = array[j];
			// array[j] = temp;
			// }
			// }
			for (int i = 0; i < step; i++) {
				for (int j = i + step; j < array.length; j += step) {
					if (array[j - step] > array[j]) {
						int temp = array[j];
						int k = j;
						while (k - step >= 0 && array[k - step] > temp) {
							array[k] = array[k - step];
							k -= step;
						}
						array[k] = temp;
					}
				}
			}
			step /= 2;
		}
	}

}
