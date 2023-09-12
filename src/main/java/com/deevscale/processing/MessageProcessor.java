package com.deevscale.processing;

public class MessageProcessor {

    public int countArrays(int[] arr1, int[] arr2) {

        if (arr1.length == 0 || arr2.length == 0 ) {
            return -1;
        }
        int x = Integer.MAX_VALUE;
        int indexA = 0;
        int indexB = 0;

        while (indexA < arr1.length && indexB < arr2.length) {

            int val = Math.abs(arr1[indexA] - arr2[indexB]);
            x = Math.min(x,val);
            if (arr1[indexA] < arr2[indexB]) {
                indexA++;
            } else {
                indexB++;
            }
        }
        return x;
    }
}
