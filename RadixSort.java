package com.kate.Sort;

import java.util.Arrays;

public class RadixSort {

	public static void main(String[] args) {
		int[] array = {1234,235,555,71,94,242,423,65,87,10,8,0};
		radixSort(array);
		System.out.println(Arrays.toString(array));		
	}

	
	public static void radixSort(int[] array) {
		if(array == null || array.length <= 1){
			return;
		}
		int maxNum = 1;
		for(int i = 0; i < array.length; i++){			
			maxNum = Math.max(maxNum, getNumOfBit(array[i]));
		}
		sort(array, 10, maxNum);		
	}
	
	public static int getNumOfBit(int num) {
		int count = 1;
		num = Math.abs(num);
		while(num / 10 > 0){
			count++;
			num /= 10;			
		}
		return count;
	}

	public static void sort(int[] data, int radix, int d) {  
        int[] tmp = new int[data.length];  
        int[] buckets = new int[radix];  
        for (int i = 0, rate = 1; i < d; i++) {     
            Arrays.fill(buckets, 0);  
            //System.arraycopy(data, 0, tmp, 0, data.length);  
            tmp = Arrays.copyOf(data, data.length);
            for (int j = 0; j < data.length; j++) {  
                int subKey = (tmp[j] / rate) % radix;  
                buckets[subKey]++;  
            }    
            for (int j = 1; j < radix; j++) {  
                buckets[j] = buckets[j] + buckets[j - 1];  
            }  
            for (int m = data.length - 1; m >= 0; m--) {  
                int subKey = (tmp[m] / rate) % radix;  
                data[--buckets[subKey]] = tmp[m];  
            }  
            rate *= radix;  
        }  
  
    }  
}
