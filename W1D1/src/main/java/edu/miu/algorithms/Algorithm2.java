package edu.miu.algorithms;

public class Algorithm2 {

    // Use a nested loop to solve the problem without creating an extra array.
    public static int findLargestDistance(int[] arr) {

        int largestDistance = 0;

        for (int i=0; i<arr.length; i++) {
                for (int j=0; j<arr.length; j++) {
                    if (arr[j] % 2 == 0 && arr[i] % 2 == 0) {
                        if (arr[i] - arr[j] > largestDistance) {
                            largestDistance = Math.abs(arr[i] - arr[j]);
                        }
                    }
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
