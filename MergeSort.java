package com.kate.Sort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] array = {1,3,5,7,9,2,4,6,8,10};
		mergeSort(array);
		System.out.println(Arrays.toString(array));
	}

	public static void mergeSort(int[] array) {
		if(array == null || array.length <= 1){
			return;
		}
		sort(array, 0, array.length-1);
	}

	public static void sort(int[] array, int low, int high) {
		int mid = (low + high) / 2;  
        if (low < high) {  
            // 左边  
            sort(array, low, mid);  
            // 右边  
            sort(array, mid + 1, high);  
            // 左右归并  
            merge(array, low, mid, high);  
        }  
	}

	public static void merge(int[] array, int low, int mid, int high) {
		int[] temp = new int[high - low + 1];  
        int i = low;// 左指针  
        int j = mid + 1;// 右指针  
        int k = 0;  
        while (i <= mid && j <= high) {  
            if (array[i] < array[j]) {  
                temp[k++] = array[i++];  
            } else {  
                temp[k++] = array[j++];  
            }  
        }  
        while (i <= mid) {  
            temp[k++] = array[i++];  
        }  
        while (j <= high) {  
            temp[k++] = array[j++];  
        }  
        for (k = 0; k < temp.length; k++) {  
            array[k + low] = temp[k];  
        }  
	}

}
