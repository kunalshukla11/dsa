package org.kunal;

import java.util.Arrays;

public class MsysTest {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5};
        int rotateBy= 1;
        reverseArr(arr, 0,rotateBy-1);
        reverseArr(arr, rotateBy, arr.length-1);
        reverseArr(arr,0 , arr.length-1 );
        System.out.println(Arrays.toString(arr));
    }

    static void reverseArr(int []arr , int start, int end){
        while (start<end){
            int temp= arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
    }

}
