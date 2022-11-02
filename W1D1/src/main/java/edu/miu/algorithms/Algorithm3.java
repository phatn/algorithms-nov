package edu.miu.algorithms;

public class Algorithm3 {
    //Use one loop. Find max and min of even integers. Compute max – min.
    public static int algorithm3(int[] randomArray){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for (int i=0; i<randomArray.length; i++){
            if(randomArray[i]%2==0) {
                if(max<randomArray[i])
                    max=randomArray[i];
                if(min>randomArray[i])
                    min=randomArray[i];
            }
        }

        int maxDistance=max-min;
        return maxDistance;
    }

    public static void main(String[] args) {

        int[] sizes = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000};
        for(int size : sizes) {
            int[] arr = Utils.generateArray(size);
            long startTime = System.nanoTime();
            int largestDistance = algorithm3(arr);
            long endTime = System.nanoTime();
            System.out.printf("The largest distance of array size %d is  %d, took %d nanosecond", arr.length, largestDistance, (endTime - startTime));
            System.out.println();
        }
    }
}
