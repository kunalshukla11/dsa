package org.kunal;

import java.util.Arrays;

public class TestT {
    public static void main(String[] args) {
        int[] arr = { 5,7,8,9,10,1,2,3,};
        int index=-1;
        int key =5;
       int pivot= findPivot(arr, 0,arr.length-1);

       if(pivot==-1){
          index=  binarysearch(arr, 0,arr.length-1, key);
       }
       if(arr[pivot]==key){
           index=pivot;
       }
       if(key>=arr[0]){
          index= binarysearch(arr,0 ,pivot-1,key);
       }else {
          index= binarysearch(arr, pivot+1,arr.length-1 , key );
       }
        System.out.println(index);

    }

    private static int findPivot(int[] arr, int low, int high) {
        int index=-1;

        while(low<high){
            int mid= (high+low)/2;
            if(arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[low]<arr[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return index;
    }

    private static int binarysearch(int[] arr, int low, int high, int key){
        int index=-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(arr[mid]==key){
                index= mid;
                break;
            }
            if(arr[mid]>key){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return index;
    }

}
