package com.kate.Sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = {1,3,5,7,9,2,4,6,8,10};
		bubbleSort(array);
		System.out.println(Arrays.toString(array));
	}

	public static void bubbleSort(int[] array) {
		if(array == null || array.length <= 1){
			return;
		}
		int temp = 0;
		for(int i = 0; i < array.length-1; i++){
			for(int j = 0; j < array.length-1-i; j++){
				if(array[j] > array[j+1]){
					temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;					
				}
			}
		}
	}

}
