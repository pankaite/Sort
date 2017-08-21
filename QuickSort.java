package com.kate.Sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] array = {1,3,5,7,9,2,4,6,8,10};
		quickSort(array);
		System.out.println(Arrays.toString(array));
	}
	
	
	public static void quickSort(int[] array) {
		if(array == null || array.length <= 1){
			return;
		}
		sort(array, 0, array.length - 1);
	}


	public static int partition(int []array,int low,int high){
        //固定的切分方式
        int key=array[low];
        while(low<high){
            while(array[high]>=key&&high>low){//从后半部分向前扫描
                high--;
            }
            array[low]=array[high];
            while(array[low]<=key&&high>low){//从前半部分向后扫描
                low++;
            }
            array[high]=array[low];
        }
        array[high]=key;
        return high;
    }
    
    public static void sort(int[] array,int low ,int high){
        if(low>=high){
            return ;
        }
        int index=partition(array,low,high);
        sort(array,low,index-1);
        sort(array,index+1,high); 
    }
}
