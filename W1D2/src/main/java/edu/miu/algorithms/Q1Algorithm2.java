package edu.miu.algorithms;

import java.util.Arrays;

public class Q1Algorithm2 {

    private static int getThirdLargest(int[] arr) {
        int max=Integer.MIN_VALUE;
        int preMax=Integer.MIN_VALUE;
        int prePreMax=Integer.MIN_VALUE;

        for (int a : arr) {
            if (a >= max) {
                prePreMax = preMax;
                preMax = max;
                max = a;
            } else if (a >= preMax) {
                prePreMax = preMax;
                preMax = a;
            } else if (a >= prePreMax) {
                prePreMax = a;
            }
        }
        return prePreMax;
    }

    public static void main(String[] args) {
            int[] arr = Utils.generateArray(10,20);
            System.out.println(Arrays.toString(arr));
            long startTime = System.nanoTime();
            int thirdLargest = getThirdLargest(arr);
            long endTime = System.nanoTime();
            System.out.printf("The third largest number of th array size %d is  %d, took %d nanosecond", arr.length, thirdLargest, (endTime - startTime));
            System.out.println();
    }
}
