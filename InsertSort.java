package com.kate.Sort;

import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {
		int[] array = {1,3,5,7,9,2,4,6,8,10};
		insertSort(array);
		System.out.println(Arrays.toString(array));
	}

	public static void insertSort(int[] array) {
		if(array == null || array.length <= 1){
			return;
		}
		for(int i = 1; i < array.length; i++){
			if(array[i-1] > array[i]){
				int temp = array[i];
				int j = i;
				while(j > 0 && array[j-1] > temp){
					array[j] = array[j-1];
					j--;
				}
				array[j] = temp;
			}
		}
	}
}

