package org.kunal;

import java.util.Arrays;

public class ArrayRotate {
    public static void main(String[] args) {

        int [] nums = {1,2,3,4,5,6,7};
        int k =3;
        int[] newSums = new int[nums.length];
        for (int i = 0; i < nums.length; i ++) {
            int j = (i + k) % nums.length;
            newSums[j] = nums[i];
        }
        for (int i = 0; i < nums.length; i ++) {
            nums[i] = newSums[i];
        }
    }
    }

