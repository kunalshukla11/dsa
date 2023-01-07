package org.kunal;

public class TwoSumInArrayUsingLandR {
    public static void main(String[] args) {
        int[] arr= { 0, 5, 8 , 11,13,-10,-1};
        int pivot= findPivot(arr);
        int sum=6;
        if(pivot==-1){
            System.out.println(findSumInSortedArray(arr ,0,arr.length-1, sum));
        }else{
            int l=pivot;
            int r=pivot+1;
            while (l<r){
                if(arr[l]+arr[r]==sum){
                    System.out.println(true);
                    break;
                }
                if(arr[l]+arr[r]>sum){
                    l--;
                    if(l<0){
                        l=r;
                        r=arr.length-1;
                        System.out.println(findSumInSortedArray(arr,l,r,sum));
                    }
                }else{
                    r++;
                    if(r>arr.length-1){
                        r=l;
                        l=0;
                        System.out.println(findSumInSortedArray(arr,l,r,sum));
                    }
                }
            }
        }



    }

    private static boolean findSumInSortedArray(int[] arr, int l, int r, int sum) {
        while(l<r){
            if(arr[l]+arr[r]==sum){
                return true;
            }
            if(arr[l]+arr[r]>sum){
                r--;
            }else{
                l++;
            }
        }
        return false;

    }

    private static int findPivot(int[] arr) {
        int pivot = -1;
        int l =0;
        int h= arr.length-1;
        while(l<h){
            int mid= (l+h)/2;
            if (arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]>arr[l]){
                l=mid+1;
            }else {
                h=mid-1;
            }
        }
        return pivot;
    }

}
