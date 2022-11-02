package edu.miu.algorithms;

public class Utils {

    public static int[] generateArray(int n) {
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = (int)(Math.random() * n);
        }
        return a;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
