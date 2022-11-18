package edu.miu.algorithms;

import java.util.Arrays;

public class Question2 {

    public static void main(String[] args) {
        int[] A1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
        int[] A2 = { 0, 2, 1, 4, 3, 6, 5, 8, 7, 10, 9, 12, 11, 14, 13, 16, 15 };
        int[] A3 = { 0, 4, 2, 3, 1, 5, 8, 7, 6, 11, 10, 12, 9, 13, 14, 16, 15 };
        int[] A4 = { 0, 5, 6, 7, 4, 2, 3, 1, 8, 11, 13, 14, 16, 10, 12, 11, 9 };

        int count1 = buildHeapBottomUp(A1);
        System.out.println(Arrays.toString(A1));
        System.out.println("Number of comparisons is : " + count1);
        System.out.println();

        int count2 = buildHeapBottomUp(A2);
        System.out.println(Arrays.toString(A2));
        System.out.println("Number of comparisons is : " + count2);
        System.out.println();

        int count3 = buildHeapBottomUp(A3);
        System.out.println(Arrays.toString(A3));
        System.out.println("Number of comparisons is : " + count3);
        System.out.println();

        int count4 = buildHeapBottomUp(A4);
        System.out.println(Arrays.toString(A4));
        System.out.println("Number of comparisons is : " + count4);
        System.out.println();

    }

    public static int buildHeapBottomUp(int[] A) {
        int count = 0;
        for(int i = A.length / 2; i >= 1; i--) {
            count += downHeap(A, i);
        }
        return count;
    }

    private static int downHeap(int[] A, int i) {
        int j = i;
        Counter counter = new Counter();
        int k = maxChildIndex(A, j, counter);
        while(k != 0) {
            swap(A, j, k);
            j = k;
            k = maxChildIndex(A, j, counter);
        }
        return counter.value;
    }

    private static int maxChildIndex(int[] A, int j, Counter counter) {
        int max = A[j];
        int maxIndex = j;
        int len = A.length;
        boolean hasChildMax = false;
        j = j * 2;
        while(j < len) {
            if(max < A[j]) {
                max = A[j];
                maxIndex = j;
                counter.value++;
                hasChildMax = true;
            }

            if(j + 1 < len && max < A[j + 1]) {
                max = A[j + 1];
                maxIndex = j + 1;
                hasChildMax = true;
                counter.value++;
            }

            j = j * 2;
        }

        if(hasChildMax) {
            return maxIndex;
        }
        return 0;
    }

    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}

class Counter {
    int value = 0;
}
