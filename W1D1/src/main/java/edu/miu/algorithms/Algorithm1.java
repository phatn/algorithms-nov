package edu.miu.algorithms;

import java.util.ArrayList;
import java.util.List;

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
                if (currentDistance > largestDistance) {
                    largestDistance = currentDistance;
                }
            }
        }
        return largestDistance;
    }

    public static void main(String[] args) {

        System.out.println(findLargestDistance(Utils.generateArray(3000)));
    }
}
