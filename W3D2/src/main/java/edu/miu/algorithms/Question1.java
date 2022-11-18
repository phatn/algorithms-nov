package edu.miu.algorithms;

import java.util.Arrays;

/**
 * Top-Down Heap Building
 */
public class Question1 {

    public static void main(String[] args) {
        int[] A1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
        int[] A2 = { 0, 2, 1, 4, 3, 6, 5, 8, 7, 10, 9, 12, 11, 14, 13, 16, 15 };
        int[] A3 = { 0, 4, 2, 3, 1, 5, 8, 7, 6, 11, 10, 12, 9, 13, 14, 16, 15 };
        int[] A4 = { 0, 5, 6, 7, 4, 2, 3, 1, 8, 11, 13, 14, 16, 10, 12, 11, 9 };

        int count1 = buildHeapTopDown(A1);
        System.out.println(Arrays.toString(A1));
        System.out.println("Number of comparisons is : " + count1);
        System.out.println();

        int count2 = buildHeapTopDown(A2);
        System.out.println(Arrays.toString(A2));
        System.out.println("Number of comparisons is : " + count2);
        System.out.println();

        int count3 = buildHeapTopDown(A3);
        System.out.println(Arrays.toString(A3));
        System.out.println("Number of comparisons is : " + count3);
        System.out.println();

        int count4 = buildHeapTopDown(A4);
        System.out.println(Arrays.toString(A4));
        System.out.println("Number of comparisons is : " + count4);
        System.out.println();

    }

    public static int buildHeapTopDown(int[] A) {
        int count = 0;
        for(int i = 1; i < A.length; i++) {
            count += upHeap(A, i);
        }
        return count;
    }

    private static int upHeap(int[] A, int i) {
        int count = 0;
        int j = i;
        while(j > 1 && A[j/2] < A[j]) {
            count++;
            swap(A, j, j/2);
            j = j / 2;
        }
        return count;
    }

    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
