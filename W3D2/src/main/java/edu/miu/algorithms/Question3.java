package edu.miu.algorithms;

import java.util.Arrays;

public class Question3 {


    public static void main(String[] args) {
        int[] A = { 0, 5, 6, 7, 4, 2, 3, 1, 8, 11, 13, 14, 16, 10, 12, 11, 9 };
        Question2.buildHeapBottomUp(A);
        sort(A);
        System.out.println(Arrays.toString(A));

    }

    public static void heapify(int A[], int len, int i){
        int  maxIndex = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        if(leftChild < len && A[leftChild] > A[maxIndex]){
            maxIndex = leftChild;
        }
        if(rightChild < len && A[rightChild] > A[maxIndex]){
            maxIndex = rightChild;
        }

        if(maxIndex != i){
            swap(A, i, maxIndex);
            heapify(A, len, maxIndex);
        }
    }

    public static void sort(int A[]){
        int len = A.length;

        int i = (len / 2) - 1;
        while(i >= 0){
            heapify(A, len, i);
            i--;
        }

        for(i = len - 1; i > 0; i--){
            swap(A, 0, i);
            heapify(A, i, 0);
        }
    }

    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

}
