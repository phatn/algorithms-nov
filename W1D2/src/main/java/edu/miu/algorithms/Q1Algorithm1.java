package edu.miu.algorithms;

public class Q1Algorithm1 {

    // Use three loops one after another
    public static int findThirdLargest(int[] arr) {

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        int firstMaxIndex = 0;
        int secondMaxIndex = 0;

        for (int i=0; i<arr.length; i++){
            int currentElement = arr[i];
            if(firstMax < currentElement) {
                firstMax = currentElement;
                firstMaxIndex = i;
            }
        }

        for (int i=0; i<arr.length; i++){
            int currentElement = arr[i];
            if (i != firstMaxIndex) {
                if(secondMax < currentElement ) {
                    secondMax = currentElement;
                    secondMaxIndex = i;
                }
            }
        }

        for (int i=0; i<arr.length; i++){
            int currentElement = arr[i];
            if (i != firstMaxIndex && i != secondMaxIndex) {
                if(thirdMax < currentElement) {
                    thirdMax = currentElement;
                }
            }
        }

        return thirdMax;
    }

    public static void main(String[] args) {

        int[] sizes = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000};
        for(int size : sizes) {
            int[] arr = Utils.generateArray(size, 10000);
            long startTime = System.nanoTime();
            int thirdLargestElement = findThirdLargest(arr);
            long endTime = System.nanoTime();
            System.out.printf("The largest distance of array size %d is  %d, took %d nanosecond", arr.length, thirdLargestElement, (endTime - startTime));
            System.out.println();
        }
    }
}
