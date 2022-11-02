package edu.miu.algorithms;

import java.util.Arrays;

public class Algorithm4 {

    //Use Streams to find the max and min. Compute max – min
    public static int algorithm4(int[] randomAry){
        int max= Arrays.stream(randomAry).filter(Utils::isEven).max().getAsInt();
        int min=Arrays.stream(randomAry).filter(Utils::isEven).min().getAsInt();

        int maxDistance=max-min;
        return maxDistance;
    }

    public static void main(String[] args) {
        int[] sizes = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000};
        for(int size : sizes) {
            int[] arr = Utils.generateArray(size);
            long startTime = System.nanoTime();
            int largestDistance = algorithm4(arr);
            long endTime = System.nanoTime();
            System.out.printf("The largest distance of array size %d is  %d, took %d nanosecond", arr.length, largestDistance, (endTime - startTime));
            System.out.println();
        }
    }
}
