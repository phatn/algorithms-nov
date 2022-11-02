package edu.miu.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Algorithm1 {

    //Create a new array consisting of even numbers only.
    //Then use nested loops to solve the problem using
    //the newly created array of even numbers only.
    public static int findLargestDistance(int[] arr) {

        List<Integer> newlyArray = new ArrayList<>();

        for (int i=0; i<arr.length; i++) {
            if (arr[i] % 2 == 0) {
                newlyArray.add(arr[i]);
            }
        }
        int largestDistance = 0;

        for (int i=0; i<newlyArray.size(); i++) {
            for (int j=0; j<newlyArray.size(); j++) {
                int currentDistance =  Math.abs(newlyArray.get(i) - newlyArray.get(j));
                largestDistance = Math.max(currentDistance, largestDistance);
            }
        }
        return largestDistance;
    }

    public static void main(String[] args) {

        int[] sizes = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000};
        for(int size : sizes) {
            int[] a = Utils.generateArray(size);
            long startTime = System.nanoTime();
            int largestDistance = findLargestDistance(a);
            long endTime = System.nanoTime();
            System.out.printf("The largest distance of array size %d is  %d, took %d nanosecond", a.length, largestDistance, (endTime - startTime));
            System.out.println();
        }
    }
}
