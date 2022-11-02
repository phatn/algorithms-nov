package edu.miu.algorithms;

public class Algorithm2 {

    // Use a nested loop to solve the problem without creating an extra array.
    public static int findLargestDistance(int[] arr) {

        int largestDistance = 0;

        for (int i=0; i<arr.length; i++) {
            if (arr[i] % 2 == 0) {
                for (int j=0; j<arr.length; j++) {
                    if (arr[j] % 2 == 0) {
                        if (arr[i] - arr[j] > largestDistance) {
                            largestDistance = Math.abs(arr[i] - arr[j]);
                        }
                    }
                }
            }
        }

        return largestDistance;
    }

    public static void main(String[] args) {

        System.out.println(findLargestDistance(Utils.generateArray(1000)));

    }
}
