package edu.miu.algorithms;

import java.util.Arrays;

public class Algorithm5 {

    public static void main(String[] args) {
        int[] sizes = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000};
        for(int size : sizes) {
            int[] a = Utils.generateArray(size);
            long startTime = System.nanoTime();
            int largestDistance = largestDistanceTwoEven(a);
            long endTime = System.nanoTime();
            System.out.printf("The largest distance of array size %d is  %d, took %d ms", a.length, largestDistance, (endTime - startTime)/1000000);
            System.out.println();
        }

    }

    public static int largestDistanceTwoEven(int[] a) {
        int[] evenArr = Arrays.stream(a).filter(e -> e % 2 == 0).toArray();
        int min = 0, max = 0;
        for(int num : evenArr) {
            if(min > num) {
                min = num;
            }
            if(max < num) {
                max = num;
            }
        }
        return max - min;
    }
}
