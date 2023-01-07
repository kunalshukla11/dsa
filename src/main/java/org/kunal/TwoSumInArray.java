package org.kunal;

public class TwoSumInArray {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};
        int sum= 4;
        for(int i=0 ;i<arr.length-1;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println("yes");
                }
            }
        }
        System.out.println("no");
    }
}
