package com.kate.Sort;

import java.util.Arrays;

public class SelectSort {

	public static void main(String[] args) {
		int[] array = {1,3,5,7,9,2,4,6,8,10};
		selectSort(array);
		System.out.println(Arrays.toString(array));
	}

	public static void selectSort(int[] array) {
		if(array == null || array.length <= 1){
			return;
		}
		for(int i = 0; i < array.length-1; i++){
			int k = i;
			for(int j = k + 1; j < array.length; j++){
				if(array[j] < array[k]){
					k = j;
				}
			}
			if(k != i){
				int temp = array[i];
				array[i] = array[k];
				array[k] = temp;
			}
		}
	}

}
