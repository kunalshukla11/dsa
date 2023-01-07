package org.kunal;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6};
        int i= binarySearch(arr,0,5,-1);
        System.out.println(i);

    }

    //Iterative way
    private static int binarySearch(int []a , int l, int h , int key){
        int index = -1;
        while(l<=h){
            int mid = (l+h)/2;
            if (a[mid] > key) {
                h=mid-1;
            }else if(a[mid]<key){
                l=mid+1;
            }else if(a[mid]==key){
                index= mid;
                break;
            }
        }
        return index;
    }

    //Recursive way
     private static int binarySearchB(int[] arr, int l , int h, int key){
         int mid = (h+l)/2;
        if(h<l){
            return -1;
        }

        if(arr[mid]==key){
            return mid;
        }
       else if(arr[mid]>key){
            return binarySearchB(arr, l , mid-1, key);
        }else {
            return binarySearchB(arr,mid+1,h, key);

        }


     }


}
